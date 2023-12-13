import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4 ,Calculator.add(2,2));
    }
    @Test
    void resta(){
        assertEquals(3, Calculator.resta(-2,-5));
    }



    @Test
    void multiply() {
        assertAll(
                () -> assertEquals(4, Calculator.multiply(2,2)),
                () -> assertEquals(4,Calculator.multiply(-4,-1)),
                () -> assertEquals(8, Calculator.multiply(4,2)),
                () -> assertEquals(20, Calculator.multiply(10,2))
        );
    }
}