public class Berserker extends Protagonist{ 
  public Berserker(String name){

    super(name);
    life = 80;
    attackr=0.6;
  }
  public void normalize(){
    defense=40;
	attackr=0.6;
	
  }
  
  public void specialize() {
	  defense-=10;
	  attackr+=0.3;
  }
  

  public String about(){
    return "Berserker is a hero class that has low HP, high attack rating, and regular defense.";
  }
  
  public String firstAttName() {
	return "Normal Slash";
  }
  
  public String secAttName() {
	return "Heightened Slash";
  }
  
  public String thirAttName() {
	return "Berserker's Bane";
	
  }
  
  public void secAtt() {
	  if (Math.random() <0.5) { //50% chance of being beneficial
		  defense += 20;
		  System.out.println("Defense has increased!");
	  }
	  else {
		  defense-=10;
		  System.out.println("Defense has decreased!");
	  }
  }
  
  public void thirAtt() {
	  attackr += 0.4;
	  defense += 30;
  }
  	 
	  
  
}

