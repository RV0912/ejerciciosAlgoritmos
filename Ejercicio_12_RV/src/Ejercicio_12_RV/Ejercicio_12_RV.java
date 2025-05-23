package Ejercicio_12_RV;

import java.util.Scanner;

public class Ejercicio_12_RV {

	public static void main(String[] args) {

		Scanner ingreso = new Scanner(System.in);
		String name, surname;
		double numeroAleatorio;
		int num;

		System.out.println("\t¡¡BINGO!!");
		System.out.println("ingrese su nombre: ");
		name = ingreso.next();
		System.out.println("ingrese su apellido: ");
		surname = ingreso.next();
		System.out.println("ingrese un numero entre el 0 y 99: ");
		num = ingreso.nextInt();

		numeroAleatorio = Math.random() * 99;

		if (num == numeroAleatorio) {
			System.out.println("nombre: " + name);
			System.out.println("apellido: " + surname);
			System.out.println("\t¡¡GANOOO!!☺☺");

		} else if (num != numeroAleatorio) {
			System.out.println("nombre: " + name);
			System.out.println("apellido: " + surname);
			System.out.println("\t¡¡PERDIOO!!☺☺");

		}

	}
}
