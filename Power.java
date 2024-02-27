class Power extends ConsoleProgram {

  /**
  * Program Power.java lets you enter two numbers a and b, and that prints out a to the power of b.
  * @author: E. Yap
  */
  
  public void run() {
    
    // Variables
    double dblVariableA;
    double dblVariableB;
    double dblPower;

    // Get Variables (A and B)
    dblVariableA = readInt("Enter a number: ");
    dblVariableB = readInt("Enter a second number: ");

    // Compute Power
    dblPower = Math.pow(dblVariableA, dblVariableB);
    
    // Output
    System.out.println(dblVariableA + " to the power of " + dblVariableB + " = " + dblPower);
  }
}