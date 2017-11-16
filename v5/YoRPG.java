/**********************************************
 * That Better Team (Hasif Ahmed, Mohtasim Howlader, Kyle Tau)
 * APCS1 pd 2
 * HW 28 -- Ye Olde Role Playing Game
 * 11-09-17 

 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/


import java.io.*;
import java.util.*;

public class YoRPG
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 15;
  private static int encounters = 0; 
	
  //each round, a Protagonist and a Monster will be instantiated...
  private Protagonist pat;   //Is it man or woman?
  private Monster smaug; //Friendly generic monster name?

  private int moveCount;
  private boolean gameOver;
  private int difficulty;
  private int role;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG()
  {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    pre:  
    post: according to user input, modifies instance var for difficulty 
    and instantiates a Protagonist
    =============================================*/
  public void newGame()
  {
    String s;
    String name = "";
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    try {
	    difficulty = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }

    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );

    try {
	    name = in.readLine();
    }
    catch ( IOException e ) { }

    //instantiate the player's character
    //pat = new Protagonist( name );
	
	s= "\n Choose your Role: \n";
	s += "\t1: Tank\n";
	s += "\t2: Berserker\n";
	s += "\t3: Mage\n";
	s += "Selection: ";
	System.out.print(s);
	
	try {
		role = Integer.parseInt( in.readLine() ); //
	}
	catch (IOException e) { }
	
	//assigns subsclass based on number chosen
	if (role == 1) {
		pat = new Tank(name);
	}
	else if (role ==2) {
		pat = new Berserker(name);
	}
	else {
		pat=new Mage(name);
	}
	

  }//end newGame()


  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn()
  {
    int i = 1;
    int d1, d2, selAtck;
	String mName;

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );
		
		//1/3 chance to enounter any of the 3 types of monsters
		double danger = Math.random();
		if (encounters % 3 == 2) {
			smaug = new Boss();
			mName = "Monster King";
		}
	    	else if (danger < 0.333) {
			smaug = new Goblin();
			mName="Goblin";
		}
		else if (danger >=0.333 && danger <0.666) {
			smaug = new Golem();
			mName="Golem";
		}
		else {
			smaug = new Witch();
			mName="Witch";
		}
		
		System.out.println( "\nIt is a " + mName + "!" );
	    

	    while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel lucky?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!" );
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

        if ( i == 2 )
          pat.specialize();
        else
          pat.normalize();
	  
	  try {
			System.out.println( "\nSelect an attack:" );
			System.out.printf( "\n1. %s \t 2. %s \t 3. %s\n", pat.firstAttName(), pat.secAttName(), pat.thirAttName () );
			System.out.print("Selection: ");
			selAtck= Integer.parseInt(in.readLine() );
		}
		catch (IOException e) {}

        d1 = pat.attack( smaug );
        d2 = smaug.attack( pat );

        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");

        System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
                            " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " + 
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
        return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
        return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
        return false;
	    }
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args )
  {
    //As usual, move the begin-comment bar down as you progressively 
    //test each new bit of functionality...

    
    //loading...
    YoRPG game = new YoRPG();

    while( encounters < MAX_ENCOUNTERS ) {
    if ( !game.playTurn() )
		break;
    encounters++;
    System.out.println();
    }

    System.out.println( "Thy game doth be over." );
	/*================================================
	  ================================================*/
  }//end main

}//end class YoRPG


