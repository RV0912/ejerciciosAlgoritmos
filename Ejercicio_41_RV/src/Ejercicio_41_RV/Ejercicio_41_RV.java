package Ejercicio_41_RV;

import java.util.Scanner;

public class Ejercicio_41_RV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[11];
        int[] edad = new int[11];

        for (int i = 0; i < 11; i++) {
            System.out.println("Ingrese el nombre del jugador:");
            nombres[i] = scanner.next();

            System.out.println("Ingrese la edad del jugador:");
            edad[i] = scanner.nextInt();
        }

        System.out.println("Nombres de los jugadores:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("Edades de los jugadores:");
        for (int eda : edad) {
            System.out.println(eda);
        }

        scanner.close(); 
    }
}
