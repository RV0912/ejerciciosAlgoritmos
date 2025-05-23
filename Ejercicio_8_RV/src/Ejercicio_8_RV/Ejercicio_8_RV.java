package Ejercicio_8_RV;

import java.util.Scanner;

public class Ejercicio_8_RV {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		String name, surname;
		double numeroAleatorio;
		
		
		System.out.println("\t¡¡BINGO!!");
		System.out.println("ingrese su nombre: ");
		name = ingreso.next();
		System.out.println("ingrese su apellido: ");
		surname = ingreso.next();
		
		numeroAleatorio = Math.random()*99;
		
		System.out.println("nombre: "+name);
		System.out.println("apellido: "+surname);
		System.out.println("numero de bingo: "+ (int)numeroAleatorio);

	}

}
