import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorTest {

    @Disabled("@DisplayName ignored")
    @DisplayName("Calculator Tests - Labb2")

    @BeforeAll
    public static void msg(){
        System.out.println("Denna skrevs ut med BeforeAll");
    }

    @RepeatedTest(3)
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void testSub(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.sub(4,2));
    }

    @Test
    void testDiv(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(4,2));
    }

    @Test
    void testMulti(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multi(2,2));
    }

    @Test
    void testTrue(){
        Calculator calculator = new Calculator();
        assertTrue(calculator.multi(2,2)==4);
    }


}