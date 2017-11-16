public class Boss extends Monster{
    public Boss(){
	super();
	attackr = .5;
	defense = 50;
	life = 150;
    }
    public int attackspecial(Protagonist x){
	int damage = ((int)((strength * attackr) * 1.2)) - x.getDefense();
	x.lowerHP(damage);
	return damage;
    }
   public static String about(){
    return "Boss is a monster class that has all the high traits of each monster class. He also has two attacks, his special and the normal attack. His special takes two turns to charge up.";
  }
    //His attackspecial is used after every 2 rounds
	
}
