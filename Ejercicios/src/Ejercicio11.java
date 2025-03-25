import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadAlumnosMayores = 0;
        int cantidadAlumnosMenores = 0;
        for(int alumnos = 1; alumnos <= 10; alumnos++ ){
            System.out.println("Ingrese la nota del alumno: " + alumnos);
            int notaAlumno = scanner.nextInt();
            if (notaAlumno >= 7) {
                cantidadAlumnosMayores =+ cantidadAlumnosMayores ;
                cantidadAlumnosMayores++;
            }else if (notaAlumno < 7) {
                cantidadAlumnosMenores =+ cantidadAlumnosMenores;
                cantidadAlumnosMenores++;
            }else{
                System.out.println("Error, ingrese datos nuevamente");
            }
        }
        System.out.println("Cantidad de alumnos con nota mayor o igual que 7: " + cantidadAlumnosMayores);
        System.out.println("Cantidad de alumnos con nota menor a 7: " + cantidadAlumnosMenores);
    }
}
