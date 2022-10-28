import java.util.Scanner;

public class Functions {

    public String getString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String input = scanner.nextLine();
        return input;
    }

    Boolean openFile(String file_path){
        System.out.println ("Not yet implemented");

        return false;
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

        if (!goodString(s)){
            return -1;
        }
        StringBuilder input = new StringBuilder(s);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '0'){
                if(i==0 ){
                    if (input.charAt(i+1) == '0' ){
                        input.replace(i,i+1,"1");
                        counter = counter + 1;
                    }
                }
                else if (i==input.length()-1) {
                    if (input.charAt(i-1) == '0'){
                        input.replace(i,i+1,"1");
                        counter = counter + 1;
                    }
                }
                else {
                    if (input.charAt(i+1) == '0' && input.charAt(i-1) == '0'){
                        input.replace(i,i+1,"1");
                        counter = counter + 1;
                    } }
            }
        }
            return counter;
    }

}
