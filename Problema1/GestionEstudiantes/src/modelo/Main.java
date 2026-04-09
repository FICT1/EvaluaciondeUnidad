package modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Lista para guardar objetos de nuestra clase "Gestion"
        ArrayList<Gestion> lista = new ArrayList<>();
        int opcion;

        do {
            // Menú interactivo
            System.out.println("\n--- SISTEMA DE GESTIÓN DE ESTUDIANTES ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes y estadísticas");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer del teclado

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese Código: ");
                    String cod = entrada.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nom = entrada.nextLine();
                    System.out.print("Ingrese Carrera: ");
                    String car = entrada.nextLine();
                    System.out.print("Ingrese Promedio: ");
                    double prom = entrada.nextDouble();

                    // Creamos un nuevo estudiante usando el CONSTRUCTOR de "Gestion"
                    Gestion nuevoEstudiante = new Gestion(cod, nom, car, prom);
                    lista.add(nuevoEstudiante);
                    System.out.println("¡Estudiante registrado con éxito!");
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Aún no hay estudiantes registrados.");
                    } else {
                        int aprobados = 0;
                        int reprobados = 0;

                        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
                        // Recorremos la lista mostrando la información
                        for (Gestion e : lista) {
                            e.mostrarInformacion();
                            if (e.getPromedio() >= 70) {
                                aprobados++;
                            } else {
                                reprobados++;
                            }
                        }

                        // Mostrar la cantidad de aprobados y reprobados
                        System.out.println("\n--- RESUMEN FINAL ---");
                        System.out.println("Cantidad de Aprobados: " + aprobados);
                        System.out.println("Cantidad de Reprobados: " + reprobados);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 3);

        entrada.close();
    }
}