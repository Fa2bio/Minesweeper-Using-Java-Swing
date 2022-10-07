package com.github.Fa2bio.MinesweeperUsingJavaSwing.model;

@FunctionalInterface
public interface ObserverField {
	public void eventHappened(Field field, EventField event);
}
