/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forwhile6;

import java.util.Scanner;

/**
 *
 * @author jpber
 */
public class segundos10 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione la aplicación que desea ejecutar:");
            System.out.println("1. Control de inventario de productos (Muebles Boyacá)");
            System.out.println("2. Registrar ventas diarias (Panadería Santa Clara)");
            System.out.println("3. Encuesta de satisfacción de clientes (Hotel Campestre El Bosque)");
            System.out.println("4. Control de asistencia de empleados (Transporte Boyacá)");
            System.out.println("5. Calcular bonificaciones de fin de año (Industria Láctea San Mateo)");
            System.out.println("6. Control de proyectos en desarrollo (Construcciones Boyacá)");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    controlDeInventario(scanner);
                    break;
                case 2:
                    registrarVentasDiarias(scanner);
                    break;
                case 3:
                    encuestaSatisfaccion(scanner);
                    break;
                case 4:
                    controlAsistenciaEmpleados(scanner);
                    break;
                case 5:
                    calcularBonificaciones(scanner);
                    break;
                case 6:
                    controlProyectos(scanner);
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

    public static void controlDeInventario(Scanner scanner) {
        System.out.println("\n--- Control de Inventario de Productos (Muebles Boyacá) ---");
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
        System.out.println("\n--- Registrar Ventas Diarias (Panadería Santa Clara) ---");
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
        System.out.println("\n--- Encuesta de Satisfacción (Hotel Campestre El Bosque) ---");
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
        System.out.println("\n--- Control de Asistencia de Empleados (Transporte Boyacá) ---");
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
        System.out.println("\n--- Calcular Bonificaciones de Fin de Año (Industria Láctea San Mateo) ---");
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
        System.out.println("\n--- Control de Proyectos en Desarrollo (Construcciones Boyacá) ---");
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
}
