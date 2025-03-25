import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera nota del alumno");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingresa la segunda nota del estudiante");
        double nota2 = scanner.nextDouble();
        System.out.println("Ingrese la tercera nota del estudiante");
        double nota3 = scanner.nextDouble();
        double promedio = (nota1 + nota2 + nota2)/3;
        if (promedio >= 7) {
            System.out.println("Promocionado");
        }else if (promedio >= 4 && promedio < 7) {
            System.out.println("Regular");
        }else if (promedio < 4) {
            System.out.println("Reprobado");
        }else{
            System.out.println("Error, ingrese las notas nuevamente");
        }
    }
}
