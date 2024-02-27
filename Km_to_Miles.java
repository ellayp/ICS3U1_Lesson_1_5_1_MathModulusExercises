
class Km_to_Miles extends ConsoleProgram {

  /**
  * Program Km_to_Miles.java lets you enter a distance in kilometers and that converts it into miles (1 km = 0.621371 miles).
  * @author: E. Yap
  */
  
  public void run() {
    
    // Variables
    double dblKmDistance;
    double dblMilesDistance;

    // Get Km Distance
    dblKmDistance = readDouble("Enter a distance in kilometers: ");

    // Compute Miles Distance
    dblMilesDistance = dblKmDistance * 0.621371;
    
    // Output Km to Miles
    System.out.println(dblKmDistance + " kilometers = " + dblMilesDistance + " miles");
  }
}
