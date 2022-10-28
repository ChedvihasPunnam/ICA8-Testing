import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class urinalsTest {
    @Test
    void string_test() {
        Functions func = new Functions();

        Boolean out = func.goodString("Chedvihas Punnam");
        System.out.println("====== Chedvihas Punnam == TEST ONE EXECUTED =======");
        Assertions.assertEquals(false, out);
    }
}