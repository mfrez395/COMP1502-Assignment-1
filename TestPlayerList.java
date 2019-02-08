import static org.junit.Assert.*;
import org.junit.Test;

public class TestPlayerList{
	
	@Test //TEST WRITTEN
	public void addPlayerWorks() {	

		enum Position{LW,RW,C,D};
	
		String name = "Mark Frezell";
		Position position = Position.C;
		String jerseyNumber = "7";
		String dateOfBirth = "September 11, 2001";
		String hometown = "Calgary, AB";
		String weight = "250";
		String height = "4'11";
		
		Player player = new Player(name, position, jerseyNumber, dateOfBirth, hometown, weight, height);
	
		PlayerList playerList = new PlayerList();
		
		playerList.addPlayer(player);
	
		assertEquals(name, playerList.getPlayer(jerseyNumber).getName());
		// if we can confirm that the player was added, 
		// being retrieved by their unique jerseyNumber,
		// by comparing the name assigned with the name retrieved. 

	}
	
	@Test //TEST WRITTEN
	public void addPlayerDuplicate() {	

		enum Position{LW,RW,C,D};
	
		String name = "Mark Frezell";
		Position position = Position.C;
		String jerseyNumber = "7";
		String dateOfBirth = "September 11, 2001";
		String hometown = "Calgary, AB";
		String weight = "250";
		String height = "4'11";
		
		Player player = new Player(name, position, jerseyNumber, dateOfBirth, hometown, weight, height);
	
		PlayerList playerList = new PlayerList();
		
		playerList.addPlayer(player);
		//player added once
		
		assertFalse(playerList.addPlayer(player));
		//should return false because the player is already added

	}

	@Test //TEST WRITTEN
	public void recordShotWorks() {	

		String name = "Mark Frezell";
		Position position = Position.C;
		String jerseyNumber = "7";
		String dateOfBirth = "September 11, 2001";
		String hometown = "Calgary, AB";
		String weight = "250";
		String height = "4'11";
		int shots = 50;
		int goals = 7;
		int assists = 4;
		int ppg = 3;
		int ppa = 1;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, points, goals, assists, ppp, ppg, ppa, shotAverage);
		PlayerList playerList = new PlayerList();
		playerList.addPlayer(player);
		
		playerList.recordShot(jerseyNumber);
		
		assertEquals(shots + 1, playerList.getPlayer(jerseyNumber).getShots());
		//test passes if the number of shots of the player is incremented from its previous value
		assertTrue(shotAverage > playerList.getPlayer(jerseyNumber.getShotAverage());
		//test passes if the new shotAverage is less than the previous
	}

	@Test //TEST WRITTEN
	public void recordGoalWorks() {	

		String name = "Mark Frezell";
		Position position = Position.C;
		String jerseyNumber = "7";
		String dateOfBirth = "September 11, 2001";
		String hometown = "Calgary, AB";
		String weight = "250";
		String height = "4'11";
		int shots = 50;
		int goals = 7;
		int assists = 4;
		int ppg = 3;
		int ppa = 1;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, points, goals, assists, ppp, ppg, ppa, shotAverage);
		PlayerList playerList = new PlayerList();
		playerList.addPlayer(player);
		
		playerList.recordGoal(jerseyNumber);
		
		assertEquals(goals + 1, playerList.getPlayer(jerseyNumber).getGoals());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(points + 1, playerList.getPlayer(jerseyNumber).getPoints());
		//test passes if the number of points of the player is incremented from its previous value
		assertEquals(shots + 1, playerList.getPlayer(jerseyNumber).getShots());
		//test passes if the number of shots of the player is incremented from its previous value
		assertTrue(shotAverage < playerList.getPlayer(jerseyNumber.getShotAverage());
		//test passes if the new shotAverage is GREATER than the previous
	}

