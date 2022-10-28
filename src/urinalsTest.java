import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class urinalsTest {
    @Test
    void good_string_test() {

        Functions func = new Functions();
        Boolean out = func.goodString("Chedvihas Punnam");
        System.out.println("============== Chedvihas Punnam == TEST ONE EXECUTED=================");
        Assertions.assertEquals(false, out);
    }

    @Test
    void countUrinals_test(){

        Functions func = new Functions();
        Integer out = func.countUrinals("10001");
        System.out.println("========== Chedvihas Punnam == TEST TWO EXECUTED=====================");
        Assertions.assertEquals(1,out);
    }


}