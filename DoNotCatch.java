/**
 * Shows exception propagation when a exception is not caught.
 * 
 * @author William McDaniel Albritton
 */
public class DoNotCatch {

   /**
    * main() method: begins program.
    * 
    * @param arguments is not used
    */
   public static void main(String[] arguments) {
      System.out.println("program starting");
      // Give a denominator of zero (0)
      // note the "exception propagation" in the error message
      FractionInterface fraction1 = new Fraction(50, 0);
      System.out.println("program pau already");
   } // End of Main.

} // End of Class.

