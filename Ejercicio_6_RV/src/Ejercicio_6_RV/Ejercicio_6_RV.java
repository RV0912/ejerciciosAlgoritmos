package Ejercicio_6_RV;

import java.util.Scanner;

public class Ejercicio_6_RV {

	public static void main(String[] args) {
	 
		Scanner ingreso = new Scanner(System.in);
		float nota; 
		int numRedondeado;
		
		System.out.println("ingrese su nota del examen: ");
		nota = ingreso.nextFloat();
		
		numRedondeado = (int) Math.round(nota);
		
		System.out.println("nota redondeada: " +numRedondeado);
	}

}
