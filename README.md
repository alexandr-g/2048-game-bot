# 2048 Game Bot App

small application that automates the «2048 game»

1. Bot is doing the random actions to complete game
2. After each step, print current games field like: (not implemented)
	```
	| 2 | 0 | 4 | 8|
	| 2 | 0 | 4 | 8|
	| 2 | 0 | 4 | 8|
	| 4 | 8 | 32 | 16 |
	
	```
3. After the end of the game, print the current score
4. Currently running on Firefox (firefox-driver)

Project structure:

```
src /
  main /
  	java / 
		controllers /
			Action.java ------ random action controller
			GameController.java ------ interface with main game methods
			GameControllerImpl.java ------ implementation of the main game methods

		logic / 
			GameLogic.java ------ interface with game logic 
			RandomGameLogic.java ------ logic implementation 

		result / 
			Result.java ----- model with game result 'POJO'

		utils / 
			Log4Test.java ----- Logger

		AppMain.java ------ main execution file

resources/ 
 	log4j.properties ----- Logger properties

pom.xml ------ Maven dependencies(selenium-firefox-driver, log4j etc.)

``` 

## Getting started

1. git clone `https://github.com/alexandr-g/2048-game-bot.git`
2. enable auto-import for dependencies 
3. run `AppMain.java`


**Enjoy the app!**