# Assignment Design Document

## Player Class

The Player class is an object that's primary function is to holds the values of a single player and can increment shots, goals, assists, powerplay goals and powerplay assists of the specific player. The class encapsulates all the following data:
* Name
* Postion
* Jersey Number
* Date of Birth
* Home Town
* Weight
* Height 
* Goals
* Assists
* Power Play Goals
* Power Play Assists
* Shots

These pieces of data will be exapanded on in the **private implementation** section. The Player class has a composition relationship with the class String and enum because it is dependant and made up of Strings and an enum in order to properly function. The Player class assumes that the class that implements Player will already have the data to fill the descriptive data (Name - Height) of the player. The Player class also assumes that any given player starts off with zero shots, goals, assists, powerplay goals and powerplay assists. 

### Public Interface

#### Constructors

`Player(Name, Position, JerseyNumber, DateOfBirth, HomeTown, Height)` - In this constructor, the player descriptive information is passed in and all statistical information is initialized with the value `0`. The pointer of a player with the information that is encapuslated in the class is returned to the class that implements Player.

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

* `getGoals` - the method `getGoals` has a purpose of allowing the caller access the to player's `goals` variable. The method will not recieve any arguements but it will return the int value of `goals`.

* `getAssists` - the method `getAssists` has a purpose of allowing the caller access the to player's `assists` variable. The method will not recieve any arguements but it will return the int value of `assists`.

* `getPPG` - the method `getPPG` has a purpose of allowing the caller access the to player's `ppg` variable. The method will not recieve any arguements but it will return the int value of `ppg`.

* `getPPA` - the method `getPPA` has a purpose of allowing the caller access the to player's `ppa` variable. The method will not recieve any arguements but it will return the int value of `ppa`.

* `getShots` - the method `getShots` has a purpose of allowing the caller access the to player's `shots` variable. The method will not recieve any arguements but it will return the int value of `shots`.

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
* `int goals` - `goals` is of type int and describes the number of goals accumulated by the player.
* `int assists` - `assists` is of type int and describes the number of assists accumulated by the player.
* `int ppg` - `ppg` is of type int and describes the number of powerplay goals accumulated by the player.
* `int ppa` - `ppa` is of type int and describes the number of powerplay assists accumulated by the player.
* `int shots` - `shots` is of type int and describes the number of shots the player has taken.


## PlayerList Class

The PlayerList class's primary function is to maintain a collection of Player objects and communicate with a specific player to increment specific statistics. The encapsulated information is the collection of players and the file name of where the information is stored after the program is closed. The PlayerList class has an aggregation relationship with the class Player.java. The class is made up of players but is not dependant on players to function. The PlayerList class assumes there is already a file that includes data (and is not empty) of player information seperated by a comma.

### Public Interface

#### Methods

##### Mutators

* `recordShot(String playerNumber)`

* `recordGoal(String goalPlayerNumber)`
* `recordGoal(String goalPlayerNumber, assistPlayerNumber)`
* `recordGoal(String goalPlayerNumber, assistPlayerNumber, assist2PlayerNumber)`

* `recordPPG(String ppgPlayerNumber)`
* `recordPPG(String ppgPlayerNumber, ppaPlayerNumber)`
* `recordPPG(String ppgPlayerNumber, ppaPlayerNumber, ppa2PlayerNumber)`

##### Accessors

* `getPlayer(String playerNumber)` - `getPlayer` will return a player from the list that matches the player number entered. The method will receive the arguement `playerNumber` as a String and will return the respective Player object in the `players` ArrayList. THe method will include a search algorithm that will look through the `players` ArrayList to find the Player object with a `jerseyNumber` that matches `playerNumber`. The method will return -1 if no Player is found. 

##### Helpers

* `saveToFile()`
* `populateFromFile`

### Private Implementation



#### Constructors_

PlayerList()




