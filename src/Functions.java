import java.util.Scanner;

public class Functions {

    public String getString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String input = scanner.nextLine();
        return input;
    }

    Boolean goodString( String s ) {  // checks to see if valid string

        Integer check = s.length();
        for(int i=0; i < check; i++)
        {
            if(s.charAt(i)!='0' && s.charAt(i)!='1')
            {
                return false;
            }

            if(i+1 < check)
            {
                if(s.charAt(i)=='1' && s.charAt(i+1)=='1')
                {
                    return  false;
                }
            }

        }
        return true;


    }
    public Integer countUrinals(String s)
    {

        System.out.println("Not yet implemented");
            return 0;
    }

}
