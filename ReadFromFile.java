import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/** 
 *  Shows How To Read from a File.
 *
 *  @author William Albritton 
 */
public class ReadFromFile {
/**
 * The "main" Method Starts The Program.
 *
 * @param args The First Command Line Argument Is The Input File Name, dude 
 */  
   public static void main(String[] args){//throws FileNotFoundException {
   /*
   To avoid scope issues, initialize all variables at the top of each method.
   "null" means that no address is being assigned. 
   */
      File file = null;
      Scanner readFromFile = null;
      String line = null;
      /*
      Error Checking For Command Line Arguments..
      If no command line arguments are entered, 
      the size of the String array args is zero (0)
      */
      if (args.length == 0) {
         System.out.print("ERROR: Please enter a file name ");
         System.out.println(" as first commandline arg!");
      }
      else {
         //connect to a file (does NOT create a new file)
         file = new File(args[0]);
         try {
         //create a Scanner object to read from the file
            readFromFile = new Scanner(file);
         } 
        catch (FileNotFoundException exception) {
            /*
            Print error message.
            In order to print double quotes("), 
            the escape sequence for double quotes (\") must be used.
    //         */
            System.out.print("ERROR: no File found with name \"");
            System.out.println(args[0] + "\"");
          }        
         //if made connection to file, read from file
         if (readFromFile != null) {
            /*
            In order to print double quotes("), 
            the escape sequence for double quotes (\") must be used.				
            */
            System.out.print("Reading from file \"" + args[0] + "\":\n");
            //keeps looping if file has more lines..
            while (readFromFile.hasNextLine()) {
               //get a line of text..
               line = readFromFile.nextLine();
               //display a line of text to screen..
               System.out.println(line);
            } //end of while
         } //end of if
      } //end of else
   } //end of main() method
} //end of class

/*
output: the contents of the file
*/	



