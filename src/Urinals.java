import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

/**Title : Urinals Testing (ICA8)
 *  @author: Chedvihas Punnam
 *
 */
public class Urinals {
    public static void main(String[] args) throws IOException {

        Functions func = new Functions();


        System.out.println("Enter K to give input from keyboard");
        System.out.println("Enter F to give input from file");

        String command = func.getString();

        if (command.equals("K")){
            String input = func.getString();
            Integer out = func.countUrinals(input);
            System.out.println("Urinals count : " + func.countUrinals(input));
        }

        else if (command.equals("F")) {

            String file_path = "src/urinal.dat";

            func.openFile(file_path);

        }

        else {
            System.out.println("Invalid command, please choose from above commands");
        }











    }


}