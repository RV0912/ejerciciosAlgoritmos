package Ejercicio_44_RV;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio_44_RV {

	public static void main(String[] args) {
		HashSet<String> futbol = new HashSet<>();// hashset y lista sonj distintos
		Scanner ingreso = new Scanner(System.in);
		String equipo;

		System.out.println("aca ingresara los equipos y si desea terminar solo escriba 'fin'");

		do {
			System.out.print("Ingresa el nombre del equipos (o 'fin' para salir): ");
			equipo = ingreso.nextLine();

			if (!equipo.equalsIgnoreCase("fin")) {
				futbol.add(equipo);
			}
		} while (!equipo.equalsIgnoreCase("fin"));

		System.out.println("\nEQUIPOS: ");
		for (String eq : futbol) {// use for each para mostra los equipos y no usar 'i' que es mas largo
			System.out.println("- " + eq);
		}
	}
}
