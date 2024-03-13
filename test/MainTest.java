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
    @Test void CalcularSuma2(){
        int num1 = 8;
        int num2 = 5;
        int expected = 13;
        assertEquals(expected,Calculadora.suma(num1,num2));
    }
}