	@Test //TEST WRITTEN
	public void recordGoalAndOneAssistWorks() {	

		String name = "Mark Frezell";
		Position position = Position.C;
		String jerseyNumber = "7";
		String dateOfBirth = "September 11, 2001";
		String hometown = "Calgary, AB";
		String weight = "250";
		String height = "4'11";
		int shots = 50;
		int goals = 7;
		int assists = 4;
		int ppg = 3;
		int ppa = 1;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, points, goals, assists, ppp, ppg, ppa, shotAverage);
						
						
		String name2 = "Kermit The Frog";
		Position position2 = Position.D;
		String jerseyNumber2 = "12"
		String dateOfBirth2 = "August 11, 2001";
		String hometown2 = "Edmonton, AB";
		String weight2 = "246";
		String height2 = "5'11";
		int shots2 = 40;
		int goals2 = 5;
		int assists2 = 3;
		int ppg2 = 4;
		int ppa2 = 11;
		int shotAverage2 = 0.50;
		
		Player player2 = new Player(name2, position2, jerseyNumber2,
						dateOfBirth2, hometown2, weight2, height2,
						shots2, points2, goals2, assists2, ppp2, ppg2, ppa2, shotAverage2);
		
		
		PlayerList playerList = new PlayerList();	
		playerList.addPlayer(player);
		playerList.addPlayer(player2);
		
		playerList.recordGoal(jerseyNumber, jerseyNumber2);
		
		
		/* GOAL ADDED FOR THE FIRST PLAYER*/
		
		assertEquals(goals + 1, playerList.getPlayer(jerseyNumber).getGoals());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(points + 1, playerList.getPlayer(jerseyNumber).getPoints());
		//test passes if the number of points of the player is incremented from its previous value
		assertEquals(shots + 1, playerList.getPlayer(jerseyNumber).getShots());
		//test passes if the number of shots of the player is incremented from its previous value
		assertTrue(shotAverage < playerList.getPlayer(jerseyNumber.getShotAverage());
		//test passes if the new shotAverage is GREATER than the previous
		
		
		/* ASSIST ADDED FOR THE SECOND PLAYER */
		
		assertEquals(assists2 + 1, playerList.getPlayer(jerseyNumber2).getAssist());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(points2 + 1, playerList.getPlayer(jerseyNumber2).getPoints());
		//test passes if the number of points for the player increases by one
		
	}
	
	@Test //TEST WRITTEN
	public void recordGoalAndTwoAssistsWorks() {	

		//begin creating first player
		String name = "Mark Frezell";
		Position position = Position.C;
		String jerseyNumber = "7";
		String dateOfBirth = "September 11, 2001";
		String hometown = "Calgary, AB";
		String weight = "250";
		String height = "4'11";
		int shots = 50;
		int goals = 7;
		int assists = 4;
		int ppg = 3;
		int ppa = 1;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, points, goals, assists, ppp, ppg, ppa, shotAverage);
		
		//begin creating second player
		String name2 = "Kermit The Frog";
		Position position2 = Position.D;
		String jerseyNumber2 = "12"
		String dateOfBirth2 = "August 11, 2001";
		String hometown2 = "Edmonton, AB";
		String weight2 = "246";
		String height2 = "5'11";
		int shots2 = 40;
		int goals2 = 5;
		int assists2 = 3;
		int ppg2 = 4;
		int ppa2 = 11;
		int shotAverage2 = 0.50;
		
		Player player2 = new Player(name2, position2, jerseyNumber2,
						dateOfBirth2, hometown2, weight2, height2,
						shots2, points2, goals2, assists2, ppp2, ppg2, ppa2, shotAverage2);
		
		//begin creating third player
		String name3 = "Mrs Piggy";
		Position position3 = Position.LW;
		String jerseyNumber3 = "1";
		String dateOfBirth3 = "October 11, 2001";
		String hometown3 = "Red Deer, AB";
		String weight3 = "150";
		String height3 = "3'11";
		int shots3 = 10;
		int goals3 = 1;
		int assists3 = 3;
		int ppg3 = 0;
		int ppa3 = 2;
		int shotAverage3 = 0.11;
		
		Player player3 = new Player(name3, position3, jerseyNumber3,
						dateOfBirth3, hometown3, weight3, height3,
						shots3, points3, goals3, assists3, ppp3, ppg3, ppa3, shotAverage3);			
						
		//creating PlayerList class and adding the players
		PlayerList playerList = new PlayerList();	
		playerList.addPlayer(player);
		playerList.addPlayer(player2);
		playerList.addPlayer(player3);
		
