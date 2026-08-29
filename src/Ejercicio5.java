import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        
        nombres.add("Laura");
        nombres.add("Pedro");
        nombres.add("Sofía");
        nombres.add("Miguel");

        System.out.print("Ingrese el nombre que desea buscar: ");
        String busqueda = scanner.nextLine();

        if (nombres.contains(busqueda)) {
            System.out.println("El nombre '" + busqueda + "' SÍ existe en la lista.");
        } else {
            System.out.println("El nombre '" + busqueda + "' NO existe en la lista.");
        }
        
        scanner.close();
    }
}