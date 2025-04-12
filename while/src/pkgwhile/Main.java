/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author pedro
 */
import java.util.Scanner;

public class Main {

    static double nota1 = -1;
    static double nota2 = -1;
    static double nota3 = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU DE NOTAS ---");
            System.out.println("1. Digitar las 3 Notas");
            System.out.println("2. Calcular Nota Final");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarNotas(scanner);
                    break;
                case 2:
                    calcularNotaFinal();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static void ingresarNotas(Scanner scanner) {
        System.out.print("Ingresa la Nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.print("Ingresa la Nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.print("Ingresa la Nota 3: ");
        nota3 = scanner.nextDouble();
    }

    public static void calcularNotaFinal() {
        if (nota1 < 0 || nota2 < 0 || nota3 < 0) {
            System.out.println("Primero debes ingresar las tres notas.");
        } else {
            double notaFinal = (nota1 + nota2 + nota3) / 3;
            System.out.printf("La nota final es: %.2f\n", notaFinal);
        }
    }
}
