public class Berserker extends Protagonist{ 
  private String name = "AngryMan";
  public Berserker(){
    super(name);
    attackr = .7;
    life = 75;
  }
  public static String about(){
    return "Berserker is a hero class that has high attack rating, low HP, and regular defense."
  }
  public void normalize() {
    attackr = .7;
  }
}
