public class Character {
    public int life;
    public int strength;
    public int defense;
    public double attackr;

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
