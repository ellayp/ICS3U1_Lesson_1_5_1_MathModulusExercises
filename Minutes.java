class Minutes extends ConsoleProgram {

  /**
  * Program Minutes.java lets you enter a number of minutes, and that will calculate the number of days, hours, and minutes that represents.
  * @author: E. Yap
  */
  
  public void run() {
    
    // Variables
    int intMinutes;
    int intDays;
    int intHours;
    int intLeftoverMinutes;

    // Get Minutes Variable
    intMinutes = readInt("Enter a number of minutes: ");

    // Compute Days, Hours, and Leftover Minutes
    intDays = intMinutes / 1440;
    intLeftoverMinutes = intMinutes % 1440;

    intHours = intLeftoverMinutes / 60;
    intLeftoverMinutes = intLeftoverMinutes % 60;

    // Output
    System.out.println(intMinutes + " minutes = " + intDays + " days, " + intHours + " hours, and " + intLeftoverMinutes + " minutes");
  }
}