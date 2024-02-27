class Cos3rd extends ConsoleProgram {

  /**
  * Program Cos3rd.java lets you enter two sides of a triangle and the contained angle, and that will use the cosine law to calculate the third side. 
  * @author: E. Yap
  */
  
  public void run() {
    // Get variables
    double dblSideA;
    double dblSideB;
    double dblContainedAngle;
    double dblSideC;

    // Get Side A variable
    dblSideA = readDouble("Enter the length of Side A: ");

    // Get Side B variable
    dblSideB = readDouble("Enter the length of Side B: ");

    // Get Contained Angle variable
    dblContainedAngle = readDouble("Enter the length of the contained angle: ");
  
    // Comupte the length of the third side (Side C)
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblContainedAngle)));
  
    // Output
    System.out.println("The length of the third side = " + dblSideC);
  }
}