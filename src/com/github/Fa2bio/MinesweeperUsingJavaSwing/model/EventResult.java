package com.github.Fa2bio.MinesweeperUsingJavaSwing.model;

public class EventResult {
	
	private final boolean winner;
	
	public EventResult(boolean won) {
		this.winner = won;
	}

	public boolean isWinner() {
		return winner;
	}
	
}
