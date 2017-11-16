/* That Better Team (Hasif Ahmed, Mohtasim Howlader, Kyle Tau)
APCS1 pd 2
HW 28 -- Ye Olde Role Playing Game
11-09-17 */

public abstract class  Protagonist extends Character{
    protected String name; 
    //protected int life; //HP
    //protected int strength;
    //protected int defense;
    //protected double attackr; //Attack Rating


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
    public abstract void specialize();
	
	//Sets defense and attack rating to base values
	//Prepares for Normal Attack
    public abstract void normalize();

    public abstract String about();
	
	public abstract String firstAttName();
	
	public abstract String secAttName();
	
	public abstract String thirAttName();
	
}
    
	
