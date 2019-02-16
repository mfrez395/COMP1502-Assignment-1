
public class Player {

	
	/* INSTANCE VARIABLES*/
	
	String name;
	enum Position{LW,RW,C,D};
	Position position;
	String jerseyNumber;
	String dateOfBirth;
	String homeTown;
	String weight;
	String height;
	int points;
	int goals;
	int assists;
	int ppp;
	int ppg;
	int ppa;
	int shots;
	double shotAverage;
	
	
	/* ~~ CONSTRUCTORS ~~ */
	
	/**
	 * This is the roster constructor. 
	 * It takes in only the roster information and sets the player
	 *  descriptive information and initializes statistical information to be 0.
	 * 
	 * @param name
	 * @param position
	 * @param jerseyNumber
	 * @param dateOfBirth
	 * @param homeTown
	 * @param weight
	 * @param height
	 */
	public Player(String name, 
			Position position, 
			String jerseyNumber, 
			String dateOfBirth, 
			String homeTown, 
			String weight, 
			String height) {
		
		//descriptive information
		this.name = name;
		this.position = position;
		this.jerseyNumber = jerseyNumber;
		this.dateOfBirth = dateOfBirth;
		this.homeTown = homeTown;
		this.weight = weight;
		this.height = height;
		
		//statistical information
		this.points = 0;
		this.goals = 0;
		this.assists = 0;
		this.ppp = 0;
		this.ppg = 0;
		this.ppa = 0;
		this.shots = 0;
		this.shotAverage = 0.0;
		
	}

	/**
	 * This is the recreation constructor.
	 *  It "recreates" a player will all the required information that a Player encapsulates. 
	 *  The purpose of this constructor is to recreate a Player from its data previously saved in a file.
	 * 
	 * @param name
	 * @param position
	 * @param jerseyNumber
	 * @param dateOfBirth
	 * @param homeTown
	 * @param weight
	 * @param height
	 * @param points
	 * @param goals
	 * @param assists
	 * @param ppp
	 * @param ppg
	 * @param ppa
	 * @param shots
	 */
	public Player(String name, Position position, String jerseyNumber, 
			String dateOfBirth, String homeTown, String weight, 
			String height, int points, int goals, int assists, 
			int ppp, int ppg, int ppa, int shots, double shotAverage) {
		
		//descriptive information
		this.name = name;
		this.position = position;
		this.jerseyNumber = jerseyNumber;
		this.dateOfBirth = dateOfBirth;
		this.homeTown = homeTown;
		this.weight = weight;
		this.height = height;
		
		//statistical information
		this.points = points;
		this.goals = goals;
		this.assists = assists;
		this.ppp = ppp;
		this.ppg = ppg;
		this.ppa = ppa;
		this.shots = shots;
		this.shotAverage = shotAverage;
		
	}

	/**
	 * This is the "copy" constructor. 
	 * This constructor creates a Player with the descriptive information 
	 * and the player stats of the copyPlayer passed in. 
	 * 
	 * @param copyPlayer
	 */
	public Player(Player copyPlayer) {
		
		//descriptive information
		this.name = copyPlayer.name;
		this.position = copyPlayer.position;
		this.jerseyNumber = copyPlayer.jerseyNumber;
		this.dateOfBirth = copyPlayer.dateOfBirth;
		this.homeTown = copyPlayer.homeTown;
		this.weight = copyPlayer.weight;
		this.height = copyPlayer.height;
		
		//statistical information
		this.points = copyPlayer.points;
		this.goals = copyPlayer.goals;
		this.assists = copyPlayer.assists;
		this.ppp = copyPlayer.ppp;
		this.ppg = copyPlayer.ppg;
		this.ppa = copyPlayer.ppa;
		this.shots = copyPlayer.shots;
		this.shotAverage = copyPlayer.shotAverage;
		
	}
	

	/* ~~ MUTATORS ~~ */
	
	public void recordShot() {
		shots++;
		calculateShotAverage();
	}
	
	public void recordAssist() {
		assists++;
		points++;
	}
	
	public void recordGoal() {
		goals++;
		points++;
		calculateShotAverage();
	}
	
	public void recordPPG() {
		ppg++;
		ppp++;
		calculateShotAverage();
	}
	
	public void recordPPA() {
		ppa++;
		ppp++;
	}

	
	/* ~~ ACCESSORS ~~ */
	
	public String getName() {
		return name;
	}

	public Position getPosition() {
		return position;
	}

	public String getJerseyNumber() {
		return jerseyNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public String getWeight() {
		return weight;
	}

	public String getHeight() {
		return height;
	}

	public int getPoints() {
		return points;
	}

	public int getGoals() {
		return goals;
	}

	public int getAssists() {
		return assists;
	}

	public int getPPP() {
		return ppp;
	}

	public int getPPG() {
		return ppg;
	}

	public int getPPA() {
		return ppa;
	}

	public int getShots() {
		return shots;
	}	
	
	public double getShotAverage() {
		return shotAverage;
	}
	
	/* ~~ HELPERS ~~ */
	
	private void calculateShotAverage() {
		shotAverage = goals/ (double) shots;
		//cast to a double to ensure that there is no integer division
	}
	

}