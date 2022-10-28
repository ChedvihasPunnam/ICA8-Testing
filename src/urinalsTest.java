import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class urinalsTest {
    @Test
    void good_string_test() {

        Functions func = new Functions();
        Boolean out = func.goodString("Chedvihas Punnam");
        Assertions.assertEquals(false, out);
    }

}