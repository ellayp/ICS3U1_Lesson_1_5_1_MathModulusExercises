class Circumference extends ConsoleProgram {

  /**
  * Program Circumference.java computes the circumference of a circle given a radius from user entry.
  * @author: E. Yap
  */
  
  public void run() {
    // Variables
    double dblRadius;
    double dblCircumference;

    // Get radius value
    dblRadius = readDouble("Enter the length of the radius of the circle: ");
    
    //Compute circumference = 2 * PI * r
    dblCircumference = dblRadius * 2 * Math.PI;

    //Output circumference
    System.out.println("Circumference: " + dblCircumference);
  }
}