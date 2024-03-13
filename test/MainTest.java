import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void CalcularSuma(){
        int num1 = 2;
        int num2 = 3;
        int expected = 5;
        assertEquals(expected,Calculadora.suma(num1,num2));
    }
}