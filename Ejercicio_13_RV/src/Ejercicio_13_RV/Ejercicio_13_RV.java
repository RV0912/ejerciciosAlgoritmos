package Ejercicio_13_RV;

import java.util.Scanner;

public class Ejercicio_13_RV {

	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner(System.in);
		int horas, minutos, segundos;
		
		System.out.println("ingrese las horas: ");
		horas = ingreso.nextInt();
		System.out.println("ingrese los minutos: ");
		minutos = ingreso.nextInt();
		System.out.println("ingrese los segundos: ");
		segundos = ingreso.nextInt();
		
		if(horas >24 || minutos>60 || segundos > 60) {
			
			System.out.println("valor incorecto");
			
			
		}
		
		else if (horas <24 && minutos < 60 && segundos < 60) {
			
			System.out.println("valor valido");
			
		
		}
		
	}

}
