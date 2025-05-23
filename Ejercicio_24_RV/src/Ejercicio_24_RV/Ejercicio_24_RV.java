package Ejercicio_24_RV;

import java.util.Scanner;

public class Ejercicio_24_RV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num1, num2, salir = 0;

         
        do {
            System.out.println("Introduce el primer número (0 para salir):");
            num1 = scanner.nextInt();
            if (num1 == 0) {
                salir = 1; 
                System.out.println("salio del programna");
                continue; 
            }

            System.out.println("Introduce el segundo número:");
            num2 = scanner.nextInt();
            if (num2 == 0) {
                salir = 1; 
                System.out.println("salio del programna");
                continue; 
            }
            int suma = num1 + num2;
            System.out.println("La suma de los dos números es: " + suma);
        } while (salir == 0); 
        
        scanner.close();
        

	}

}
