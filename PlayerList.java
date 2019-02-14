import java.util.ArrayList;

public class PlayerList {

	
	/* ~~ INSTANCE VARIABLES ~~ */
	
	ArrayList<Player> playerList;
	
	final String FILE_NAME = "data.txt";
	
	
	/* ~~ CONSTRUCTOR ~~ */
	
	public PlayerList() {
		
		playerList = new ArrayList<>();
		populateFromFile(); //populates the playerList
	
	}
	
	/* ~~ MUTATORS ~~ */
	
	
	
	/* ~~ ACCESSORS ~~ */
	
	/**
	 * The getPlayer method will return a Player from the list that matches the player number entered.  
	 * The method will include a search algorithm that will look through the playerList ArrayList
	 * to find the Player object with a jerseyNumber that matches playerNumber. 
	 * The method will return (SOMETHING) if a matching Player is not found.
	 * 
	 * @param playerNumber
	 * @return player
	 * @return ?WHAT WILL IT RETURN IF THERE IS NO PLAYER?
	 */
	public Player getPlayer(String playerNumber) {
		Player player = new Player(playerNumber, null, playerNumber, playerNumber, playerNumber, playerNumber, playerNumber);
		
		return player;
	}
	
	
	/* ~~ PROCESSORS ~~ */
	
	/**
	 * This method saves the information of the playerList ArrayList into the file FILE_NAME. 
	 * It saves the information of each of the Player in playerList to its seperate row.
	 * All of the data is separated by comma in the file.
	 * 
	 */
	public void saveToFile() {
		
	}
	
	/**
	 * This method will retrieve all the information from the file FILE_NAME, 
	 * create new Players from each line and 
	 * populate the playerList ArrayList will the number of Players that are in the file.
	 *
	 */
	private void populateFromFile() {
		
	}
	
	
}
