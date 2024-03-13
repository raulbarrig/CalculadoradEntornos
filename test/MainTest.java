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
    @Test void CalcularSuma3(){
        int num1 = 1;
        int num2 = 1;
        int expected = 2;
        assertEquals(expected,Calculadora.suma(num1,num2));
    }@Test void CalcularResta(){
        int num1 = 6;
        int num2 = 3;
        int expected = 3;
        assertEquals(expected,Calculadora.resta(num1,num2));
    }@Test void CalcularResta2(){
        int num1 = 10;
        int num2 = 5;
        int expected = 5;
        assertEquals(expected,Calculadora.resta(num1,num2));
    }
    @Test void CalcularResta3(){
        int num1 = 2;
        int num2 = 1;
        int expected = 1;
        assertEquals(expected,Calculadora.resta(num1,num2));
    }@Test void CalcularMultiplicacion(){
        int num1 = 2;
        int num2 = 3;
        int expected = 6;
        assertEquals(expected,Calculadora.multiplicacion(num1,num2));
    }
    @Test void CalcularMultiplicacion2(){
        int num1 = 3;
        int num2 = 3;
        int expected = 9;
        assertEquals(expected,Calculadora.multiplicacion(num1,num2));
    }
}