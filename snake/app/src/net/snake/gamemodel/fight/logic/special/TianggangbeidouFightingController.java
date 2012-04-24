package net.snake.gamemodel.fight.logic.special;
import net.snake.gamemodel.common.response.PrompMsg;
import net.snake.gamemodel.common.response.TipMsg;
import net.snake.gamemodel.team.bean.TeamFighting;
import net.snake.gamemodel.team.logic.Team;
import net.snake.gamemodel.team.logic.TeamFightingController;
import net.snake.netio.ServerResponse;

/**
 * 天罡北斗阵	通过使用阵法秘籍书《天罡北斗阵》习得	队伍满7人，才能开启

 * @author serv_dev
 *
 */
public class TianggangbeidouFightingController extends TeamFightingController {

	public TianggangbeidouFightingController(TeamFighting tf) {
		super(tf);
	}

	@Override
	public ServerResponse checkOpenCondition(Team t) {
	    if(t.getTeamPopulation()!=7){
	     return 	new PrompMsg(TipMsg.MSGPOSITION_ERRORTIP,1067,"7");
	   
	    }
		return null;
	}

	@Override
	public boolean teamNumEfectProperty() {
		return false;
	}
}
