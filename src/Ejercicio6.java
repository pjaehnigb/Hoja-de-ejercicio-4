import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- TAREAS PENDIENTES ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar como completada (eliminar)");
            System.out.println("3. Ver tareas pendientes");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Descripción de la tarea: ");
                    tareas.add(scanner.nextLine());
                    break;
                case 2:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas pendientes.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println(i + ". " + tareas.get(i));
                        }
                        System.out.print("Ingrese el número de la tarea completada: ");
                        int indice = scanner.nextInt();
                        if (indice >= 0 && indice < tareas.size()) {
                            System.out.println("Tarea completada y eliminada: " + tareas.remove(indice));
                        } else {
                            System.out.println("Índice incorrecto.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Tareas pendientes: " + tareas);
                    break;
            }
        } while (opcion != 4);
        
        scanner.close();
    }
}