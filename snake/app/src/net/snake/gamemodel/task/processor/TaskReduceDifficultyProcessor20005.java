package net.snake.gamemodel.task.processor;

import net.snake.ann.MsgCodeAnn;
import net.snake.consts.GoodItemId;
import net.snake.gamemodel.common.processor.CharacterMsgProcessor;
import net.snake.gamemodel.common.response.PrompMsg;
import net.snake.gamemodel.common.response.TipMsg;
import net.snake.gamemodel.goods.logic.CharacterGoodController;
import net.snake.gamemodel.hero.bean.Hero;
import net.snake.gamemodel.task.bean.CharacterTask;
import net.snake.gamemodel.task.logic.CharacterTaskController;
import net.snake.gamemodel.task.response.GetLoopTaskMsg20000;
import net.snake.netio.message.RequestMsg;

/**
 * 降低任务难度20005
 * 
 * @author serv_dev
 * 
 */
@MsgCodeAnn(msgcode = 20005, accessLimit = 1000)
public class TaskReduceDifficultyProcessor20005 extends CharacterMsgProcessor {

	@Override
	public void process(Hero character, RequestMsg request) throws Exception {
		int taskId = request.getInt();
		CharacterTaskController characterTaskController = character.getTaskController();
		CharacterTask characterTask = characterTaskController.getCurrTaskById(taskId);
		if (characterTask == null) {
			character.sendMsg(new GetLoopTaskMsg20000(20000));
			return;
		}

		CharacterGoodController characterGoodController = character.getCharacterGoodController();
		if (!characterGoodController.isEnoughGoods(GoodItemId.SSFEL, 1)) {
			character.sendMsg(new GetLoopTaskMsg20000(20017));
			return;
		}

		if (characterTask.getTaskVO().downRandomCondition(characterTask)) {
			characterGoodController.deleteGoodsFromBag(GoodItemId.SSFEL, 1);
			character.sendMsg(new PrompMsg(TipMsg.MSGPOSITION_RIGHT, 1038, characterTask.getTmpConditionGrade() + ""));
		}
	}
}
