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
	
	  String[] name; //Holds the Player Name, Character Name, Game System, and any background info.
	  int[] statArray; //Holds the stat line.
	  int[] skillNumArray; //Holds the number any "skills" which the character has.
	  String[] skillname; //Holds the name of any "skills" which the character has.
	  String[] featArray; //Holds the name of any "Feats" which the character has.
	 
	
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
	  
	  Scanner c = new Scanner(System.in);
	  
	  int progress; //This keeps the loop going until character creation is completed.
	  
	  progress = 0; //No progress so far.
	  
	 // while (progress == 0){
		  if (gameSystem == 0){ //Catches anyone who tries to do this out of order.
			  System.out.println("The Game System must be selected before a character can be created. Please restart the program and select a game system using the Game System command.");
		  }//end error catcher.
		  
		  if (gameSystem == 1){
			  //Array Creation
			  ArrayList name = new ArrayList(10); //Created a new array which will contain the player name, nation name, game system, name of Origin, name of Government Type, and Government Sub-types
			  ArrayList stat = new ArrayList(6); //Holds the Military, Economy, Diplomacy, Modified Military, Modified Economy and Modified Diplomacy.
			  ArrayList skillNum = new ArrayList(10); //Create the Powers number array, with a starting size of 10.
			  ArrayList skillName = new ArrayList(10); //Create the Powers name array, with a starting size of 10.
			  ArrayList feat = new ArrayList(10); //Holds Historical Importances of a nation.
			  //end Array Creation
			  
			  
			  //Array initialization
			  //Just putting this here if it becomes neeeded.
			  //End Array init
	

			  //Variables
			  int Military = 3; //This holds the base Military stat.
			  int Economy = 3; //This holds the base Economy stat.
			  int Diplomacy = 3; //This holds the base Diplomacy stat.
			  int ModMilitary = 3; //This holds the Modified Military stat.
			  int ModEconomy = 3; //This holds the Modified Economy stat.
			  int ModDiplomacy = 3; //This holds the Modified Diplomacy stat.
			  
			  int nextNameIndex = 0;
			  int nextStatIndex = 0;
			  int nextSkillNumIndex = 0;
			  int nextSkillNameIndex = 0;
			  int nextFeatIndex = 0;
			  
			  /*Holding these here just in case they are needed
			   * String PowerName1 = ""; //Holds the first Power name.
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
				  name.add("Player Name: " +playerName);
				  name.add("Character Name: " +characterName);
				  name.add("Game System: Nations the RPG");
				  System.out.println("Current size of name is: " +name.size());
				  System.out.println("Contents of name is: " +name);
				  //End Player Information
				  progress++;
			  }while (progress == 0);
			  
				  do{
				  //Begin Nation Origin
				  System.out.println("Please enter your Nation's origin or enter List to view all origins.");
				  String originInfo = c.nextLine();//Holds the next typed line
				  
				  switch(originInfo){
				  case "List":
					  System.out.println("The avalible origins for your Nation are:");
					  System.out.println("Rebel Colony. Your Nation was once the colony of another Nation, and you gained your independence though a revolution. Add 1 to both Military and Economy, but subtract 1 from Diplomacy. Add Historic Importances 'Freedom By Fire' and 'National Tantrum'.");
					  System.out.println("Worker's Revolution. Your Nation was born after your people overthrew a once great empire in a glorious revolution! Add 2 to Military, and subtract 1 from both Diplomacy and Economy. Add the Historic Importance 'Political Feavour'.");
					  break;
					  
				  case "Rebel Colony":
					  System.out.println("You have chosen Rebel Colony as your Nation's origin.");
					  name.add("Origin: Rebel Colony");
					  
					  Military++; //Increases Military to 4
					  Economy++; //Increases Economy to 4
					  Diplomacy--; //Decreases Diplomacy to 2
					  
					  feat.add("Freedom By Fire."); //Add Freedom By Fire to Historic Importance
					  feat.add("National Tantrum."); //Add National Tantrum to Historic Importance
					  
					  progress++;
					  break;
					  
				  case "Worker's Revolution":
					  System.out.println("You have chosen Worker's Revolution as your Nation's Origin.");
					  name.add("Origin: Worker's Revolution");
					  
					  Military = 4;
					  Economy = 1;
					  Diplomacy = 1;
					  
					  ModEconomy = 2;
					  ModDiplomacy = 2;
					  
					  feat.add("Political Feavour."); //Add Political Feavour to Historic Importance.
					  
					  progress++;
					  break;
				  default: System.out.println("Please use correct capitalization, and include the entirety of the origin name. Example: Rebel Colony.");
				  	break;
				  }//End Switch
			  }while (progress == 1);
			  
			  //Begin Government Type Selection
			  do{
				  System.out.println("Please enter your Nation's Government Type or enter List to view all Government Types.");
				  String GovernmentInfo = c.nextLine();//Holds the next typed line
				  
				  switch (GovernmentInfo){ //Here we go!
				  	default: System.out.println("Please use correct capitalization, and include the entirety of the Government Type. Example: Democratic Republic.");
				  		break;
				  		
				  	case "List":
				  		System.out.println("The following Government Types can be selected." 
				  				+ "Democratic Republic. Your Nation is a Democratic Republic, where your citizens elect representatives to decide on matters of law and state. Add the following Powers: Tariff Trading +1, Cash Crops +1, Army +1, Alliance +1. "
				  				+ "Socialist State. Your Nation is a Socialist State, where the state controls the economy and most methods of labor. Add the following Powers: ndustrial Mechanation +1,  Secret Police +1, State Owned Business +1, National Pride +1. Add the following Historical Importances: Labor Surplus, Revolutionaries, The Party."
				  				+ "Successor State. Your Nation is the Successor of a former Nation. Chose a Government Type and gain all Powers and Historical Importances for that Government Type. Then chose a second Government Type, which is what your Nation's Government Type counts as.");
				  		break;
				  		
				  	case "Democratic Republic":
				  		System.out.println("You have selected Democratic Republic as your Government Type.");
				  		name.add("Government Type: Democratic Republic");
				  		//NEED .next command!
				  		break;
				  		
				  	case "Socialist State":
				  		System.out.println("You have selected Socialist State as your Government Type.");
				  		name.add("Government Type: Socialist State");
				  		//NEED .next command
				  		break;
				  		
				  	case "Successor State":
				  		System.out.println("You have selected Socialist State as your Government Type. Please enter the Government Type that you start as.");
				  		name.add("Government Type: Successor State");
				  		
				  		String firstGovernment = c.nextLine();
				  		
				  		switch (firstGovernment){
				  		
				  		} //End switch
				  		
				  		//NEED .next command
				  		break;
				  }//End Switch
			  }while (progress == 2); //End Government Type Selection
			  
		  } //End Nations the RPG character creation
		  
		  if (gameSystem == 2){
			  do{
			  System.out.println("You have created a new adventurer called: " +characterName);
			  System.out.println("Warning, the Pathfinder option is not yet complete, as the game is much more expansive than can be covered in a single semester's worth of work. Currently, this serves only as a methoid to test the dice function.");
			  
			  }while (progress == 0);
			  
		  } //end Pathfinder character Creation
	  //} //End while loop
		  
  }  //End characterCreation
 
  
}//End Public Class Character Creator