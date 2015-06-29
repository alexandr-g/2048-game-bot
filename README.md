# 2048 Game Bot App

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