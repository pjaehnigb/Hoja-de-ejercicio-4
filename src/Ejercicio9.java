import java.util.ArrayList;

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new Empleado("Juan", 3500.50));
        empleados.add(new Empleado("María", 4200.00));
        empleados.add(new Empleado("Luis", 2800.75));

        double sumaSalarios = 0;
        for (Empleado emp : empleados) {
            sumaSalarios += emp.getSalario();
        }

        double promedio = sumaSalarios / empleados.size();
        System.out.printf("El promedio de los salarios es: %.2f\n", promedio);
    }
}