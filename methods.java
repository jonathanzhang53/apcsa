import java.util.*; // imports all of util package (mostly for Arrays/ArrayLists)

public class Methods {
  public static void main(String[]args) {
    System.out.println("These are useful methods that you should know how to write.");
  }
  
  // Finds minimum value in a collection (can be array/arraylist, int/double)
  public static double findMin(double[] in) {
    double min = Double.MAX_VALUE; // instead of max value, put highest limit of number possible in collection
    for (double i : in) {
      if (i < min) {
        min = i;
      }  
    }
    return min;
    // Do the same thing for max except for set max variable to the lowest possible value
  }
  
  // Finds minimum value of 3 values (can be int/double)
  public static double findMinOf3(double num1, double num2, double num3) {
    return Math.min(num1, Math.min(num2, num3));
    // Do the same thing for max except use Math.max(int, int)
  }
  
  // Replaces something in a String with something else
  public static String replaceString(String in, String gettingReplaced, String replacing) {
      return in.replace(gettingReplaced, replacing); // not within AP subset, but will work and qualifies for points
  }
  
  // Traverses a collection to find a matching object (can be array/arraylist, any object)
  public static Object traverseForEquality(Object[] in, Object key) {
    for (Object i : in) {
      if (i.equals(key)) {
        return true;
      }
    }
    return false;
  }
  
}
