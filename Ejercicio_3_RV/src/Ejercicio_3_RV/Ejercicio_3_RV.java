package Ejercicio_3_RV;

import java.util.Scanner;

public class Ejercicio_3_RV {

	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner (System.in);
		
      float num1,num2;
      float dividir,suma,resta,multi;
      
      System.out.println("Ingrese un numero: ");
      num1 = ingreso.nextFloat();
      System.out.println("Ingrese otro numero: ");
      num2 = ingreso.nextFloat();
      
      
      
      
      
      dividir = num1 / num2;
    	suma= num1 + num2;	  
    	multi= num1 * num2;	
    	resta= num1 - num2;
    	
    	
	System.out.println("resultados de la division: "+dividir);
	System.out.println("resultados de la suma: "+suma);
	System.out.println("resultados de la resta: "+resta);
	System.out.println("resultados de la multiplicacion: "+multi);
	}
}
