public class Berserker extends Protagonist{ 
  private String name = "AngryMan";
  public Berserker(){
    super(name);
    attackr = .7;
    life = 75;
  }
  public void normalize() {
    attackr = .7;
  }
}
