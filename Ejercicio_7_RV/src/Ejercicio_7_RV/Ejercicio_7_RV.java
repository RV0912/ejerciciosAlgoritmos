package Ejercicio_7_RV;

import java.util.Scanner;

public class Ejercicio_7_RV {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		double num, raiz;
		double cuad, multi, suma; 
		double numeroAleatorio;
		int exp = 2;
		
		System.out.println("ingrese un numero con 2 decimales: ");
		num = ingreso.nextDouble();
		
		cuad = Math.pow(num,exp);
		
		numeroAleatorio = Math.random()*1;
		
		suma = cuad + numeroAleatorio;
		
		multi = suma * 7;
		
		raiz = Math.sqrt(multi);
		
		
		System.out.println("el resultado es: " + (int) raiz);
		
		
		
		
	}

}
