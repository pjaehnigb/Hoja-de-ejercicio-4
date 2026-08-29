import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beatriz");
        nombres.add("David");

        System.out.println("Recorriendo la lista de nombres:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
    }
}