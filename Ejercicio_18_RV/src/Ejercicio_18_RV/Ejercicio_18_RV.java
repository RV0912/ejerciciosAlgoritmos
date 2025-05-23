package Ejercicio_18_RV;

import java.util.Scanner;

public class Ejercicio_18_RV {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random() * 3);
		int i = 5;
		int num;

		System.out.println("\tBINGO");
		System.out.println("escriba un num(entre 1 y 100).");

		do {
			System.out.print("Ingresa tu número: ");
			num = ingreso.nextInt();
			i--;

			if (num == numeroAleatorio) {
				System.out.println("¡GANASTE!");
				break;

			} else if (i > 0) {
				System.out.println("le erraste. Tenes" + i + " intentos.");
			}
		} while (i > 0);

		if (num != numeroAleatorio) {
			System.out.println("¡PERDISTE! El número era: " + numeroAleatorio);
		}

		ingreso.close();

	}

}
