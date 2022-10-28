import java.io.*;
import java.util.Scanner;

public class Functions {

    public String getString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String input = scanner.nextLine();
        return input;
    }

    public Boolean openFile(String filepath) {
        try{

            File open_file=new File(filepath);
            if(open_file==null)
                throw new IOException();

            String counter_path = "src/counter.txt";
            File counter_file=new File(counter_path);
            if(counter_file==null){
                throw new IOException();
            }
            Scanner scanner=new Scanner(counter_file);
            int counter=Integer.parseInt(scanner.nextLine());

            String out_file="src/rule.txt";
            if(counter!=0)
                out_file="src/rule"+counter+".txt";

            Scanner scanner1=new Scanner(open_file);

            while(scanner1.hasNextLine()){
                String str=scanner1.nextLine();
                if(str.equals("-1"))
                    break;
                int empty =countUrinals(str);
                writeFile(out_file,empty);

            }

            FileWriter cwriter=new FileWriter("src/counter.txt");
            if(cwriter==null)
                throw new IOException();
            cwriter.write(Integer.toString(counter+1));
            cwriter.close();


            return  true;
        }
        catch(IOException e)
        {
            return false;
        }

    }
    public Boolean writeFile(String out_file,int empty){
        try {
            FileWriter writer = new FileWriter(out_file, true);
            if(writer==null)
                throw new IOException();
            BufferedWriter bw=new BufferedWriter(writer);
            if(bw==null)
                throw new IOException();

            bw.write(Integer.toString(empty));
            bw.newLine();
            bw.close();
            return true;
        }
        catch(IOException e){
            e.printStackTrace();
            return false;
        }
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
