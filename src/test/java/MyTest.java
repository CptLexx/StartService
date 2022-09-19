import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void test() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StartService service = new StartService();

        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        assertEquals(expected, actual);
    }
}
