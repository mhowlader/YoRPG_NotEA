public class Tank extends Protagonist {
  private String name = "BigMan";
  public Tank() {
    super("BigMan");
    attackr = 0.2;
    defense = 70; }
  public void normalize() {
    attackr = 0.2;
    defense = 70; }
  public static String about(){
    return "Tank is a hero class that has high defense, low attack rating, and regular HP."
  }
    }
