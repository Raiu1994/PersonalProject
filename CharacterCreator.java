package edu.saintjoe.gscott;

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

  public static void main(String[] args){ //This is where the magic happens. This is going to be really big.
	  Scanner m = new Scanner(System.in);
	  int progress = 0; //This holds the key to ensure that the program will loop until a valid command is inputted.
	  Scanner name = new Scanner(System.in);

	  System.out.println("Welcome to Griffin Scott's Ultimate Character creator! For a list of commands, please type help and then press enter.");

	  String commandString = m.nextLine();

	  if (progress == 0){ //With an if statement, it terminates after the first command. With a while statement, it loops infinitely.
		  switch(commandString){
		  	case "help": System.out.println("The following commands are avaliable. Game Selector: Allows selection of game system. Load: Opens the Load Character Sheet Program. Create Character: Creates a new character using the currently selected system. Delete Character: Opens the Delete Character program.");
		  		//break; //Lets see if break is breaking my code.
		  	case "Game Selector": //This will proc gameSelector, allowing the user to select which game system they want to use.
		  		//Put in the Game Selector command.
		  		progress++;
		  		break;
		  	case "Load": //This will ask for the name of a character, in order to load it.
		  		progress++;
		  		break;
		  	case "Create Character": //Begins the Character Creation Process for the currently selected system.
		  		//Put in Character Creator command.
		  		progress++;
		  		System.out.println("Please insert the name of the character you want to create.");
		  	  String characterName = name.nextLine();
		  	  System.out.println("Creating a character with the name : " +characterName);
		  		break;
		  	case "Delete Character": //Asks for the name of the character to remove.
		  		progress++;
		  		break;
		  	default: System.out.println("I'm sorry, the command you entered was not valid. If you need help with the commands, please enter help.");
		  	break;
		  }
	  }
  } //End Main

}
