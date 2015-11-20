package edu.saintjoe.cs.griffinscott;

import java.util.Scanner;

/* This is the Character Creator Program made by Griffin Scott for CMP 343: Software Engineering.
Originally this program was to be written in JavaScript until I came to the realization that
JavaScript was the wrong programming language for this type of program.
*/
/*GAME SYSTEM NUMBER RECORD
0: Games List
1: Nations: The RPG by Griffin Scott
2: Pathfinder by Paizo Publishing
3: EMPTY */	

/* Resource Citing
http://illegalargumentexception.blogspot.com/2010/09/java-systemconsole-ides-and-testing.html Provides examples of non-console code.
*/

//Functions
public class CharacterCreator {

	static int gameSystem;
	
  public static void main(String[] args){ //This is where the magic happens. This is going to be really big.
	  Scanner m = new Scanner(System.in);
	  int progress = 0; //This holds the key to ensure that the program will loop until a valid command is inputted.
	  Scanner name = new Scanner(System.in);
	  int gameSelector = 0;
	  
	  System.out.println("Welcome to Griffin Scott's Ultimate Character creator! For a list of commands, please type help and then press enter.");

	  //String commandString = m.nextLine();

	  do{ //With an if statement, it terminates once it hits a break command. With a while statement, it loops infinitely.
		  String commandString = m.nextLine();
		  
		  switch(commandString){
		  	case "Help":
		  		System.out.println("The following commands are avaliable. "
		  				+ "Game Selector: Allows selection of game system. "
		  				+ "Load: Opens the Load Character Sheet Program. "
		  				+ "Create Character: Creates a new character using the currently selected system. "
		  				+ "Delete Character: Opens the Delete Character program.");
		  		System.out.println("Currently, only Game Selector and Create Character commands are completed.");
		  		break; 
		  	case "Game Selector": //This will proc gameSelector, allowing the user to select which game system they want to use.
		  		System.out.println("You have selected the Game Selector command. Please enter the first name of the game system you want, or enter List to see the list of game systems.");
		  		gameSelector(); //Runs gameSelector, which returns an int with what Game System was chosen.
		  		//System.out.println("Game system is: " + gameSystem);
		  		//progress++;
		  		break;
		  	case "Load": //This will ask for the name of a character, in order to load it.
		  		//Insert Load command
		  		//progress++;
		  		break;
		  	case "Create Character": //Begins the Character Creation Process for the currently selected system.
		  		//progress++;
		  		System.out.println("Please insert the name of the character you want to create.");
		  		String characterName = name.nextLine();
		  		System.out.println("Creating a character with the name : " +characterName);
		  		//Put in Character Creator command.
		  		break;
		  	case "Delete Character": //Asks for the name of the character to remove.
		  		//Insert the Delete command.
		  		System.out.println("Please insert the name of the character that you want to delete.");
		  		//progress++;
		  		break;
		  	default: System.out.println("I'm sorry, the command you entered was not valid. If you need help with the commands, please enter Help. Capitalization is required.");
		  	break;
		  }
	  }while(progress == 0);
  } //End Main

  public static int gameSelector(){ //This is where the user selects which game system they want to chose.
      Scanner s = new Scanner(System.in);

      System.out.println("This is the Game Selection area. Please type the number of the game system that you want to use. To see what game systems are avaliable, please type List and press enter."); //Prints the instructions for this part of the program.

      do{
      String whatGameString = s.nextLine();

      switch (whatGameString){
      	case "List": System.out.println("Currently, there are two game systems avaliable: Nations the RPG and Pathfinder. To select a system, type the first part of the system's name into the console. For example, Nations the RPG would be 'Nations'");
      		break;
      	case "Nations": System.out.println("You have selected Nations the RPG.");
      		gameSystem = 1; //Sets gameSystem to Nations the RPG.
      		break;
      	case "Pathfinder": System.out.println("You have selected Pathfinder. "
      			+ "WARNING this game system is incomplete.");
      		gameSystem = 2; //Sets gameSystem to Pathfinder.
      		break;
      default: System.out.println("I'm sorry, but that is not a valid command. For a list of Game Systems, please enter the word 'Help'.");
      }
      } while(gameSystem == 0);
      return gameSystem; //Sends back the chosen game system to Main. 
    }//End gameSelector
  
  /*New public method, called Creation. Creates an array based on the requirements of each game system. gameSystem will be sent to this method, which will cycle through an if statement. If gameSystem == 1, then Nations. If gameSystem == 2, then Pathfinder.
  For Nations: Player Name, Origin, Origin Sub-type, Military, Economy, Diplomacy, Modified Military, Modified Economy, Modified Diplomacy, Government Type, Nation Name. Create 2 arrays for Powers and Historical Importances that change based on how many Powers/HI are given by their chosen info.
  For Pathfinder: Player Name, Character Name, Level. Look to PFSRD for full list.
  
  Need 1 Scanner which will use the .nextLine command to insert info into the array.
  */
  
}
