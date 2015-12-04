package edu.saintjoe.cs.griffinscott;

import java.util.Scanner;
import java.util.*;


/* This is the Character Creator Program made by Griffin Scott for CMP 343: Software Engineering.
Originally this program was to be written in JavaScript until I came to the realization that
JavaScript was the wrong programming language for this type of program.
*/
/*GAME SYSTEM NUMBER RECORD
0: Games List
1: Nations: The RPG by Griffin Scott : Version 0.01
2: Pathfinder by Paizo Publishing : Incomplete
3: EMPTY */	

/* Resource Citing
*/

//Functions
public class CharacterCreator {

	static int gameSystem; //Quite possibly the most important variable in the lot!
	 
	
  public static void main(String[] args){ //This is where the magic happens. This is going to be really big.
	  Scanner m = new Scanner(System.in); //And a new scanner for main!
	  int progress = 0; //This holds the key to ensure that the program will loop until a valid command is inputted.
	  Scanner name = new Scanner(System.in); //And another new scanner!
	  
	  System.out.println("Welcome to Griffin Scott's Ultimate Character creator! For a list of commands, please type Help and then press enter."); //The standard intro text.

	  do{ //With an if statement, it terminates once it hits a break command. With a while statement, it loops infinitely.
		  String commandString = m.nextLine(); //And here is the code that controls which branch the user goes through.
		  
		  switch(commandString){
		  	case "Help":
		  		System.out.println("The following commands are avaliable.");
		  				System.out.println("Game Selector: Allows selection of game system. "
		  				//+ "Load: Opens the Load Character Sheet Program. "
		  				+ "Create Character: Creates a new character using the currently selected system. "
		  				//+ "Delete Character: Opens the Delete Character program.");
		  				+ "Exit: Exits Griffin Scott's Ultimate Character Creator.");
		  		//System.out.println("Currently, only Game Selector and Create Character commands are completed.");
		  		break; 
		  		
		  	case "Game Selector": //This will proc gameSelector, allowing the user to select which game system they want to use.
		  		System.out.println("You have selected the Game Selector command. Please enter the first name of the game system you want, or enter List to see the list of game systems.");
		  		gameSelector(); //Runs gameSelector, which returns an int with what Game System was chosen.
		  		System.out.println("Sending back to Main Menu.");
		  		//System.out.println("Game system is: " + gameSystem);
		  		//progress++;
		  		break;
		  		
		  	case "Load": //This will ask for the name of a character, in order to load it. This will be added once a save system is implemented.
		  		System.out.println("You found a secret!");
		  		//Insert Load command
		  		//progress++;
		  		break;
		  		
		  	case "Create Character": //Begins the Character Creation Process for the currently selected system.
		  		
		  		if (gameSystem == 0){
		  			System.out.println("Please select a Game System using the Game Selector command before creating a character.");
		  			break;
		  		}else{
		  		System.out.println("Please insert the name of the character you want to create.");
		  		String characterName = name.nextLine();
		  		System.out.println("Creating a character with the name : " +characterName);
		  		characterCreation(characterName);
		  		break;
		  		}
		  		
		  	case "Delete Character": //Asks for the name of the character to remove. This will be implemented with a save system.
		  		System.out.println("You found a secret!.");
		  		//Insert the Delete command.
		  		//progress++;
		  		break;
		  		
		  	case "Exit":
		  		System.out.println("Thank you for using Griffin Scott's Ultimate Character Creator!");
		  		System.exit(0);
		  		
		  	default: System.out.println("I'm sorry, the command you entered was not valid. If you need help with the commands, please enter Help. Capitalization is required.");
		  		break;
		  }
	  }while(progress == 0);
  } //End Main

  public static int gameSelector(){ //This is where the user selects which game system they want to chose.
      Scanner s = new Scanner(System.in);

      System.out.println("This is the Game Selection area. Please type the number of the game system that you want to use. To see what game systems are avaliable, please type List and press enter."); //Prints the instructions for this part of the program.

      if (gameSystem == 0){//If no game system has been selected...
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
    	  System.out.println("Do you want to change your selected game system? Please enter Yes or No."); //This will occur if the user tries to change their game system after selecting a game system.
    	  
    	  String questionString = s.nextLine();
    	  
    	  switch (questionString){
    	  	case "Yes": System.out.println("Resetting Game System.");
    	  		gameSystem = 0;
    	  		break;
    	  		
    	  	case "No":
    	  	 break;
    	  }
      }//End else
      
      return gameSystem; //Sends back the chosen game system to Main.
  }//End gameSelector
  
