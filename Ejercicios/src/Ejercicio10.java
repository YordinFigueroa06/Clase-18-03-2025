import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        double sueldoOperario = scanner.nextDouble();
        System.out.println("Ingrese sus años de antiguedad");
        double añosAntiguedad = scanner.nextDouble();
        double aumento20 = 0.20;
        double aumento5 = 0.05;
        if (sueldoOperario < 500 && añosAntiguedad >= 10) {
            double calculoAumento = (sueldoOperario * aumento20);
            double sueldoTotal = sueldoOperario + calculoAumento;
            System.out.println("El sueldo a pagar a este operario es: " + sueldoTotal);
        }else if (sueldoOperario < 500 && añosAntiguedad < 10) {
            double calculoAumento = (sueldoOperario*aumento5);
            double sueldoTotal = sueldoOperario + calculoAumento;
            System.out.println("El sueldo a pagar a este operario es: " + sueldoTotal); 
        }else if (sueldoOperario >= 500) {
            System.out.println("El sueldo a pagar a este operario es: " + sueldoOperario);
        }else{
            System.out.println("Error, ingrese los datos nuevamente");
        }
    }
}
