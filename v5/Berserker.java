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
  
  public void classSpecial() {
	  if (Math.random() > 0.7) {
	  	defense -= 20;
	  	attackr += 0.4;}
  	  else {
	  	normalize();
	  }
  }
  public String about(){
    return "Berserker is a hero class that has low HP, high attack rating, and regular defense.";
  }
  
  /*public String firstAttName() {
	return "Meditation";
  }
  
  public String secAttName() {
	return "Sec";
  }
  
  public String thirAttName() {
	return "thir";
	
  }*/
}

