public class Berserker extends Protagonist{ 
  public String name = "AngryMan";
  public Berserker(){
    super(name);
    attackr = .7;
    defense = 25;
  }
  public void normalize() {
    attackr = .7;
    defense = 25;
  }
}
