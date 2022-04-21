package Strategies;

public class StrategyKeepAbove5 extends Strategy {

	
	public StrategyKeepAbove5(String aPlayerName) {
		super(aPlayerName);
	}

	@Override
	public int playStrategy() {
		// While there are still rolls left, rollDice Return if higher as 5
		while(AmountRollsLeft > 0 && this.CurrentAmount < 5) {
			CurrentAmount = rollDice();
		}
		return CurrentAmount;
	}
}
