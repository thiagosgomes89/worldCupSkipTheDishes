package worldCup;

import java.util.Random;
import java.util.Map.Entry;

public class MatchResult {

	private static Random generateResults = new Random();
	
	public static String matchResult (String [] team) {
		
		//Generate the Goals of each team
		
		// Variable a for the Team one
		int a = generateResults.nextInt(5);
		
		// Variable b for the Team two
		int b = generateResults.nextInt(5);
		
		// 3 points to Team one in case to defeat the Team two
		if (a > b) {
			for (Entry<String, Integer> entry : Points.points.entrySet()) {
				if (team[0].equals(entry.getKey())) {
					entry.setValue(entry.getValue() + 3);
					break;
				}
			}
			
		// 3 points to Team two	in case to defeat the Team one
		} else if (a < b) {
			for (Entry<String, Integer> entry : Points.points.entrySet()) {
				if (team[1].equals(entry.getKey())) {
					entry.setValue(entry.getValue() + 3);
					break;
				}
			}
			
		// 1 point to Team one and Team two	in case of Draw
		} else {
			for (Entry<String, Integer> entry : Points.points.entrySet()) {
				if (team[0].equals(entry.getKey())) {
					entry.setValue(entry.getValue() + 1);
				}
				if (team[1].equals(entry.getKey())) {
					entry.setValue(entry.getValue() + 1);
				}
			}
		}
		
		// Returning Score Game
		String result = team[0] + " " + a +" x " + b + " " + team[1];
		return result;
	}
}
