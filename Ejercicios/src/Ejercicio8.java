import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de preguntas realizadas");
        double cantidadPreguntas = scanner.nextDouble();
        System.out.println("Ingrese cantidad de preguntas respondidas correctamente");
        double cantidadPreguntasCorrectas = scanner.nextDouble();
        double porcentaje =  (cantidadPreguntasCorrectas / cantidadPreguntas)*100;
        if (porcentaje >= 90) {
            System.out.println("Obtuviste el nivel maximo de porcentaje: " + porcentaje + "%");
        }else if (porcentaje >= 75 && porcentaje < 90) {
            System.out.println("Obtuviste el nivel medio de porcentaje: " + porcentaje + "%");
        }else if (porcentaje >= 50 && porcentaje < 75) {
            System.out.println("Obtuviste el nivel regular de porcentaje: " + porcentaje + "%");
        }else if (porcentaje < 50) {
            System.out.println("Fuera de nivel, obtuviste un porcentaje menor a: " + porcentaje + "%");
        }else{
            System.out.println("Error, ingresa los datos nuevamente");
        }
    }
}
