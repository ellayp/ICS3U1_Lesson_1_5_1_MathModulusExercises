class FtoC extends ConsoleProgram {

  /**
  * Program FtoC.java lets you enter a degree measure in Fahrenheit, and that prints the result in Celsius degree.
  * @author: E. Yap
  */
  
  public void run() {
    
    // Variables
    double dblFahrenheitDegree;
    double dblCelsiusDegree;

    // Get Farenheit degree measure
    dblFahrenheitDegree = readDouble("Enter a degree measure in Fahrenheit: ");
    
    // Compute Celsius degree measure
    dblCelsiusDegree = 5/9 * (dblFahrenheitDegree - 32);

    // Output Celsius degree measure
    System.out.println(dblFahrenheitDegree + " degrees Fahrenheit = " + dblCelsiusDegree + " degrees Celsius");
  }
}