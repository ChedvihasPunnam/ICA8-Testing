import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class urinalsTest {
    @Test
    void good_string_test() {

        Functions func = new Functions();
        Boolean out = func.goodString("Chedvihas Punnam");
        System.out.println("==============Chedvihas Punnam== TEST ONE EXECUTED=================");
        Assertions.assertEquals(false, out);
        Assertions.assertEquals(false, func.goodString("11000"));
        Assertions.assertEquals(true, func.goodString("10001"));


    }

    @Test
    void countUrinals_test(){

        Functions func = new Functions();
        Integer out = func.countUrinals("10001");
        System.out.println("==============Chedvihas Punnam== TEST TWO EXECUTED=================");
        Assertions.assertEquals(1,out);
        Assertions.assertEquals(0,func.countUrinals("1001"));

    }

    @Test
    void openFile_test(){

        Functions func = new Functions();
        System.out.println("==============Chedvihas Punnam== TEST THREE EXECUTED=================");
        Assertions.assertEquals(false, func.openFile("src/urinal.dat"));


    }


}