  public static void characterCreation (String characterName){
	  
	  ArrayList<String> name = new ArrayList<String>(10); //Created a new array which will contain the player name, character name, game system, and any game specific info.
	  ArrayList stat = new ArrayList(6); //Holds the Stats
	  ArrayList skill = new ArrayList(10); //Create an array to hold skills.
	  ArrayList<String> feat = new ArrayList<String>(10); //Holds the feats
	  
	  Scanner c = new Scanner(System.in);
	  
	  int progress; //This keeps the loop going until character creation is completed.
	  
	  progress = 0; //No progress so far.
	  
	 // while (progress == 0){
		  if (gameSystem == 0){ //Catches anyone who tries to do this out of order.
			  System.out.println("The Game System must be selected before a character can be created. Please restart the program and select a game system using the Game System command.");
		  }//end error catcher.
		  
		  if (gameSystem == 1){
			 
			  //Array initialization
			  //End Array initialization
	

			  //Variables
			  int Military = 3; //This holds the base Military stat.
			  int Economy = 3; //This holds the base Economy stat.
			  int Diplomacy = 3; //This holds the base Diplomacy stat.
			  int ModMilitary; //This holds the Modified Military stat.
			  int ModEconomy; //This holds the Modified Economy stat.
			  int ModDiplomacy; //This holds the Modified Diplomacy stat.
			  
			    	
			  
			  do{
				  //Begin Player Information
				  System.out.println("You have created a new nation called: " +characterName);
				  System.out.println("Please type your name.");
				  String playerName = c.nextLine();
				  name.add("Player Name: " +playerName);
				  name.add("Character Name: " +characterName);
				  name.add("Game System: Nations the RPG");
				  //System.out.println("Current size of name is: " +name.size());
				  //System.out.println("Contents of name is: " +name);
				  
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
					  
					  stat.add("Military: " + Military); //Adds the base Military stat
					  stat.add("Economy: " + Economy); //Adds the base Economy stat
					  stat.add("Diplomacy: " +Diplomacy); //Adds the base Diplomacy stat
					  
					  feat.add("Freedom By Fire."); //Add Freedom By Fire to Historic Importance
					  feat.add("National Tantrum."); //Add National Tantrum to Historic Importance
					  
					  progress++;
					  break;
					  
				  case "Worker's Revolution":
					  System.out.println("You have chosen Worker's Revolution as your Nation's Origin.");
					  name.add("Origin: Worker's Revolution");
					  
					  Military++; //Sets military to 4
					  Economy--; //Change Economy to 2
					  Economy--; //Change Economy to 1
					  Diplomacy--; //Change Diplomacy to 2
					  Diplomacy--; //Change Diplomacy to 1
					  
					  ModMilitary = 4; //And Modified Military isn't changed, so it is kept at Military's value which is 4.
					  ModEconomy = Economy + 1; //Sets Modified Economy to 2 when dealing with other "Communist" nations
					  ModDiplomacy = Diplomacy + 1; //Sets Modified Diplomacy to 2 when dealing with other "Communist" nations
					  
					  //Add in the stat line to the character sheet
					  stat.add("Military: " + Military);
					  stat.add("Economy: " + Economy);
					  stat.add("Diplomacy: " + Diplomacy);
					  stat.add("Modified Military: " + ModMilitary);
					  stat.add("Modified Economy: " + ModEconomy);
					  stat.add("Modified Diplomacy: " + ModDiplomacy);
					  feat.add("Political Feavour."); //Add Political Feavour to Historic Importance.
					  
					  progress++; //Next step!
					  break;
				  default: System.out.println("Please use correct capitalization, and include the entirety of the origin name. Example: Rebel Colony.");
				  	break; //And loop.
				  }//End Switch
			  }while (progress == 1);
			  
			  //Begin Government Type Selection
			  do{
				  System.out.println("Please enter your Nation's Government Type or enter List to view all Government Types.");
				  String GovernmentInfo = c.nextLine();//Holds the next typed line
				  
				  switch (GovernmentInfo){ //Here we go!
				  	default: System.out.println("Please use correct capitalization, and include the entirety of the Government Type. Example: Democratic Republic.");
				  		break;//And loop!
				  		
				  	case "List":
				  		System.out.println("The following Government Types can be selected."); 
				  				System.out.println("Democratic Republic. Your Nation is a Democratic Republic, where your citizens elect representatives to decide on matters of law and state. Add the following Powers: Tariff Trading +1, Cash Crops +1, Army +1, Alliance +1. ");
				  				System.out.println("Socialist State. Your Nation is a Socialist State, where the state controls the economy and most methods of labor. Add the following Powers: ndustrial Mechanation +1,  Secret Police +1, State Owned Business +1, National Pride +1. Add the following Historical Importances: Labor Surplus, Revolutionaries, The Party.");
				  				System.out.println("Successor State. Your Nation is the Successor of a former Nation. Chose a Government Type and gain all Powers and Historical Importances for that Government Type. Then chose a second Government Type, which is what your Nation's Government Type counts as.");
				  		break;//And loop!
				  		
				  	case "Democratic Republic":
				  		System.out.println("You have selected Democratic Republic as your Government Type.");
				  		
				  		//Time to add to the stat sheet!
				  		name.add("Government Type: Democratic Republic"); //Add the Government type to the name data
				  		
				  		//Add the skills to the stat sheet.
				  		skill.add("Tarrif Trading +1");
				  		skill.add("Cash Crops +1");
				  		skill.add("Army +1");
				  		skill.add("Alliance +1");
				  		
				  		progress++; //Next!
				  		break;
				  		
				  	case "Socialist State":
				  		System.out.println("You have selected Socialist State as your Government Type.");
				  		
				  		//Add to the top of the sheet.
				  		name.add("Government Type: Socialist State");
				  		
				  		//Adding Powers
				  		skill.add("Industiral Mechanations +1");
				  		skill.add("Secret Police +1");
				  		skill.add("State Owned Business +1");
				  		skill.add("National Pride +1");
				  		
				  		//Adding Historical Importances.
				  		feat.add("Labor Surplus");
				  		feat.add("Revolutionaries");
				  		feat.add("The Party");
				  		
				  		progress++; //Next!
				  		break;
				  		
				  	case "Successor State": //And here's a complex one
				  		int progress2 = 0; //Initialize the step counter.
				  		
				  		System.out.println("You have selected Socialist State as your Government Type. Please enter the Government Type that you start as.");
				  		
				  		name.add("Government Type: Successor State"); //Add this to the top of the sheet
				  		
				  		do{
					  		String firstGovernment = c.nextLine(); //Holds the command for the government type.
				  			
				  		switch (firstGovernment){
				  			default: System.out.println("Please use correct capitalization, and include the entirety of the Government Type. Example: Democratic Republic.");
				  			break;//Loop!
				  			
				  			case "Democratic Republic":
						  		System.out.println("You have selected Democratic Republic as your Former Government Type.");
						  		
						  		//Add this to the top!
						  		name.add("Former Government Type: Democratic Republic");
						  		
						  		//And add the powers.
						  		skill.add("Tarrif Trading +1");
						  		skill.add("Cash Crops +1");
						  		skill.add("Army +1");
						  		skill.add("Alliance +1");
						  		
						  		progress2++; //Next step!
						  		break;
						  		
				  			case "Socialist State":
				  				
				  				//Add this to the top
				  				name.add("Former Government Type: Socialist State");
				  				
				  				//Adding the powers
						  		skill.add("Industiral Mechanations +1");
						  		skill.add("Secret Police +1");
						  		skill.add("State Owned Business +1");
						  		skill.add("National Pride +1");
						  		
						  		//Adding the Historical Importances
						  		feat.add("Labor Surplus");
						  		feat.add("Revolutionaries");
						  		feat.add("The Party");
				  				
						  		progress2++; //Next!
						  		break;
				  		} //End switch
				  		} while (progress2 == 0);
				  		
				  		do{
				  		String secondGovernment = c.nextLine(); //Holds the command for the second government type.
				  		
				  		switch (secondGovernment){
				  			default: System.out.println("Please use proper capitalization when selecting your second government subclass");
				  			break;
				  			
				  			case "Democratic Republic":
				  				System.out.println("Your Nation is now a Democratic Republic.");
				  				
				  				//Add this to the top of the sheet
				  				name.add("Current Government Type: Democratic Republic");
				  				
				  				progress2++; //Next!
				  				
				  			case "Socialist State":
				  				System.out.println("Your Nation is now a Socialist State.");
				  				
				  				//Add this to the top of the sheet.
				  				name.add("Current Government Type: Socialist State");
				  				
				  				progress2++; //And next!
				  		} //End switch
				  		
				  		}while(progress2 == 1);
				  		
				  		System.out.println("Successor State completed.");
				  		
				  		progress++; //And let's get out of this part of character creation!
				  		break; //End Selector State
				  }//End Switch
			  }while (progress == 2); //End Government Type Selection
			  
			  do{
				  
				  //And now let's print out the newly created character!
				  System.out.println("Displaying newly created nation. Please copy and paste the following information into a txt file.");
				  //System.out.println("In the future, there will be an export command which will create a text file.");
				  
				  System.out.println("");
				  System.out.println("Player and Nation Information:");
				  System.out.println(name);
				  System.out.println("Statline:");
				  System.out.println(stat);
				  System.out.println("Powers:");
				  System.out.println(skill);
				  System.out.println("Historical Importances:");
				  System.out.println(feat);
				  
				  progress++; //And bring us out of Nations the RPG Character Creation!
			  }while(progress == 3);
		  } //End Nations the RPG character creation
		  
		  if (gameSystem == 2){
			  do{
			  System.out.println("You have created a new adventurer called: " +characterName);
			  System.out.println("Warning, the Pathfinder option is not yet complete, as the game is much more expansive than can be covered in a single semester's worth of work.");
			  System.out.println("For now, this does nothing so have a kitten.");
			  System.out.println(":3");
			  progress++;
			  
			  }while (progress == 0);
			  
		  } //end Pathfinder character Creation
	  //} //End while loop
		  
  }  //End characterCreation
 
  
}//End Public Class Character Creator