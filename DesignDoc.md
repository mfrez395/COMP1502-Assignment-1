# Assignment Design Document

## Player Class

The Player class is an object that's primary function is to holds the values of a single player and can increment shots, goals, assists, powerplay goals and powerplay assists of the specific player. The class encapsulates all the following data:
* Name
* Position
* Jersey Number
* Date of Birth
* Home Town
* Weight
* Height
* Points
* Goals
* Assists
* Power Play Points
* Power Play Goals
* Power Play Assists
* Shots
* Shot Average

These pieces of data will be exapanded on in the **private implementation** section. The Player class has a composition relationship with the class String and enum because it is dependant and made up of Strings and an enum in order to properly function. The Player class assumes that the class that implements Player will already have the data to fill the descriptive data (Name - Height) of the player. The Player class also assumes that any given player starts off with zero shots, goals, assists, powerplay goals and powerplay assists. 

### Public Interface

#### Constructors

`Player(name, position, jerseyNumber, dateOfBirth, homeTown, weight, height)` - This is the "roster" constructor. This constructor creates a unique player with no statistical information. In this constructor, the player descriptive information is passed in and all statistical information is initialized with the value `0`. The pointer of the Player is returned to the class that implements Player.

`Player(name, position, jerseyNumber, dateOfBirth, homeTown, weight, height, shots, goals, assists, ppg, ppa, shotAverage)` - This is the "recreation" constructor. This constructor "recreates" a player will all the required information that a Player encasulates. THe purpose of this constructor is to recreate a Player from the data in a file. In this constructor, the player descriptive information and the player statistics are passed in as arguements. The pointer of the Player is returned to the class that implements Player.

`Player(Player copyPlayer)` - This is the "copy" constructor. This constructor creates a copy Player with the descriptive information and the player stats of the `copyPlayer` passed in. In this constructor, the `copyPlayer` is passed in as a type Player and all the values of the new player are equal to the values of the `copyPlayer`. The pointer of the Player is returned to the class that implements Player.

#### Methods

##### Mutators

* `recordShot` - the method `recordShot` will mutate the value of the instance variable `shots` by incrementing it by one. The method will not recieve any arguements, nor will it return any value.

* `recordGoal` - the method `recordGoal` will mutate the value of the instance variable `goals` by incrementing it by one. The method will not recieve any arguements, nor will it return any value.

* `recordPPG` - the method `recordPPG` will mutate the value of the instance variable `ppg` by incrementing it by one. The method will not recieve any arguements, nor will it return any value.

* `recordPPA` - the method `recordPPA` will mutate the value of the instance variable `ppa` by incrementing it by one. The method will not recieve any arguements, nor will it return any value.

##### Accessors

* `getName` - the method `getName` has a purpose of allowing the caller access the to player's `name` variable. The method will not recieve any arguements but it will return the String value of `name`.

* `getPosition` - the method `getPosition` has a purpose of allowing the caller access the to player's `position` variable. The method will not recieve any arguements but it will return the enum value of `position`.

* `getJerseyNumber` - the method `getJerseyNumber` has a purpose of allowing the caller access the to player's `jerseyNumber` variable. The method will not recieve any arguements but it will return the String value of `jerseyNumber`.

* `getDateOfBirth` - the method `getDateOfBirth` has a purpose of allowing the caller access the to player's `dateOfBirth` variable. The method will not recieve any arguements but it will return the String value of `dateOfBirth`.

* `getWeight` - the method `getWeight` has a purpose of allowing the caller access the to player's `weight` variable. The method will not recieve any arguements but it will return the String value of `weight`.

* `getHeight` - the method `getHeight` has a purpose of allowing the caller access the to player's `height` variable. The method will not recieve any arguements but it will return the String value of `height`.

* `getPoints` - the method `getPoints` has a purpose of allowing the caller access to the player's `points` variable. The method will not recive any arguements but it will return the int value of `points`.

* `getGoals` - the method `getGoals` has a purpose of allowing the caller access the to player's `goals` variable. The method will not recieve any arguements but it will return the int value of `goals`.

* `getAssists` - the method `getAssists` has a purpose of allowing the caller access the to player's `assists` variable. The method will not recieve any arguements but it will return the int value of `assists`.

* `getPPP` - the method `getPPP` has a purpose of allowing the caller access to the player's `ppp` variable. The method will not recive any arguements but it will return the int value of `ppp`.

* `getPPG` - the method `getPPG` has a purpose of allowing the caller access the to player's `ppg` variable. The method will not recieve any arguements but it will return the int value of `ppg`.

* `getPPA` - the method `getPPA` has a purpose of allowing the caller access the to player's `ppa` variable. The method will not recieve any arguements but it will return the int value of `ppa`.

* `getShots` - the method `getShots` has a purpose of allowing the caller access the to player's `shots` variable. The method will not recieve any arguements but it will return the int value of `shots`.

* `getShotAverage` - the method `getShotAverage` has a purpose of allowing the caller access the to player's `shotAverage` variable. The method will not recieve any arguements but it will return the int value of `shotAverage`.

### Private Implementation

#### Instance Variables

* `String name` - `name` is of type String and describes the name of the player
* `enum Position{LW,RW,C,D}` - `Position` is an enum that contains the following 4 different positions:
  * `LW` - The leftwing position
  * `RW` - The rightwing position
  * `C` - The center position
  * `D` - The defense position
