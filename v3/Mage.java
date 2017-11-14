public class Mage extends Protagonist{ 
  public Mage(){
    super(name);
    life = 175;
    defense = 25;
  }
  public void normalize(){
    defense = 25;
  }
  public static String about(){
    return "Mage is a hero class that has high HP, low defense, and regular attack rating."
  }
}
