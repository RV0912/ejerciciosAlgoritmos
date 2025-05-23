package Ejercicio_10_RV;

import java.util.Scanner;

public class Ejercicio_10_RV {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		char talle;
		
		System.out.println("Ingrese un talle entre S, M y L: ");
		talle = ingreso.next().charAt(0);
		
		if(talle == 's' || talle == 'S' ) {
	 
			System.out.println("Quedan 5 remeras en talle S");
			
		}	
		else if(talle == 'm'|| talle == 'M') {
			 
			System.out.println("Quedan 2 remeras en talle M");
			
		}
		else if(talle == 'l'|| talle == 'L') {
			 
			System.out.println("No quedan remeras en talle L");
			
		}
	}

}
