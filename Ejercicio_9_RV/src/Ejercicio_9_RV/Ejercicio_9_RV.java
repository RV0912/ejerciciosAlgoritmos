package Ejercicio_9_RV;

import java.util.Scanner;

public class Ejercicio_9_RV {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		int num;
		
		System.out.println("Ingrese el numero: ");
		num = ingreso.nextInt();
		
		if (num > 0) {
			System.out.println("el numero es positivo");
			}
		else if (num == 0) {
			System.out.println("el numero es 0");
			}
		else if (num < 0) {
			System.out.println("el numero es negativo");
			}
		
		

	}

}
