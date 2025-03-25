import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de empleados");
        int empleados = scanner.nextInt();
        int cantidadEmpleadosMayor = 0;
        int cantidadEmpleadosMenor = 0;
        double gastosSueldos = 0;
        for(int n = 1; n <= empleados; n++){
            System.out.println("Ingrese sueldo del empleado: " + n);
            double sueldoEmpleado = scanner.nextDouble();
            if(sueldoEmpleado < 100 || sueldoEmpleado >= 500){
                System.out.println("El sueldo del empleado debe estar entre 100 y 500, ingrese el sueldo nuevamente");
                n--;
                continue;
            }
            if (sueldoEmpleado >= 100 && sueldoEmpleado <= 300) {
                cantidadEmpleadosMenor++;
            }else if (sueldoEmpleado > 300) {
                cantidadEmpleadosMayor++;
            }
            gastosSueldos += sueldoEmpleado;
        }
        System.out.println("Cantidad de empleados con un sueldo mayor a 100 y menor a 300: " + cantidadEmpleadosMenor);
        System.out.println("Cantidad de empleados con un sueldo mayor a 300: " + cantidadEmpleadosMayor);
        System.out.println("Lo que se gasto la empresa en sueldos fue: " + gastosSueldos);
    }
}
