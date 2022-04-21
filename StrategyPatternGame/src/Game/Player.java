package Game;

import Strategies.Strategy;

public class Player {

	Strategy strategy;
	String playerName = "";
	
	public Player(String aPlayerName, Strategy aStrategy) {
		playerName = aPlayerName;
		this.strategy = aStrategy;
	}
	
	public int play() {
		int rolledValue = strategy.playStrategy();
		System.out.println(playerName + ": Ich habe eine " + rolledValue + " gewürfelt.\n");
		return rolledValue;
	}
}
