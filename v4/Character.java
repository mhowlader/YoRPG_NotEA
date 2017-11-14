public class Character {
    protected int life;
    protected int strength;
    protected int defense;
    protected double attackr;

    public boolean isAlive() {
	return life > 0; //checks if alive
    }

    public int getDefense(){
	return defense;
    }

    //Lowers HP by specific amount
    public void lowerHP(int x){
	life -= x; //subtracts x from total HP
    }

    public int attack(Character x){
	int damage = (int) (strength * attackr) - x.getDefense(); //damage inflicted calculation
	x.lowerHP(damage); //lowers HP by damage
	return damage;
    }
}
