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
  
  public String firstAtt() {
	  return "First";
  }
  
  public String secAtt() {
	  return "Second";
  }
  
  public String thirAtt() {
	  return "Third";
  }
  
	  
}

