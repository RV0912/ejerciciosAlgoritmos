package Ejercicio_11_RV;

import java.util.Scanner;

public class Ejercicio_11_RV {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		int nota;
		System.out.println("Ingrese el numero: ");
		nota = ingreso.nextInt();

		if (nota >= 1 && nota <= 3) {

			System.out.println("Su nota es insuficiente");

		}

		else if (nota > 3 && nota < 6) {

			System.out.println("Usted no logro☺☺☺☺");

		}

		else if (nota >=6  && nota <= 7) {

			System.out.println("Su nota es suficiente");

		}

		else if (nota >= 8 && nota <= 9) {

			System.out.println("Su nota es notable");

		}

		else if (nota == 10) {

			System.out.println("Su nota es sobresaliente☺");

		}
		else if (nota > 10) {

			System.out.println("Nota no valida");

		}

	}

}
