import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean salida = true;
        do {
            System.out.println("--Calculadora--");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("0.Salir");
            System.out.print("¿Que opcion quieres realizar?: ");
            String opcion = sc.next();
            opcion = opcion.trim();
            switch (opcion) {
                case "1":
                    System.out.print("Introduce un numero: ");
                    double num1 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    double num2 = sc.nextInt();
                    System.out.println("La suma es: " + Calculadora.suma(num1, num2));
                    break;
                case "2":
                    System.out.print("Introduce un numero: ");
                    double num3 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    double num4 = sc.nextInt();
                    System.out.println("La resta es: " + Calculadora.resta(num3, num4));
                    break;
                case "3":
                    System.out.print("Introduce un numero: ");
                    double num5 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    double num6 = sc.nextInt();
                    System.out.println("La multiplicacion es: " + Calculadora.multiplicacion(num5, num6));
                    break;
                case "4":
                    System.out.print("Introduce un numero: ");
                    double num7 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    double num8 = sc.nextInt();
                    if (num8 != 0) {
                        System.out.println("La division es: " + Calculadora.division(num7, num8));
                    } else {
                        System.out.println("La division es: 0");
                    }
                    break;
                case "0":
                    System.out.println("Hasta otra");
                    salida = false;
                    break;
                default:
                    System.out.println("Error");
            }
        }while(salida);
    }
}