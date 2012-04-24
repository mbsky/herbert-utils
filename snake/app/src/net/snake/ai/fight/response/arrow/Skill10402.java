package net.snake.ai.fight.response.arrow;

import net.snake.netio.ServerResponse;


/**
 * 连珠箭
 * 弓箭ID（int，为道具ID）,功方技能ID(int),攻方ID(int),箭射目标落点X（short），
 * 箭射目标落点Y（short）,攻击夹角大小（short,0-360）,弹道数量（byte）【注意箭射点可能位于屏幕或地图之外】
 * Copyright (c) 2011 Kingnet
 * @author serv_dev
 */
public class Skill10402 extends ServerResponse {
	public Skill10402(int specialEfficiencyId,int skillId,int attacker,int tarX,int tarY) {
		setMsgCode(10402);
		writeInt(specialEfficiencyId);
		writeInt(skillId);
		writeInt(attacker);

		writeShort(tarX);
		writeShort(tarY);
	}
}
