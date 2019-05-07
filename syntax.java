public class Syntax {
  public static void main(String[]args) {
    /* PRIMITIVES */
    int x = 15;
    int y = 4; 
    double z = x / y; // z = 3 due to integer division on the right side truncating the remainder of x / y which would be 3.75
    boolean val = true; // booleans can either be true or false, useful when evaluating relational and conditional expressions
    // float, short, long, char are also primitives 
    
    /* CASTING */
    double cast = (int) (15 / 4); // cast = 3 because it evaluates inside the parentheses and then casts it
    double castBetter = (int) (15.0 / 4); // castBetter = 3 because it truncates the decimal when casting to int
    // For casting objects, you want to make sure that the right side "is a" left side (see below)
      // (Manager) (employeeObject) does not work because not all employees are managers [employee "is a" manager is false]
    // For initializing objects, use the same strategy
    Employee bob = new Manager(); // this works [manager "is a" employee is true]
    // Watch out for inheritance and interface relationships, as you cannot initialize something across these classes
    
    /* STRINGS */
    String owo = "AP-CSA "
    int len = owo.length(); // len = 7 (spaces and symbols count)
    int index = owo.indexOf("A"); // index = 0, since strings start at index 0 and the FIRST occurence is at 0
    int substring = owo.substring(3,5); // substring = "CS", since it displays the first index parameter up to the second paramter index BUT does not display the last index
    boolean comparison = owo.equals("AP-CSA1"); // comparison = false due to nonequality (DO NOT USE == for strings since they are objects)
    // Remember to treat a String as an object, not a primitive
    
    /* ARRAYS */
    // Direct Initialization
    int[] grades = {98, 90, 56};
    // Initialization
    int[] gradebook = int[25]; // int array with 25 terms (index 0-24)
    Grade[] individual = Grade[25]; // same thing but with an object
    // Accessing
    int aGrade = gradebook[3]; // sets aGrade to the int at the 3rd index of gradebook (4th term)
    int lenArr = gradebook.length; // lenArr = 25, no parentheses following length
    
    /* ARRAYLISTS */
      
    /* LOOPS */
    
    /* IF, ELSE IF, ELSE */
  }
}
