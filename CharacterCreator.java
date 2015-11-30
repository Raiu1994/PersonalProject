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
		  				//+ "Load: Opens the Load Character Sheet Program. "
		  				+ "Create Character: Creates a new character using the currently selected system. ");
		  				//+ "Delete Character: Opens the Delete Character program.");
		  		//System.out.println("Currently, only Game Selector and Create Character commands are completed.");
		  		break; 
		  	case "Game Selector": //This will proc gameSelector, allowing the user to select which game system they want to use.
		  		System.out.println("You have selected the Game Selector command. Please enter the first name of the game system you want, or enter List to see the list of game systems.");
		  		gameSelector(); //Runs gameSelector, which returns an int with what Game System was chosen.
		  		//System.out.println("Game system is: " + gameSystem);
		  		//progress++;
		  		break;
		  	case "Load": //This will ask for the name of a character, in order to load it. This will be added once a save system is implemented.
		  		//Insert Load command
		  		//progress++;
		  		break;
		  	case "Create Character": //Begins the Character Creation Process for the currently selected system.
		  		//progress++;
		  		System.out.println("Please insert the name of the character you want to create.");
		  		String characterName = name.nextLine();
		  		System.out.println("Creating a character with the name : " +characterName);
		  		characterCreation(characterName);
		  		break;
		  	case "Delete Character": //Asks for the name of the character to remove. This will be implemented with a save system.
		  		System.out.println("Please insert the name of the character that you want to delete.");
		  		//Insert the Delete command.
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

      if (gameSystem == 0){
    	  do{
    		  String whatGameString = s.nextLine();

    		  switch (whatGameString){
    		  	case "List": System.out.println("Currently, there are two game systems avaliable: Nations the RPG and Pathfinder. To select a system, type the first part of the system's name into the console. For example, Nations the RPG would be 'Nations'");
    		  	break;
    		  	case "Nations": System.out.println("You have selected Nations the RPG.");
    		  		gameSystem = 1; //Sets gameSystem to Nations the RPG.
    		  		break;
    		  	case "Pathfinder": System.out.println("You have selected Pathfinder. "
    		  			+ "WARNING this game system is incomplete and serves as a test function for dice rolling.");
    		  		gameSystem = 2; //Sets gameSystem to Pathfinder.
    		  		break;
    		  	default: System.out.println("I'm sorry, but that is not a valid command. For a list of Game Systems, please enter the word 'List'.");
    		  }
    	  } while(gameSystem == 0); //Loops while gameSystem is not set to anything. 
      }else{
    	  System.out.println("To change the Game System that you wish to use, please restart the program."); //This will occur if the user tries to change their game system after selecting a game system.
      }//End else
      
      return gameSystem; //Sends back the chosen game system to Main.
  }//End gameSelector
  
  public static void characterCreation (String characterName){
	  String[] nameArray; //Holds the Player Name, Character Name, Game System, and any background info.
	  int[] statArray; //Holds the stat line.
	  Scanner c = new Scanner(System.in);
	  
	  int progress; //This keeps the loop going until character creation is completed.
	  
	  progress = 0; //No progress so far.
	  
	  while (progress == 0){
		  if (gameSystem == 0){ //Catches anyone who tries to do this out of order.
			  System.out.println("The Game System must be selected before a character can be created. Please restart the program and select a game system using the Game System command.");
			  break;
		  }
		  if (gameSystem == 1){
			  System.out.println("You have created a new nation called: " +characterName);
		  }
		  if (gameSystem == 2){
			  System.out.println("You have created a new adventurer called: " +characterName);
			  System.out.println("Warning, the Pathfinder option is not yet complete, as the game is much more expansive than can be covered in a single semester's worth of work. Currently, this serves only as a methoid to test the dice function.");
			  
		  }
	  }
  }
  /*New public method, called Creation. Creates an array based on the requirements of each game system. gameSystem will be sent to this method, which will cycle through an if statement. If gameSystem == 1, then Nations. If gameSystem == 2, then Pathfinder.
  For Nations: Player Name, Origin, Origin Sub-type, Military, Economy, Diplomacy, Modified Military, Modified Economy, Modified Diplomacy, Government Type, Nation Name. Create 2 arrays for Powers and Historical Importances that change based on how many Powers/HI are given by their chosen info.
  For Pathfinder: Player Name, Character Name, Level. Look to PFSRD for full list.
  
  Need 1 Scanner which will use the .nextLine command to insert info into the array.
  
  Pull data from the ArrayList program, including the dynamic sizing.
  */
  
  
  
  
}//End Public Class Character Creator