* `Position position` - `position` is a `Position` enum and describes the position of the player 
* `String jerseyNumber`- `jerseyNumber` is of type String and describes the jersey number that the player has
* `String dateOfBirth`- `dateOfBirth` is of type String and describes the date of birth of the player. The date of birth will be in the format of "Apr 22 1987".
* `String homeTown` - `homeTown` is of type String and describes the hometown that the player originates from. The home town will be in the format of "Westfield MA".
* `String weight` - `weight` is of type String and describes the weight of the player. The weight is in pounds but does not contain the extention lbs.
* `String height` - `height` is of type String and describes the height of the player. The height is in feet and inches and will be in the format of "5'7"".
* `int points` - `points` is of type int and describes the number of points accumulated by the player (goals and assists combined).
* `int goals` - `goals` is of type int and describes the number of goals accumulated by the player.
* `int assists` - `assists` is of type int and describes the number of assists accumulated by the player.
* `int ppp` - `ppp` is of type int and describes the number of powerplay points accumulated by the player (ppg and ppa combined).
* `int ppg` - `ppg` is of type int and describes the number of powerplay goals accumulated by the player.
* `int ppa` - `ppa` is of type int and describes the number of powerplay assists accumulated by the player.
* `int shots` - `shots` is of type int and describes the number of shots the player has taken.
* `double shotAverage` - `shotAverate` is of type double and in a calculation of goals/shots to get the decimal of goals to shots.

#### Methods

##### Helpers

* `calculateShotAverage()` - The `calculateShotAverage` method will complete the calculation of `goals/shots`, to keep the `shotAverage` variable up to date every time there is a shot, goal or powerplay goal. The method will not take in any arguements and it will not return anything. It's purpose is only to set the value of `shotAverage`.

## PlayerList Class

The PlayerList class's primary function is to maintain a collection of Player objects and communicate with a specific player to increment specific statistics. The encapsulated information is the collection of players and the file name of where the information is stored after the program is closed. The PlayerList class has an aggregation relationship with the class Player.java. The class is made up of players but is not dependant on players to function. The PlayerList class assumes that the file name is holds exists and includes data (is not empty) of player information seperated by a comma.

### Public Interface

#### Constructors

`PlayerList()` - In this constructor, a new PlayerList object is created. No arguements are passed in because the PlayerList will already contain the file name of the data the will be used to populate the ArrayList of Players. The constructor will call the method `populateFromFile()` which will populate the ArrayList with the information in the file. The pointer of a PlayerList object is returned to the class that implements PlayerList.

#### Methods

##### Mutators

* `addPlayer(Player player)` - this method (with a return-value of boolean) will add a player (with all its data pre-included) to the `players` ArrayList. The method passes in a player to add to the list. It will return true if the player is successfully added without duplicate _`jerseyNumber`_. If there is already a player with the same `jerseyNumber`, the method will return false.

* `recordShot(String playerNumber)` - this method will record a shot of a specific player. The arguement `playerNumber` is passed in and will be used to search for a matching Player to increment the `shots` value of that specific player. The method will call another method `getPlayer` to perform the search function.

* `recordGoal(String goalPlayerNumber)` - The next three methods are overloaded methods that will increment the `goals` variable on one player and increment the `assists` variable on two other players, using the `getPlayer` method to find each player.
* `recordGoal(String goalPlayerNumber, assistPlayerNumber)`
* `recordGoal(String goalPlayerNumber, assistPlayerNumber, assist2PlayerNumber)`

* `recordPPG(String ppgPlayerNumber)` - The next three methods are overloaded methods that will increment the `ppg` variable on one player and increment the `ppa` variable on two other players, using the `getPlayer` method to find each player.
* `recordPPG(String ppgPlayerNumber, ppaPlayerNumber)`
* `recordPPG(String ppgPlayerNumber, ppaPlayerNumber, ppa2PlayerNumber)`

##### Accessors

* `getPlayer(String playerNumber)` - `getPlayer` will return a Player from the list that matches the player number entered. The method will receive the arguement `playerNumber` as a String and will return the respective Player object in the `players` ArrayList. The method will include a search algorithm that will look through the `playerList` ArrayList to find the Player object with a `jerseyNumber` that matches `playerNumber`. The method will return -1 if a matching Player is not found. 

##### Processor

* `saveToFile()` - The `saveToFile` method will save the information of the `playerList` ArrayList. The method will not receive and arguements, nor will it return anything. The main purpose the method is to save the information of each of the Players in `playerList` to its seperate row, with all of the data seperated by "," in the file `FILE_NAME`.

### Private Implementation

#### Instance Variables

`ArrayList<Player> playerList` - The variable `playerList` is of type ArrayList and will be a collection of all of the Player objects 

`final String FILE_NAME` - The variable `FILE_NAME` is of type String that will contain the full name of the file that contains or will contain the complete player data.  

##### Processor

* `populateFromFile()` - The `populateFromFile` method will retrieve all the information from the file `FILE_NAME`, create new Players from each line and populate the `playerList` ArrayList will the number of Players that are in the file. The method will not take in any arguements and it will not return anything.

