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

These pieces of data will be exapanded on in the **private implementation** section.

### Public Interface

_Constructors

`Player(Name, Position, JerseyNumber, DateOfBirth, HomeTown, Height)` - In this constructor, the player information is passed in and the 



### Private Implementation

_Instance Variables

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

The PlayerList class  

Public methods
* `recordShot(String playerNumber)` - 
* `getPlayer(String playerNumber)` - The method **getPlayer** will
* 

### Private Implementation

_Constructors_

PlayerList()




