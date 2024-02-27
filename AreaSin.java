class AreaSin extends ConsoleProgram {

  /**
  * Program AreaSin.java uses the Math.sin() function to calculate the area of a triangle, given two sides and the contained angle.
  * @author: E. Yap
  */
  
  public void run() {
    // Variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblTriangleArea;

    // Get variable values
    dblSideA = readDouble("Enter the length of Side A: ");
    dblSideB = readDouble("Enter the length of Side B: ");
    dblAngleC = readDouble("Enter the length of the contained angle: ");

    // Compute Triangle Area
    dblTriangleArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC))) / 2;
  
    // Output Area
    System.out.println("The area of the triangle is " + dblTriangleArea);
  }
}