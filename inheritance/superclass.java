// Standard class with instance variables, constructor, accessor, mutator
public class Super {
  private int num1;
  private int num2;
  private String tag;
  private String combined;
  
  public Super(int x, int y, String z) {
    num1 = x;
    num2 = y;
    tag = z;
  }
  
  public int getSum() {
    return num1 + num2;
  }
  
  public void concatenate() {
    combined = tag + num1 + num2;
  }
}
