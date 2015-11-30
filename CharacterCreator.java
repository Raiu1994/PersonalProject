package edu.saintjoe.cs.griffinscott;

import java.util.Scanner;
import java.util.*;


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
	  //Note, each game system has different words for the abilities of a character. The current ones are just generic.
	  String[] nameArray; //Holds the Player Name, Character Name, Game System, and any background info.
	  int[] statArray; //Holds the stat line.
	  int[] skillNumArray; //Holds the number any "skills" which the character has.
	  String[] skillNameArray; //Holds the name of any "skills" which the character has.
	  String[] featArray; //Holds the name of any "Feats" which the character has.
	  
	  Scanner c = new Scanner(System.in);
	  
	  int progress; //This keeps the loop going until character creation is completed.
	  
	  progress = 0; //No progress so far.
	  
	 // while (progress == 0){
		  if (gameSystem == 0){ //Catches anyone who tries to do this out of order.
			  System.out.println("The Game System must be selected before a character can be created. Please restart the program and select a game system using the Game System command.");
		  }//end error catcher.
		  
		  if (gameSystem == 1){
			  //Array Creation
			  nameArray = new String[10]; //Created a new array which will contain the player name, nation name, game system, name of Origin, name of Government Type, and the conditions when modified MEDs will be used.
			  statArray = new int[6]; //Holds the Military, Economy, Diplomacy, Modified Military, Modified Economy and Modified Diplomacy.
			  skillNumArray = new int[10]; //Create the Powers number array, with a starting size of 10.
			  skillNameArray = new String[10]; //Create the Powers name array, with a starting size of 10.
			  featArray = new String[10]; //Holds Historical Importances of a nation.
			  //end Array Creation
			  
			  //Variables
			  int Military = 3; //This holds the base Military stat.
			  int Economy = 3; //This holds the base Economy stat.
			  int Diplomacy = 3; //This holds the base Diplomacy stat.
			  int ModMilitary = 3; //This holds the Modified Military stat.
			  int ModEconomy = 3; //This holds the Modified Economy stat.
			  int ModDiplomacy = 3; //This holds the Modified Diplomacy stat.
			  
			  /*String PowerName1 = ""; //Holds the first Power name.
			  String PowerName2 = ""; //Holds the second Power name.
			  String PowerName3 = ""; //Holds the third Power name.
			  String PowerName4 = ""; //Holds the fourth Power name.
			  String PowerName5 = ""; //Holds the fifth Power name.
			  String PowerName6 = ""; //Holds the sixth Power name.
			  String PowerName7 = ""; //Holds the seventh Power name.
			  String PowerName8 = ""; //Holds the eighth Power name.
			  String PowerName9 = ""; //Holds the ninth Power name.
			  String PowerName10 = ""; //Holds the tenth Power name.
			  
			  int Power1 = 0; //Holds the number of the first Power
			  int Power2 = 0; //Holds the number of the second Power
			  int Power3 = 0; //Holds the number of the third Power
			  int Power4 = 0; //Holds the number of the fourth Power
			  int Power5 = 0; //Holds the number of the fifth Power
			  int Power6 = 0; //Holds the number of the sixth Power
			  int Power7 = 0; //Holds the number of the seventh Power
			  int Power8 = 0; //Holds the number of the eighth Power
			  int Power9 = 0; //Holds the number of the ninth Power
			  int Power10 = 0; //Holds the number of the tenth Power
			  		Unsure if I need to declare all of them at once.
			  */
			  do{
				  //Begin Player Information
				  System.out.println("You have created a new nation called: " +characterName);
				  System.out.println("Please type your name.");
				  String playerName = c.nextLine();
				  nameArray[0] = ("Player Name: " +playerName);
				  nameArray[1] = ("Character Name: " +characterName);
				  nameArray[2] = ("Game System: Nations the RPG");
				  //End Player Information
				  progress++;
			  }while (progress == 0);
				  do{
				  //Begin Nation Origin
				  System.out.println("Please enter your Nation's origin or enter List to view all origins.");
				  String originInfo = c.nextLine();//Holds the next typed line
				  
				  switch(originInfo){
				  case "List":
					  System.out.println("The avalible origins for your Nation are: "
							  + "Rebel Colony. Your Nation was once the colony of another Nation, and you gained your independence though a revolution. Add 1 to both Military and Economy, but subtract 1 from Diplomacy."
							  + "Revolution: Fading Empire. Your Nation was born after your people overthrew a once great empire in a glorious revolution! Add 2 to Military, and subtract 1 from both Diplomacy and Economy. Add the Historic Importance 'Political Feavour'.");
					  break;
					  
				  case "Rebel Colony":
					  System.out.println("You have chosen Rebel Colony as your Nation's origin.");
					  nameArray[3] = ("Origin: Rebel Colony");
					  
					  Military++; //Increases Military to 4
					  Economy++; //Increases Economy to 4
					  Diplomacy--; //Decreases Diplomacy to 2
					  
					  progress++;
					  break;
					  
				  default: System.out.println("Please use correct capitalization, and include the entirety of the origin name. Example: Colony: Rebellion.");
				  }//End Switch
			  }while (progress == 1);
			  
		  } //End Nations the RPG character creation
		  
		  if (gameSystem == 2){
			  System.out.println("You have created a new adventurer called: " +characterName);
			  System.out.println("Warning, the Pathfinder option is not yet complete, as the game is much more expansive than can be covered in a single semester's worth of work. Currently, this serves only as a methoid to test the dice function.");
			  
			  while (progress == 0){
				  
			  }
			  
		  } //end Pathfinder character Creation
	  //} //End while loop
  }  //End characterCreation
  
  
  
}//End Public Class Character Creator
