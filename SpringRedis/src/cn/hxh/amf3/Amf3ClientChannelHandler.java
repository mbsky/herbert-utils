package cn.hxh.amf3;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;

import cn.hxh.core.ClientCallPool;

public class Amf3ClientChannelHandler extends SimpleChannelUpstreamHandler {

	private static final Logger logger = Logger
			.getLogger(Amf3ClientChannelHandler.class);

	private final AtomicInteger seqNum = new AtomicInteger(0);

	public int getNextSeqId() {
		return seqNum.getAndIncrement();
	}

	@Override
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
		logger.info("Channel connected");
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
			throws Exception {
		if (e.getMessage() != null) {
			ClientCallPool.execute(e.getChannel(), e.getMessage());
		} else {
			logger.error("message is null!");
		}
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e)
			throws Exception {
		logger.error("Unhandled exception in handler", e.getCause());
		e.getChannel().close();
		throw new Exception(e.getCause());
	}
}
