import java.util.Scanner;

class Empleado {
    // Atributos de la clase Empleado
    private String nombre;
    private String cargo;
    private double salario;
    private String fechaIngreso;

    // Constructor de la clase Empleado
    public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println();
    }

    // Método principal para crear objetos y solicitar información desde el teclado
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[3];

        // Solicitar detalles de cada empleado y crear los objetos
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese los detalles del empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            System.out.print("Fecha de ingreso (dd/mm/yyyy): ");
            String fechaIngreso = scanner.nextLine();

            // Crear el objeto Empleado y almacenarlo en el arreglo
            empleados[i] = new Empleado(nombre, cargo, salario, fechaIngreso);
            System.out.println();
        }

        // Mostrar la información de cada empleado
        System.out.println("Información de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }
        scanner.close();
    }
}
