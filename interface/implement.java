// Basically just a regular class, but methods must match exactly with interface
public class AnImplementation implements AnInterface {
  private boolean gender;
  private int age;
  
  public AnImplementation(int agein, boolean maleOrFemale) {
    age = agein;
    gender = maleOrFemale;
  }
  
  // Changes gender
  public void genderSet(boolean in) {
    gender = in;
  }
  
  // Ages by 1 year and returns new age
  public int ageUp() {
    age++;
    return age;
  }
}