		playerList.recordGoal(jerseyNumber, jerseyNumber2, jerseyNumber3);
		
		
		/* GOAL ADDED FOR THE FIRST PLAYER*/
		
		assertEquals(goals + 1, playerList.getPlayer(jerseyNumber).getGoals());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(points + 1, playerList.getPlayer(jerseyNumber).getPoints());
		//test passes if the number of points of the player is incremented from its previous value
		assertEquals(shots + 1, playerList.getPlayer(jerseyNumber).getShots());
		//test passes if the number of shots of the player is incremented from its previous value
		assertTrue(shotAverage < playerList.getPlayer(jerseyNumber.getShotAverage());
		//test passes if the new shotAverage is GREATER than the previous
		
		
		/* ASSIST ADDED FOR THE SECOND PLAYER */
		
		assertEquals(assists2 + 1, playerList.getPlayer(jerseyNumber2).getAssist());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(points2 + 1, playerList.getPlayer(jerseyNumber2).getPoints());
		//test passes if the number of points for the player increases by one

		
		/* ASSIST ADDED FOR THE THIRD PLAYER */
		
		assertEquals(assists3 + 1, playerList.getPlayer(jerseyNumber3).getAssist());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(points3 + 1, playerList.getPlayer(jerseyNumber3).getPoints());
		//test passes if the number of points for the player increases by one
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* ENTERING PPG TESTING ZONE*/
	
	
	
	
	
	
	
	
	@Test //TEST WRITTEN
	public void recordPPGWorks() {	

		String name = "Mark Frezell";
		Position position = Position.C;
		String jerseyNumber = "7";
		String dateOfBirth = "September 11, 2001";
		String hometown = "Calgary, AB";
		String weight = "250";
		String height = "4'11";
		int shots = 50;
		int goals = 7;
		int assists = 4;
		int ppg = 3;
		int ppa = 1;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, points, goals, assists, ppp, ppg, ppa, shotAverage);
		PlayerList playerList = new PlayerList();
		playerList.addPlayer(player);
		
		playerList.recordPPG(jerseyNumber);
		
		assertEquals(ppg + 1, playerList.getPlayer(jerseyNumber).getPPG());
		//test passes if the number of ppg of the player is incremented from its previous value
		assertEquals(ppp + 1, playerList.getPlayer(jerseyNumber).getPPP());
		//test passes if the number of ppp of the player is incremented from its previous value
		assertEquals(shots + 1, playerList.getPlayer(jerseyNumber).getShots());
		//test passes if the number of shots of the player is incremented from its previous value

		//TODO no shotAverage incremented here?
	}

	@Test //TEST WRITTEN
	public void recordPPGAndOnePPAWorks() {	

		String name = "Mark Frezell";
		Position position = Position.C;
		String jerseyNumber = "7";
		String dateOfBirth = "September 11, 2001";
		String hometown = "Calgary, AB";
		String weight = "250";
		String height = "4'11";
		int shots = 50;
		int goals = 7;
		int assists = 4;
		int ppg = 3;
		int ppa = 1;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, points, goals, assists, ppp, ppg, ppa, shotAverage);
						
						
		String name2 = "Kermit The Frog";
		Position position2 = Position.D;
		String jerseyNumber2 = "12"
		String dateOfBirth2 = "August 11, 2001";
		String hometown2 = "Edmonton, AB";
		String weight2 = "246";
		String height2 = "5'11";
		int shots2 = 40;
		int goals2 = 5;
		int assists2 = 3;
		int ppg2 = 4;
		int ppa2 = 11;
		int shotAverage2 = 0.50;
		
		Player player2 = new Player(name2, position2, jerseyNumber2,
						dateOfBirth2, hometown2, weight2, height2,
						shots2, points2, goals2, assists2, ppp2, ppg2, ppa2, shotAverage2);
		
		
		PlayerList playerList = new PlayerList();	
		playerList.addPlayer(player);
		playerList.addPlayer(player2);
		
		playerList.recordPPG(jerseyNumber, jerseyNumber2);
		
		
		/* PPG ADDED FOR THE FIRST PLAYER*/
		
