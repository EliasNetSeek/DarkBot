package org.darkstorm.minecraft.darkbot.protocol.generator.condition;

import java.util.Collection;

public interface AndCondition extends Condition {
	public Collection<Condition> getConditions();
}