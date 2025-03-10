package org.example;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        IOperaciones operaciones = (IOperaciones) Naming.lookup("rmi://localhost/Operaciones");

        Scanner scanner = new Scanner(System.in);
        int choice;
        int n = 0;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Insertar número");
            System.out.println("2. Calcular Fibonacci");
            System.out.println("3. Calcular sumatoria");
            System.out.println("4. Calcular factorial");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Introduzca un número entero: ");
                    n = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Secuencia Fibonacci de " + n + " es " + operaciones.Fibonacci(n));
                    break;
                case 3:
                    System.out.println("Sumatoria de " + n + ": " + operaciones.Summation(n));
                    break;
                case 4:
                    System.out.println("Factorial de " + n + ": " + operaciones.Factorial(n));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