		assertEquals(ppg + 1, playerList.getPlayer(jerseyNumber).getPPG());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(ppp + 1, playerList.getPlayer(jerseyNumber).getPPP());
		//test passes 
		assertEquals(shots + 1, playerList.getPlayer(jerseyNumber).getShots());
		//test passes if the number of shots of the player is incremented from its previous value

		//TODO no shotAverage incremented here?
		
		
		/* PPA ADDED FOR THE SECOND PLAYER */
		
		assertEquals(ppa2 + 1, playerList.getPlayer(jerseyNumber2).getPPA());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(ppp2 + 1, playerList.getPlayer(jerseyNumber2).getPPP());
		//test passes if the number of points for the player increases by one
		
	}
	
	@Test //TEST WRITTEN
	public void recordGoalAndTwoAssistsWorks() {	

		//begin creating first player
		String name = "Mark Frezell";
		Position position = Position.C;
		String jerseyNumber = "7";
		String dateOfBirth = "September 11, 2001";
		String hometown = "Calgary, AB";
		String weight = "250";
		String height = "4'11";
		int shots = 50;
		int goals = 7;
		int assists = 4;
		int ppg = 3;
		int ppa = 1;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, points, goals, assists, ppp, ppg, ppa, shotAverage);
		
		//begin creating second player
		String name2 = "Kermit The Frog";
		Position position2 = Position.D;
		String jerseyNumber2 = "12"
		String dateOfBirth2 = "August 11, 2001";
		String hometown2 = "Edmonton, AB";
		String weight2 = "246";
		String height2 = "5'11";
		int shots2 = 40;
		int goals2 = 5;
		int assists2 = 3;
		int ppg2 = 4;
		int ppa2 = 11;
		int shotAverage2 = 0.50;
		
		Player player2 = new Player(name2, position2, jerseyNumber2,
						dateOfBirth2, hometown2, weight2, height2,
						shots2, points2, goals2, assists2, ppp2, ppg2, ppa2, shotAverage2);
		
		//begin creating third player
		String name3 = "Mrs Piggy";
		Position position3 = Position.LW;
		String jerseyNumber3 = "1";
		String dateOfBirth3 = "October 11, 2001";
		String hometown3 = "Red Deer, AB";
		String weight3 = "150";
		String height3 = "3'11";
		int shots3 = 10;
		int goals3 = 1;
		int assists3 = 3;
		int ppg3 = 0;
		int ppa3 = 2;
		int shotAverage3 = 0.11;
		
		Player player3 = new Player(name3, position3, jerseyNumber3,
						dateOfBirth3, hometown3, weight3, height3,
						shots3, points3, goals3, assists3, ppp3, ppg3, ppa3, shotAverage3);			
						
		//creating PlayerList class and adding the players
		PlayerList playerList = new PlayerList();	
		playerList.addPlayer(player);
		playerList.addPlayer(player2);
		playerList.addPlayer(player3);
		
		playerList.recordPPG(jerseyNumber, jerseyNumber2, jerseyNumber3);
		
		
		/* PPG ADDED FOR THE FIRST PLAYER*/
		
		assertEquals(ppg + 1, playerList.getPlayer(jerseyNumber).getPPG());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(ppp + 1, playerList.getPlayer(jerseyNumber).getPPP());
		//test passes 
		assertEquals(shots + 1, playerList.getPlayer(jerseyNumber).getShots());
		//test passes if the number of shots of the player is incremented from its previous value

		//TODO no shotAverage incremented here?
		
		
		/* PPA ADDED FOR THE SECOND PLAYER */
		
		assertEquals(ppa2 + 1, playerList.getPlayer(jerseyNumber2).getPPA());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(ppp2 + 1, playerList.getPlayer(jerseyNumber2).getPPP());
		//test passes if the number of points for the player increases by one

		
		/* PPA ADDED FOR THE THIRD PLAYER */
		
		assertEquals(ppa3 + 1, playerList.getPlayer(jerseyNumber3).getPPA());
		//test passes if the number of goals of the player is incremented from its previous value
		assertEquals(ppp3 + 1, playerList.getPlayer(jerseyNumber3).getPPP());
		//test passes if the number of points for the player increases by one
				
	}
	
	
	
	
	
	
	
}