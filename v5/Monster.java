/* That Better Team (Hasif Ahmed, Mohtasim Howlader, Kyle Tau)
APCS1 pd 2
HW 28 -- Ye Olde Role Playing Game
11-09-17 */

public class Monster extends Character{
    protected String name;
    protected int life;
    protected int strength;
    protected int defense;
    protected double attackr; //Attack Rating

    public Monster(){
	name = "ye olde monster";
	life = 150;
	strength = (int) (Math.random() * 60) + 20; //Randomly sets strength between 20 and 65
	defense = 20;
	attackr = 1.0;
    }
    public boolean isAlive(){
	return life >  0; //checks if Alive
    }
	
	//Accessors
    public int getDefense(){
	return defense;
    }
    public String getName(){
	return name;
    }
	
	//Lowers HP of Monster by specific amount
    public void lowerHP(int x){
	life -= x;
    }
	
	//Attacks Protagonist
    public int attack(Protagonist x){
	int damage = (int) (strength * attackr) - x.getDefense(); //calculations for damage inflicted to protagonist
	x.lowerHP(damage); //Lowers Protagonist's HP by damage
	if (damage < 0) {
		return 0;
	}
	return damage;
    } 
}
