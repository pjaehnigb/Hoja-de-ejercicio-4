import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        String entrada;

        System.out.println("Ingrese elementos (escriba 'fin' para terminar):");
        while (true) {
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            elementos.add(entrada);
        }

        System.out.println("Elementos ingresados: " + elementos);
        scanner.close();
    }
}