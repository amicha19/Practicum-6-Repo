// Practicum 6 (Use of a Debugger)

// ----------------------------------------------------------
// This program will convert Celsius to Fahrenheit
// ----------------------------------------------------------

public class Main {
  public static void main(String[] args) {
    
    // init
    
    Scanner input = new Scanner(System.in);
    
    // program greeting
    
    System.out.println(
      "\nConverts temperatures in Celsius to Fahrenheit\n");

    // prompt for input
    System.out.println("Enter temperature (in Celsius): ");
    int cel_temp = input.nextInt();

    // display results
    System.out.println(cel_temp + " Celsius = " + 
                       convertToFahrenheit(cel_temp) +
                       " degrees Fahrenheit");
  
  }

  public static double convertToFahrenheit(int c) {
    return (9.0/5.0 * c) + 32;
  }
  
}
