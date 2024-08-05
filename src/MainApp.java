/*
 * PRESENTACIÓN DEL TRABAJO Unidad 2: Tarea (13%) - Principios de POO
 * Trabajo realizado por: Edwin Leonardo Alzate Avendaño
 * Asignatura: Lenguaje de Programación Avanzado 1 - 2407B04G1G2
 * Docente: Nixon Duarte Acosta.
 * Fecha entrega: 04/08/2024
 * Github: 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    //Funcion salida App (Despedida).
    public static void salidaApp() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                 ¡MUCHAS GRACIAS POR PREFERIRNOS!                                 +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    private static Scanner entradaDatos = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                                           ¡BIENVENIDO!                                           +");
        System.out.println("+                                 ¡SISTEMA DE ALQUILER DE VEHICULOS!                               +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        while (true) {
            try {
                System.out.println("- Seleccione el tipo de vehículo:");
                System.out.println("1. Coche");
                System.out.println("2. Microbus");
                System.out.println("3. Furgoneta");
                System.out.println("4. Camion");
                System.out.println("5. Salir");
                System.out.print("-> ");

                int opcion = Integer.parseInt(entradaDatos.nextLine());

                if (opcion == 5) {
                    salidaApp();
                    break;
                }

                if (opcion < 1 || opcion > 4) {
                    System.out.println("");
                    System.out.println("Opción del menú incorrecta, intentelo nuevamente.");
                    System.out.println("");
                    continue;
                }

                String matriculaVehiculoPpal = "";
                int diasAlquiler = 0;
                double pma = 0;

                try {
                    System.out.print("- Introduce la matrícula del vehículo: ");
                    matriculaVehiculoPpal = entradaDatos.nextLine();

                    System.out.print("- Introduce el número de días de alquiler: ");
                    diasAlquiler = Integer.parseInt(entradaDatos.nextLine());

                    if (opcion == 3 || opcion == 4) {
                        System.out.print("- Digite el PMA (Peso maximo autorizado en toneladas): ");
                        pma = Double.parseDouble(entradaDatos.nextLine());
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Digitaste un dato invalido, intentalo de nuevo.");
                    entradaDatos.nextLine();
                    continue;
                }

                Vehiculo vehiculo = null;
                switch (opcion) {
                    case 1:
                        vehiculo = new Coche(matriculaVehiculoPpal, diasAlquiler);
                        break;
                    case 2:
                        vehiculo = new Microbus(matriculaVehiculoPpal, diasAlquiler);
                        break;
                    case 3:
                        vehiculo = new Furgoneta(matriculaVehiculoPpal, diasAlquiler, pma);
                        break;
                    case 4:
                        vehiculo = new Camion(matriculaVehiculoPpal, diasAlquiler, pma);
                        break;
                }

                if (vehiculo != null) {
                    System.out.println(vehiculo); // Llama a toString() que a su vez llama a obtenerMensaje()
                }

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("");
                System.out.println("Entrada inválida. Por favor ingrese una opción del menú.");
                System.out.println("");
            }
        }
        entradaDatos.close();
    }
}
