import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;


/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) {
        // Replace this with statements to set the file name (input) and file name (output).
        String inputFilename = ("input.txt"); // default input filename
        String outputFilename = ("output.html"); // default output filename

        // check if the filenames are passed as arguments
     if (args.length == 2) {
         inputFilename = args[0];
         outputFilename = args[1];
    }
        // Set up a new Scanner to read the input file.
        Scanner in = null;
    try {
        in = new Scanner(new FileReader(inputFilename));
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + inputFilename);
        System.exit(0);
    }

        // Set up a new PrintWriter to write the output file.
         PrintWriter out = null;
    try {
        out = new PrintWriter(new FileWriter(outputFilename));
    } catch (IOException e) {
        System.out.println("Error opening file for writing: " + outputFilename);
        System.exit(0);
    }

        // Finally, add code to read the filenames as arguments from the command line.

        // Processing line by line
    while (in.hasNextLine()) {
        String line = in.nextLine();
        
        // echo the text to System.out to check you are reading correctly.
        System.out.println(line);
        
        // modify the text to the output format.
        String[] words = line.split("\\s+"); // split the line by whitespace
        for (String word : words) {
            if (word.matches("[A-Za-z]+")) { // check if the word contains only letters
                out.print(word.toUpperCase() + " "); // convert to upper case and write to output
            }
        }
        out.println(); // write a new line to the output file
    }
    
    // Close the input and output files
    in.close();
    out.close();

  } // main
}// FilesInOut
