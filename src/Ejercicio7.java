import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();
        
        System.out.print("¿Cuántas calificaciones desea ingresar? ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese calificación " + (i + 1) + ": ");
            calificaciones.add(scanner.nextDouble());
        }

        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }

        if (calificaciones.size() > 0) {
            double promedio = suma / calificaciones.size();
            System.out.println("El promedio de las calificaciones es: " + promedio);
        }
        
        scanner.close();
    }
}