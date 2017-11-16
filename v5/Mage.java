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
	return "Meditation";
  }
  
  public String secAttName() {
	return "Sec";
  }
  
  public String thirAttName() {
	return "thir";
	
  }
  
  
}

