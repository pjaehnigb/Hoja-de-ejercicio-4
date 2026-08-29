import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        // Llenando la lista original
        for (int i = 1; i <= 15; i++) {
            numeros.add(i);
        }

        // Filtrando pares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        System.out.println("Lista completa: " + numeros);
        System.out.println("Solo números pares: " + pares);
    }
}