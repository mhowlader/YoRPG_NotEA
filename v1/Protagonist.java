/* That Better Team (Hasif Ahmed, Mohtasim Howlader, Kyle Tau)
APCS1 pd 2
HW 28 -- Ye Olde Role Playing Game
11-09-17 */

public class Protagonist{
    private String name; 
    private int life; //HP
    private int strength;
    private int defense;
    private double attackr; //Attack Rating

    public Protagonist(String x){
	name = x;
	life = 125;
	strength = 100;
	defense = 40;
	attackr = .4;
    }
    public boolean isAlive(){
	return life > 0; //checks if alive
    }
	
	//Accessors
    public int getDefense(){
	return defense;
    }
    public String getName(){
	return name;
    }
	
	//Lowers HP by specific amount
    public void lowerHP(int x){
	life -= x; //subtracts x from total HP
    }
	
	
    public int attack(Monster x){
	int damage = (int) (strength * attackr) - x.getDefense(); //damage inflicted calculation
	x.lowerHP(damage); //lowers HP by damage
	return damage;
    }
	
	//Special Attacl
    public void specialize(){
	defense -= 10; //reduces defense
	attackr += .6; //increases Attack Rating
    }
	
	//Sets defense and attack rating to base values
	//Prepares for Normal Attack
    public void normalize(){
	defense = 40; 
	attackr = .4;
    }
}
    
	
