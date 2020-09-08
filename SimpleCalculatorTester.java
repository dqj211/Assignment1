import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTester {

    SimpleCalculator sc;
    @BeforeEach
    void setUp() throws Exception {
        sc = new SimpleCalculator();
    }

    @Test
    void test() {
        assertEquals("40",sc.calculate("40*1"));
    }
    @Test
    void test2() {
        assertEquals("42",sc.calculate("40+2"));
    }
    @Test
    void test3() {
        assertEquals("Invalid expression",sc.calculate("40)86+2"));
    }
}


