package Ejercicio_4_RV;

import java.util.Scanner;

public class Ejercicio_4_RV {

public static void main(String[] args) {
	
	Scanner ingreso = new Scanner (System.in);
	
	int sema, mes, year, dias,resul1, resul2, resul3;
	
	
	System.out.println("ingrese la cantidad años: ");
	year = ingreso.nextInt();
	
	
	System.out.println("ingrese la cantidad meses: ");
	mes = ingreso.nextInt();
	
	
	System.out.println("ingrese la cantidad semanas: ");
	sema = ingreso.nextInt();
	
	resul1 = year * 365;
	resul2 = mes * 30;
	resul3 = sema * 7;
	
	
	
	dias = resul1 + resul2 + resul3;
	
	System.out.println("cantidad de dias totales: "+dias);
}	
	
}
