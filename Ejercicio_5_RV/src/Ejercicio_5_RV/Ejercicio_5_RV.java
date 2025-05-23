
package Ejercicio_5_RV;

import java.util.Scanner;

public class Ejercicio_5_RV {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		double num1;

		System.out.println("ingrese un numero: ");
		num1 = ingreso.nextDouble();

		

		double raiz_cuadrada = Math.sqrt(num1);

		System.out.println("Resultado de la raiz cuadrada: " + raiz_cuadrada);

		System.out.println("Resultado de la raiz cuadrada (entero):  " + (int) raiz_cuadrada);

	}

}
