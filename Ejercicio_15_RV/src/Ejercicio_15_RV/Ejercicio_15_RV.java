package Ejercicio_15_RV;

import java.util.Scanner;

public class Ejercicio_15_RV {

	public static void main(String[] args) {

		Scanner ingreso = new Scanner(System.in);
		int horas, minutos, segundos;

		System.out.println("ingrese las horas: ");
		horas = ingreso.nextInt();
		System.out.println("ingrese los minutos: ");
		minutos = ingreso.nextInt();
		System.out.println("ingrese los segundos: ");
		segundos = ingreso.nextInt();

		switch (horas / 25) {
		case 0:
			System.out.println("horario en horas valido");
			break;
		default:
			System.out.println("horario en horas invalido");
		}
		switch (minutos / 61) {
		case 0:
			System.out.println("horario en minutos valido");
			break;
		default:
			System.out.println("horario en minutos invalido");
			break;
		}
		switch (segundos / 61) {
		case 0:
			System.out.println("horario en segundos valido");
			break;
		default:
			System.out.println("horario en segundos invalido");
			break;
		}

	}

}
