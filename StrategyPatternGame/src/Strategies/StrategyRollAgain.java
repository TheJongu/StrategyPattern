package Strategies;

/**
 * Always rolls 3 times
 * @author jonas
 *
 */
public class StrategyRollAgain extends Strategy {

	public StrategyRollAgain(String aPlayerName) {
		super(aPlayerName);
	}

	@Override
	public int playStrategy() {
		// Roll 3 Times and use the last roll.
		super.playStrategy();
		super.playStrategy();
		return super.playStrategy();
	}
}
