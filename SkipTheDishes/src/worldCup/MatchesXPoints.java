package worldCup;

import java.util.Map.Entry;

public class MatchesXPoints {

	public static void main(String[] args) {
		Points.pointsInitialize();
		
		// A vector with a size of 2 teams playing in that moment
		String [] teamsPlayers = new String [2];
		
		//All teams against with other in home and away - (only do not play with the own team itself)
		System.out.println("Result Games");
		for (Entry<Integer, String> entryTeam1 : AddTeams.teamsGroups.entrySet()) {
			
			//Put the first team to play
			teamsPlayers[0] = entryTeam1.getValue();
			
			for (Entry<String, Integer> entryTeam2 : Points.points.entrySet()) {	
				if (!(entryTeam1.getValue().equals(entryTeam2.getKey()))) {
					
					//Put the second team to play
					teamsPlayers[1] = entryTeam2.getKey();								
					
					//2 teams match - Get the result of the game and save the points
					System.out.println(MatchResult.matchResult(teamsPlayers));
				}
			}	
		}
		
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		
		System.out.println("Team Points - World Cup");
		
		for (Entry<String, Integer> entry : Points.points.entrySet()) {	
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
