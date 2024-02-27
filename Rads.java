class Rads extends ConsoleProgram {

  /**
  * Program Rads.java converts degree measures to radian measures
  * @author: E. Yap
  */
  
  public void run() {
    
    // Variables
    double dblDegrees;
    double dblRadians;

    // Get degree measures
    dblDegrees = readDouble("Enter the angle in degrees:");

    // Comupte radian measures
    dblRadians = Math.toRadians(dblDegrees);

    //Output radian measures
    System.out.println(dblDegrees + "degrees =" + dblRadians + "radians");
  }
}