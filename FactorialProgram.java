/**
 * Calculates and displays the factorial for a number from the commandline.
 * @author Lisa Miller from W Albritton
 * @since 1/28/24
 */
public class FactorialProgram {
   /**
    * Main method.
    * @param args 1st argument should be a non-negative int
    */
   public static void main(String[] args) {
      // check for correct number of commandlineArguments (at least 1)
      // always print instructions for useage here if using args.
      if (args.length == 0) {
         System.out.print("Error: program requires an int");
         System.out.println(" >= 0 as a commandline argument.");
      }
      else {
         // initialize variables
         int number = 0;
         int result = 0;
      
         // error checking to see if first arg is an integer
         try {
            number = Integer.parseInt(args[0]);
            // call method & display results
            result = factorial(number);
         // error checking to see if it is non-negative
            if (result == -1) {
               System.out.println("ERROR: Negative integers are undefined");
            }
            else {
               System.out.println(number + "! = " + result);
            }
         }
         catch (NumberFormatException exception) {
            System.out.println("The first commandline argument is not an integer");
         }
      
      }
   } // end of main

   /**
    * Computes the factorial of a nonnegative number.
    * @param n is a nonnegative integer
    * @return the factorial of n, or -1 for negative integers (error)
    */
   public static int factorial(int n) {
      int product = 1; //def of 0!
      int i = n;
      // check for negative integers
      if (n < 0) {
         product = -1; // error condition 
      } else {
         while (i > 0) { //if i == 0 loop will not run
            product *= i;
            i--;
         }
      }
      // return result of factorial
      return product;
   }

} // end of class
