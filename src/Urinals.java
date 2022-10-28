import java.util.Scanner;
import java.lang.*;

/**Title : Urinals Testing (ICA8)
 *  @author: Chedvihas Punnam
 *
 */
public class Urinals {
    public static void main(String[] args) {

        Functions func = new Functions();
        String input = func.getString();
        Integer out = func.countUrinals(input);


        System.out.println("Urinals count : " + func.countUrinals(input));


    }


}