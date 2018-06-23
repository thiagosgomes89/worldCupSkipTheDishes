package worldCup;

import java.util.HashMap;

public class Points {
	
	public static HashMap <String, Integer> points = new HashMap <String, Integer>();
	
	public static void pointsInitialize () {
		//All teams with Zero points in World Cup start
		AddTeams.initializeTeams();
		points.put(AddTeams.teamsGroups.get(0), 0);
		points.put(AddTeams.teamsGroups.get(1), 0);
		points.put(AddTeams.teamsGroups.get(2), 0);
		points.put(AddTeams.teamsGroups.get(3), 0);
		points.put(AddTeams.teamsGroups.get(4), 0);
		points.put(AddTeams.teamsGroups.get(5), 0);
		points.put(AddTeams.teamsGroups.get(6), 0);
		points.put(AddTeams.teamsGroups.get(7), 0);
		points.put(AddTeams.teamsGroups.get(8), 0);
		points.put(AddTeams.teamsGroups.get(9), 0);
		points.put(AddTeams.teamsGroups.get(10), 0);
		points.put(AddTeams.teamsGroups.get(11), 0);
		points.put(AddTeams.teamsGroups.get(12), 0);
		points.put(AddTeams.teamsGroups.get(13), 0);
		points.put(AddTeams.teamsGroups.get(14), 0);
		points.put(AddTeams.teamsGroups.get(15), 0);
		points.put(AddTeams.teamsGroups.get(16), 0);
		points.put(AddTeams.teamsGroups.get(17), 0);
		points.put(AddTeams.teamsGroups.get(18), 0);
		points.put(AddTeams.teamsGroups.get(19), 0);
		points.put(AddTeams.teamsGroups.get(20), 0);
		points.put(AddTeams.teamsGroups.get(21), 0);
		points.put(AddTeams.teamsGroups.get(22), 0);
		points.put(AddTeams.teamsGroups.get(23), 0);
		points.put(AddTeams.teamsGroups.get(24), 0);
		points.put(AddTeams.teamsGroups.get(25), 0);
		points.put(AddTeams.teamsGroups.get(26), 0);
		points.put(AddTeams.teamsGroups.get(27), 0);
		points.put(AddTeams.teamsGroups.get(28), 0);
		points.put(AddTeams.teamsGroups.get(29), 0);
		points.put(AddTeams.teamsGroups.get(30), 0);
		points.put(AddTeams.teamsGroups.get(31), 0);	
	}
}
