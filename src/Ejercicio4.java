import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento por índice");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    lista.add(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Ingrese el índice a eliminar (0 a " + (lista.size() - 1) + "): ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < lista.size()) {
                        System.out.println("Eliminado: " + lista.remove(indice));
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista actual: " + lista);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }
}