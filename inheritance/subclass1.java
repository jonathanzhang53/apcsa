// Extends superclass and acquires all methods, but can override them
public class Subclass1 extends Super {
  private int num1;
  private int num2; 
  private int num3;
  private String tag;
  private String combined;
  
  public Subclass1(int x, int y, int z, String in) {
    super(y, z, in); // in superclass contstructor, y is now x, z is now y, and in is now z (compare the values)
    num3 = x; // not in old constructor, so must initialize
  }
  
  // overridden method, calls to sum() will now call this method
  public int sum() {
    return num1 + num2 + num3;
  }
  
  // new method that can only be accessed by this class and children
  public String getConcatenate() {
    return super.concatenate(); // calls a method from super explicitly
  }
  
  // no need to include concatenate because it is inherited
}
