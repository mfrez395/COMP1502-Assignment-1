# Assignment 1 - Creating a Hockey Time Keeper's Database

Over the course of the assignments in this course this semester we will construct a simple application that works as a hockey Time Keeper's database. For this first phase we will construct the basic components needed to keep track of hockey player data and allow the time keeper to record, shots, goals and power-play goals for each player on a team.

For the first phase, the time keeper should be able to load a list of players, add a new player, list the players' roster information and list the players' stats. The timer keeper should also be able to record a player's shot, a goal with one or two assists, and a power play goal, with one or two assists. 

[This file](assignment1_demo.md) is a demonstration of the function of the program.

For the first phase, you will be provided with code that will provide a menu for the time keeper and stubs of methods to tie together the menu with the code you will write.

You will be responsible for creating a `Player` class to encapsulate a player and a `Player List` class to encapsulate a list of players, and for connecting those classes in the Menu class provide the functionality specified by each method stub in the menu class.

Please keep the [due dates](duedates.md) in mind.

## The Classes

### Player

For each player there are two types of information we want to keep, roster information and play information. Roster information includes information about the player including:
* their name, 
* date of birth, 
* home town, 
* weight, 
* height, 
* number,
* and position (left wing (LW), right wing (RW), centre (C), or defence (D).

For simplicity's sake, assume that all of their roster information will be stored as strings (including birth date and height). You can use a String to encode their possession or you can use an **enum**.

Play information includes information about what they've done in the games they've played. This includes:

* their points (goals and assists together),
* goals,
* assists,
* power play points (power play goals and assists together),
* power play goals,
* power play assists,
* shots,
* and shooting percentage (for all of their shots what percent are goals?).

Notice that some of these values can be stored, while others should be derived. **You are responsible for determining which is which and providing algorithms to determine each.**
