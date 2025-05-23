package Ejercicio_42_RV;

import java.util.Scanner;

public class Ejercicio_42_RV {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		int socio;
		
		
		int[] nums = {1011, 2367, 8748, 9121, 817, 6423, 2034};
		String[] nomb = {"Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana"};
		
		System.out.println("ingrese num de socio: ");
		socio = ingreso.nextInt();
		
		for (int i = 0; i < nums.length; i++) {
            if (nums[i] == socio) {
                
                System.out.println("Nombre del num de socio: " +nomb[i]+", num de socio "+nums[i]);
                ingreso.close(); 
                return;
              
            }
        }
		
		System.err.println("numero inexistente");
		
	}
}
