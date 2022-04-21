package Game;

import java.util.ArrayList;
import java.util.List;

import Strategies.Strategy;
import Strategies.StrategyCheater;
import Strategies.StrategyKeepAbove5;
import Strategies.StrategyRollAgain;

public class Game {

	public static void main(String[] args) {
		
		List<Player> playerList = new ArrayList<Player>();
		List<Integer> valueList = new ArrayList<Integer>();
		playerList.add(new Player("Maus", new Strategy("Einmal W�rfeln")));
		playerList.add(new Player("Hund",new StrategyRollAgain("Dreimal W�rfeln")));
		playerList.add(new Player("Fuchs",new StrategyKeepAbove5("�ber F�nf Merken")));
		playerList.add(new Player("Wolf",new StrategyCheater("Cheater")));
		
		for(Player p : playerList) {
			valueList.add(p.play());
		}
	}
	
	 
	
	
	
	
}
