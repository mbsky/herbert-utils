package lion.netty;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lion.core.CallPool;
import lion.core.ChannelClose_C2S;
import lion.core.IGameService;

public class NettySeverChannelHandler extends SimpleChannelHandler {

	public static Logger logger = LoggerFactory.getLogger(NettySeverChannelHandler.class);

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {
		if (e.getMessage() != null) {
			CallPool.execute(e.getChannel(), e.getMessage());
		} else {
			logger.error("", e);
		}
	}

	@Override
	public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
		CallPool.execute(e.getChannel(), new ChannelClose_C2S());
		super.channelClosed(ctx, e);
	}

	public void init(Class<? extends IGameService> serviceClass) {
		CallPool.init(serviceClass);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
		if (e.getCause() instanceof ClosedChannelException) {
			logger.info("ClosedChannelException: {}", e);
		} else if (e.getCause() instanceof IOException) {
			logger.info("IOException: {}", e.getCause().getMessage());
		} else {
			logger.warn("Exception: {}", e.getCause());
		}
		if (e.getChannel().isOpen()) {
			e.getChannel().close();
		}
	}

}