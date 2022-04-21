package Strategies;

import java.util.Random;

public class Strategy {

	int AmountRollsLeft = 3;
	int CurrentAmount = 0;
	private String StrategyName = "NoName";
	
	public Strategy(String aStrategyName) {
		this.StrategyName = aStrategyName;
	}
	
	/**
	 * Roll a dice
	 * @return int between 1-10
	 */
	protected final int rollDice() {
		int value = 0;
		if(AmountRollsLeft > 0) {
			Random randomGenerator = new Random();
			// roll from 1-10
			value = randomGenerator.nextInt(10) + 1;
			System.out.println("\tDie Strategie '" + this.StrategyName + "' würfelte eine " + value);
			AmountRollsLeft--;
		}
		return value;
	}

	/**
	 * A player can roll 3 times, and can choose to return the rolled value at anytime
	 * @return value decided by player
	 */
	public int playStrategy() {
		return rollDice(); 
	}
	
	public String getPlayerName() {
		return StrategyName;
	}
}
