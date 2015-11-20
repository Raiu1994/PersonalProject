package edu.saintjoe.cs.griffinscott;

import java.util.Scanner;

public class gameSelector extends CharacterCreator{

	public int gameSelector(int gameSystem){ //This is where the user selects which game system they want to chose.
	      Scanner s = new Scanner(System.in);

	      System.out.println("This is the Game Selection area. Please type the number of the game system that you want to use. To see what game systems are avaliable, please type help and press enter."); //Prints the instructions for this part of the program.

	      String whatGameString = s.nextLine();

	      int whatGameInt = Integer.parseInt(whatGameString);

	      switch (whatGameString){
	      	case "List": System.out.println("Currently, there are two game systems avaliable: Nations the RPG and Pathfinder. To select a system, type the first part of the system's name into the console. For example, Nations the RPG would be 'Nations'");
	      		break;
	      	case "Nations": System.out.println("You have selected Nations the RPG.");
	      		gameSystem = 1; //Sets gameSystem to Nations the RPG.
	      		break;
	      	case "Pathfinder": System.out.println("You have selected Pathfinder. WARNING this game system is incomplete.");
	      		gameSystem = 2; //Sets gameSystem to Pathfinder.
	      		break;
	      default: System.out.println("I'm sorry, but that is not a valid command. For a list of Game Systems, please enter the word 'Help'.");
	      }

	      return gameSystem; //Sends back the chosen game system to 
	    }//End gameSelector

}
