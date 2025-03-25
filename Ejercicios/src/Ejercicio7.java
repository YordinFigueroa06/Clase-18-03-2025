import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero mi hermanazo");
        int numero = scanner.nextInt();
        if (numero >= 0 && numero < 10){
            System.out.println("El numero ingresado es de una cifra");
        }else if (numero >= 10 && numero < 100){
            System.out.println("El numero ingresado es de dos cifras");
        }else if (numero >= 100 && numero < 1000){
            System.out.println("El numero ingresado es de tres cifras");
        }else{
            System.out.println("Error, el numero ingresado es mayor de tres cifras");
        }
    }
}