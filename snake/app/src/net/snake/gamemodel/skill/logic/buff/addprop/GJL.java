package net.snake.gamemodel.skill.logic.buff.addprop;

import net.snake.ai.fight.controller.EffectController;
import net.snake.consts.Property;
import net.snake.gamemodel.hero.logic.PropertyEntity;
import net.snake.gamemodel.skill.bean.EffectInfo;
import net.snake.gamemodel.skill.logic.buff.Buff;


/**
 * 攻击力增强
 * 
 * Copyright (c) 2011 Kingnet
 * @author serv_dev
 */
public class GJL extends Buff {

	public GJL(EffectInfo effect) {
		super(effect);
	}
	
	@Override
	public boolean enter(EffectController controller) {
		controller.getVo().getPropertyAdditionController().addChangeListener(this);
		return true;
	}
	
	@Override
	public PropertyEntity getPropertyEntity() {
		PropertyEntity pe = new PropertyEntity();
		pe.addExtraProperty(Property.GJL, effect.getPercent()/100);
		return pe;
	}
	
	@Override
	public boolean leave(EffectController controller) {
		controller.getVo().getPropertyAdditionController().removeChangeListener(this);
		return true;
	}
	
	public static Buff getInstance(EffectInfo effect) {
			return new GJL(effect);
	}
}
