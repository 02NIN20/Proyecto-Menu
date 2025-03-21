package principal;

import java.util.Scanner;

import clienteRestaurante.FabricarGourmet;
import clienteRestaurante.FabricarVegano;
import clienteRestaurante.FabricarVegetariano;

public class Main {
    public static void main(String[] lol) {
        ClienteRestaurante cliente = new ClienteRestaurante();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------ Bienvenido ------");
            System.out.println("Seleccione el tipo de menú que desea:");
            System.out.println("1. Menú Vegetariano");
            System.out.println("2. Menú Vegano");
            System.out.println("3. Menú Gourmet");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");

            int opcion = scanner.nextInt();
            System.out.print("\033[H\033[2J");

            switch (opcion) {
                case 1:
                    cliente.pedirMenu(new FabricarVegetariano());
                    cliente.pedir();
                    break;
                case 2:
                    cliente.pedirMenu(new FabricarVegano());
                    cliente.pedir();
                    break;
                case 3:
                    cliente.pedirMenu(new FabricarGourmet());
                    cliente.pedir();
                    break;
                case 4:
                    System.out.println("Muchas gracias. ¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }

            System.out.println(); // Línea en blanco para separar las interacciones
        }
    }
}