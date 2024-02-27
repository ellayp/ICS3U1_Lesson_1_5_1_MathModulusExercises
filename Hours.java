class Hours extends ConsoleProgram {

  /**
  * Program Hours.java lets you enter a number of hours, and that converts it to days and hours. For example, 111 hours = 4 days and 15 hours.
  * @author: E. Yap
  */
  
  public void run() {
    
    // Variables
    int intHours;
    int intDays;
    int intLeftoverHours;

    // Get Variable Hours
    intHours = readInt("Enter a number of hours: ");
    
    // Compute Days and Hours
    intDays = intHours / 24;
    intLeftoverHours = intHours % 24;

    // Output Days and Hours
    System.out.println(intHours + " hours = " + intDays + " days and " + intLeftoverHours + " hours ");
  }
}