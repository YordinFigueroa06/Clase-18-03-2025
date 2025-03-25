import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero por favor");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("El numero ingresado es positivo");
        }else if (numero < 0) {
            System.out.println("El numero ingresado es negativo");
        }else if(numero == 0){
            System.out.println("El numero ingresado es nulo");
        }else{
            System.out.println("Debes ingresar un numero entero");
        }
    }
}
