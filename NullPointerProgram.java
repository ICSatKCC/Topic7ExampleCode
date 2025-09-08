/**
 * Demonstrates a NullPointerException.
 * 
 * @author William McDaniel Albritton
 * @author Lisa Miller
 * @since 2/5/2018
 */
public class NullPointerProgram {

   /**
    * main method: begins program.
    * @param arguments is not used
    */
   public static void main(String[] arguments) {

      Integer x = Integer.valueOf(5); // initialize variable
      x = null; // set the address to nothing
      String str = x.toString(); // throws NullPointerException
      System.out.println(str);
   
   } // End of Main.

} // End of Class.

