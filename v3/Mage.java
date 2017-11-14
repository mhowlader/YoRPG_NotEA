public class Mage extends Protagonist{ 
  private String name = "MagicMan";
  public Mage(){
    super(name);
    life = 175;
    defense = 25;
  }
  public void normalize(){
    defense = 25;
  }
}
