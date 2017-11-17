public class Mage extends Protagonist{ 
  public Mage(String name){

    super(name);
    life = 175;
    defense = 25;
  }
  public void normalize(){
	attackr=0.40;
    defense = 25;
  }
  public void specialize() {
	  defense-=5;
	  attackr+=0.20;
  }
  

  public String about(){
    return "Mage is a hero class that has high HP, low defense, and regular attack rating.";
  }
  
  public String firstAttName() {
	return "Fireball Spell";
  }
  
  public String secAttName() {
	return "Enhanced Fireball Spell";
  }
  
  public String thirAttName() {
	return "Regeneration";
	
  }
  
  public void secAtt() {
	  if (Math.random() <0.5) { //50% chance of being beneficial
		  defense += 30;
		  System.out.println("Defense has increased!");
	  }
	  else {
		  defense-=15;
		  System.out.println("Defense has decreased!");
	  }
  }
  
  public void thirAtt() {
	  life+=60;
  }
  
}

