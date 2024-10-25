import java.util.Scanner;

public class Telecajero {

    public static void main(String[] args) {
        String nombre = "Jeremias Castro";
        String tipoDeCuenta = "Corriente";
        double saldo = 2500000;
        String rut = "19888888-5";
        String claveCorrecta = "1988"; // Clave de 4 dígitos
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("Bienvenido a tu Banco de Confianza");

        String claveIngresada;
        do {
            System.out.print("Ingresa los primeros 4 dígitos de tu RUT: ");
            claveIngresada = scanner.nextLine();
            if (!claveIngresada.equals(claveCorrecta)) {
                System.out.println("********************************************\nRUT inválido. Por favor, intente de nuevo.");
            }
        } while (!claveIngresada.equals(claveCorrecta));

        System.out.println("********************************************\nNombre del Cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);

        while (true) {
            System.out.println("********************************************\nMenú de Opciones:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retiro");
            System.out.println("3. Depósito");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("********************************************\nSu saldo a favor es: $" + saldo);
                    break;
                case 2:
                    System.out.print("********************************************\nIngrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("********************************************\nFondos insuficientes.");
                    } else {
                        saldo -= retiro;
                        System.out.println("*************************************************\nRetiro exitoso. Su nuevo saldo es: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.print("********************************************\nIngrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("********************************************\nDepósito exitoso. Su nuevo saldo es: $" + saldo);
                    break;
                case 4:
                    System.out.println("********************************************\nGracias por usar nuestro servicio. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("********************************************\nOpción inválida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}
