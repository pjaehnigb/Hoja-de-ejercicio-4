import java.util.ArrayList;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        ArrayList<Integer> aleatorios = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            // Genera números aleatorios entre 1 y 100
            aleatorios.add(rand.nextInt(100) + 1);
        }

        System.out.println("Lista de 20 números aleatorios:");
        System.out.println(aleatorios);
    }
}