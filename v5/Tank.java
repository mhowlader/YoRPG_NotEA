public class Tank extends Protagonist {

  //private String name = "BigMan";
  public Tank(String name) {
    super(name);
    attackr = 0.2;
    defense = 70; }
  public void normalize() {
    attackr = 0.2;
    defense = 70; 
  }
  
  public void specialize() {
	  defense-=20;
	  attackr+=0.3;
  }
  

  public String about() {
    return "Tank is a hero class that has high defense, low attack rating, and regular HP.";
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
