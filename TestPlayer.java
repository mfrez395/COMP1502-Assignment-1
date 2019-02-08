import static org.junit.Assert.*;
import org.junit.Test;

public class TestPlayer{

	@Test //TEST WRITTEN
	public void rosterConstructor() {

		enum Position{LW,RW,C,D};
	
		String name = "Mark Frezell";
		Position position = Position.C;
		String jerseyNumber = "7";
		String dateOfBirth = "September 11, 2001";
		String hometown = "Calgary, AB";
		String weight = "250";
		String height = "4'11";
		
		Player player = new Player(name, position, jerseyNumber, dateOfBirth, hometown, weight, height);
		
		assertEquals(name, player.getName());
		assertEquals(position.toString(), player.getPosition().toString());
		assertEquals(jerseyNumber, player.getJerseyNumber());
		assertEquals(dateOfBirth, player.getDateOfBirth());
		assertEquals(hometown, player.getHomeTown());
		assertEquals(weight, player.getWeight());
		assertEquals(height, player.getHeight());	
		
	}
	
	@Test //TEST WRITTEN
	public void recreationConstructor() {

		enum Position{LW,RW,C,D};
	
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
		
		assertEquals(name, player.getName());
		assertEquals(position.toString(), player.getPosition().toString());
		assertEquals(jerseyNumber, player.getJerseyNumber());
		assertEquals(dateOfBirth, player.getDateOfBirth());
		assertEquals(hometown, player.getHomeTown());
		assertEquals(weight, player.getWeight());
		assertEquals(height, player.getHeight());	
		assertEquals(shots, player.getShots());	
		assertEquals(goals, player.getGoals());	
		assertEquals(assists, player.getAssists());	
		assertEquals(goals + assists, player.getPoints());
		assertEquals(ppg, player.getPPG());	
		assertEquals(ppa, player.getPPA());	
		assertEquals(ppg + ppa, player.getPPP());
		assertEquals(shotAverage, player.getShotAverage());	
		
	}


	@Test //TEST WRITTEN
	public void copyConstructor() {

		enum Position{LW,RW,C,D};
	
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
		
		Player copyPlayer = new Player(player);
		
		assertEquals(player.getName(), copyPlayer.getName());
		assertEquals(player.getPosition.toString(), copyPlayer.getPosition().toString());
		assertEquals(player.getJerseyNumber(), copyPlayer.getJerseyNumber());
		assertEquals(player.getDateOfBirth(), copyPlayer.getDateOfBirth());
		assertEquals(player.getHomeTown(), copyPlayer.getHomeTown());
		assertEquals(player.getWeight, copyPlayer.getWeight());
		assertEquals(player.getHeight(), copyPlayer.getHeight());	
		assertEquals(player.getShots(), copyPlayer.getShots());	
		assertEquals(player.getPoints(), copyPlayer.getPoints());
		assertEquals(player.getGoals(), copyPlayer.getGoals());	
		assertEquals(player.getAssists(), copyPlayer.getAssists());	
		assertEquals(player.getPPP(), copyPlayer.getPPP());
		assertEquals(player.getPPG(), copyPlayer.getPPG());	
		assertEquals(player.getPPA(), copyPlayer.getPPA());	
		assertEquals(player.getShotAverage(), copyPlayer.getShotAverage());
		
	}
	
	
	@Test //TEST WRITTEN
	public void recordShotIncrements() {

		enum Position{LW,RW,C,D};
	
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
		int points = goals + assists;
		int ppg = 3;
		int ppa = 1;
		int ppp = ppg + ppa;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, points, goals, assists, ppp, ppg, ppa, shotAverage);
	
		player.recordShot();
		
		assertEquals(shots+1, player.getShots());
		assertTrue(shotAverage > player.getShotAverage());
		
	}
	
	@Test //TEST WRITTEN
	public void recordGoalIncrements() {

		enum Position{LW,RW,C,D};
	
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
		int points = goals + assists;
		int ppg = 3;
		int ppa = 1;
		int ppp = ppg + ppa;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, goals, assists, ppg, ppa, shotAverage);
	
		player.recordGoal();
		
		assertEquals(goals+1, player.getGoals());
		assertEquals(points+1, player.getPoints());
		assertEquals(shots+1, player.getShots());
		assertTrue(shotAverage < player.getShotAverage());
		
	}
	
	@Test //TEST WRITTEN
	public void recordAssistIncrements() {

		enum Position{LW,RW,C,D};
	
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
		int points = goals + assists;
		int ppg = 3;
		int ppa = 1;
		int ppp = ppg + ppa;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, goals, assists, ppg, ppa, shotAverage);
	
		player.recordGoal();
		
		assertEquals(assists+1, player.getAssists());
		assertEquals(points+1, player.getPoints());
		
	}
	
	@Test //TEST WRITTEN
	public void recordPPGIncrements() {

		enum Position{LW,RW,C,D};
	
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
		int points = goals + assists;
		int ppg = 3;
		int ppa = 1;
		int ppp = ppg + ppa;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, goals, assists, ppg, ppa, shotAverage);
	
		player.recordPPG();
		
		assertEquals(ppg+1, player.getPPG());
		assertEquals(shots+1, player.getShots());
		assertEquals(ppp+1, player.getPPP());
		//TODO no shotAverage incremented here??
		
	}

	@Test //TEST WRITTEN
	public void recordPPAIncrements() {

		enum Position{LW,RW,C,D};
	
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
		int points = goals + assists;
		int ppg = 3;
		int ppa = 1;
		int ppp = ppg + ppa;
		int shotAverage = 0.20;
		
		Player player = new Player(name, position, jerseyNumber,
						dateOfBirth, hometown, weight, height,
						shots, goals, assists, ppg, ppa, shotAverage);
	
		player.recordPPA();
		
		assertEquals(ppa+1, player.getPPA());
		assertEquals(ppp+1, player.getPPP());

	}
	
}