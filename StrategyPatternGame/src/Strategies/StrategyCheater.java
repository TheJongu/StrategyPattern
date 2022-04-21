package Strategies;

public class StrategyCheater extends Strategy {

	public StrategyCheater(String aPlayerName) {
		super(aPlayerName);
	}
	
	@Override
	public int playStrategy() {
		
		rollDice();
		rollDice();
		rollDice();
		// Pretend to have rolled a 10
		return 10;
	}

}
