
package forwhile6;
import java.util.Scanner;

/**
 *
 * @author jpber
 */
public class ForWhile6 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione la aplicación que desea ejecutar:");
            System.out.println("1. Calcular el salario promedio de los empleados");
            System.out.println("2. Control de inventario de productos");
            System.out.println("3. Registrar ventas diarias durante una semana");
            System.out.println("4. Encuesta de satisfacción de clientes");
            System.out.println("5. Control de asistencia de empleados");
            System.out.println("6. Calcular bonificaciones de fin de año");
            System.out.println("7. Control de proyectos en desarrollo");
            System.out.println("8. Evaluación del desempeño de empleados");
            System.out.println("9. Control de horas extras trabajadas");
            System.out.println("10. Registro de clientes y pedidos");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    calcularSalarioPromedio(scanner);
                    break;
                case 2:
                    controlDeInventario(scanner);
                    break;
                case 3:
                    registrarVentasDiarias(scanner);
                    break;
                case 4:
                    encuestaSatisfaccion(scanner);
                    break;
                case 5:
                    controlAsistenciaEmpleados(scanner);
                    break;
                case 6:
                    calcularBonificaciones(scanner);
                    break;
                case 7:
                    controlProyectos(scanner);
                    break;
                case 8:
                    evaluacionDesempeno(scanner);
                    break;
                case 9:
                    controlHorasExtras(scanner);
                    break;
                case 10:
                    registroClientesPedidos(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void calcularSalarioPromedio(Scanner scanner) {
        System.out.println("\n--- Calcular Salario Promedio ---");
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        double sumaSalarios = 0;

        for (int i = 1; i <= numEmpleados; i++) {
            System.out.print("Ingrese el salario del empleado " + i + ": ");
            double salario = scanner.nextDouble();
            sumaSalarios += salario;
        }

        double salarioPromedio = sumaSalarios / numEmpleados;
        System.out.println("El salario promedio es: " + salarioPromedio);
    }

    public static void controlDeInventario(Scanner scanner) {
        System.out.println("\n--- Control de Inventario ---");
        System.out.print("Ingrese el número de productos: ");
        int numProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        String[] nombresProductos = new String[numProductos];
        int[] cantidadesProductos = new int[numProductos];

        for (int i = 0; i < numProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombresProductos[i] = scanner.nextLine();
            System.out.print("Ingrese la cantidad del producto " + (i + 1) + ": ");
            cantidadesProductos[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea
        }

        System.out.println("\n--- Inventario Completo ---");
        for (int i = 0; i < numProductos; i++) {
            System.out.println("Producto: " + nombresProductos[i] + ", Cantidad: " + cantidadesProductos[i]);
        }
    }

    public static void registrarVentasDiarias(Scanner scanner) {
        System.out.println("\n--- Registrar Ventas Diarias ---");
        double totalVentas = 0;
        int dias = 7;

        for (int i = 1; i <= dias; i++) {
            System.out.print("Ingrese las ventas del día " + i + ": ");
            double ventas = scanner.nextDouble();
            totalVentas += ventas;
        }

        System.out.println("El total de ventas de la semana es: " + totalVentas);
    }

    public static void encuestaSatisfaccion(Scanner scanner) {
        System.out.println("\n--- Encuesta de Satisfacción ---");
        System.out.print("Ingrese el número de clientes encuestados: ");
        int numClientes = scanner.nextInt();
        double sumaCalificaciones = 0;

        for (int i = 1; i <= numClientes; i++) {
            System.out.print("Ingrese la calificación del cliente " + i + " (1 a 5): ");
            double calificacion = scanner.nextDouble();
            sumaCalificaciones += calificacion;
        }

        double calificacionPromedio = sumaCalificaciones / numClientes;
        System.out.println("La calificación promedio es: " + calificacionPromedio);
    }

    public static void controlAsistenciaEmpleados(Scanner scanner) {
        System.out.println("\n--- Control de Asistencia de Empleados ---");
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        String[] nombresEmpleados = new String[numEmpleados];
        int[] diasAsistidos = new int[numEmpleados];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombresEmpleados[i] = scanner.nextLine();
            System.out.print("Ingrese el número de días asistidos por " + nombresEmpleados[i] + ": ");
            diasAsistidos[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea
        }

        System.out.println("\n--- Resumen de Asistencia ---");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Empleado: " + nombresEmpleados[i] + ", Días asistidos: " + diasAsistidos[i]);
        }
    }

    public static void calcularBonificaciones(Scanner scanner) {
        System.out.println("\n--- Calcular Bonificaciones de Fin de Año ---");
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        String[] nombresEmpleados = new String[numEmpleados];
        double[] salariosEmpleados = new double[numEmpleados];
        double[] rendimientoEmpleados = new double[numEmpleados];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombresEmpleados[i] = scanner.nextLine();
            System.out.print("Ingrese el salario de " + nombresEmpleados[i] + ": ");
            salariosEmpleados[i] = scanner.nextDouble();
            System.out.print("Ingrese el rendimiento de " + nombresEmpleados[i] + " (1 a 5): ");
            rendimientoEmpleados[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir salto de línea
        }

        System.out.println("\n--- Bonificaciones ---");
        for (int i = 0; i < numEmpleados; i++) {
            double bonificacion = salariosEmpleados[i] * (rendimientoEmpleados[i] / 5);
            System.out.println("Empleado: " + nombresEmpleados[i] + ", Bonificación: " + bonificacion);
        }
    }

    public static void controlProyectos(Scanner scanner) {
        System.out.println("\n--- Control de Proyectos en Desarrollo ---");
        System.out.print("Ingrese el número de proyectos: ");
        int numProyectos = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        String[] nombresProyectos = new String[numProyectos];
        String[] estadosProyectos = new String[numProyectos];

        for (int i = 0; i < numProyectos; i++) {
            System.out.print("Ingrese el nombre del proyecto " + (i + 1) + ": ");
            nombresProyectos[i] = scanner.nextLine();
            System.out.print("Ingrese el estado del proyecto " + (i + 1) + ": ");
            estadosProyectos[i] = scanner.nextLine();
        }

        System.out.println("\n--- Estado de Proyectos ---");
        for (int i = 0; i < numProyectos; i++) {
            System.out.println("Proyecto: " + nombresProyectos[i] + ", Estado: " + estadosProyectos[i]);
        }
    }

    public static void evaluacionDesempeno(Scanner scanner) {
        System.out.println("\n--- Evaluación de Desempeño de Empleados ---");
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        String[] nombresEmpleados = new String[numEmpleados];
        String[] evaluacionesEmpleados = new String[numEmpleados];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombresEmpleados[i] = scanner.nextLine();
            System.out.print("Ingrese la evaluación de " + nombresEmpleados[i] + ": ");
            evaluacionesEmpleados[i] = scanner.nextLine();
        }

        System.out.println("\n--- Resumen de Evaluaciones ---");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Empleado: " + nombresEmpleados[i] + ", Evaluación: " + evaluacionesEmpleados[i]);
        }
    }

    public static void controlHorasExtras(Scanner scanner) {
        System.out.println("\n--- Control de Horas Extras Trabajadas ---");
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        String[] nombresEmpleados = new String[numEmpleados];
        int[] horasExtras = new int[numEmpleados];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombresEmpleados[i] = scanner.nextLine();
            System.out.print("Ingrese las horas extras trabajadas por " + nombresEmpleados[i] + ": ");
            horasExtras[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea
        }

        System.out.println("\n--- Resumen de Horas Extras ---");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Empleado: " + nombresEmpleados[i] + ", Horas Extras: " + horasExtras[i]);
        }
    }

    public static void registroClientesPedidos(Scanner scanner) {
        System.out.println("\n--- Registro de Clientes y Pedidos ---");
        System.out.print("Ingrese el número de clientes: ");
        int numClientes = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        String[] nombresClientes = new String[numClientes];
        String[] pedidosClientes = new String[numClientes];

        for (int i = 0; i < numClientes; i++) {
            System.out.print("Ingrese el nombre del cliente " + (i + 1) + ": ");
            nombresClientes[i] = scanner.nextLine();
            System.out.print("Ingrese el pedido del cliente " + (i + 1) + ": ");
            pedidosClientes[i] = scanner.nextLine();
        }

        System.out.println("\n--- Registro Completo de Clientes y Pedidos ---");
        for (int i = 0; i < numClientes; i++) {
            System.out.println("Cliente: " + nombresClientes[i] + ", Pedido: " + pedidosClientes[i]);
        }
    }
    
}
