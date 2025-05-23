package Ejercicio_48_RV;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio_48_RV {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        // Solicitar al usuario un solo DNI
        System.out.print("Ingrese el DNI: ");
        String dni = ingreso.next();

        // Convertir el DNI en un array de caracteres
        char[] nums = dni.toCharArray();

        // Ordenar en forma ascendente (Burbuja)
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < (nums.length - i); j++) {
                if (nums[j - 1] > nums[j]) {
                    // Intercambio de caracteres
                    char temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("DNI ordenado por caracteres (ascendente): " + new String(nums));

        // Ordenar en forma descendente (Burbuja)
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < (nums.length - i); j++) {
                if (nums[j - 1] < nums[j]) {
                    // Intercambio de caracteres
                    char temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }											//para mostrar solo numero sino aparece cualquier cosa
        System.out.println("DNI ordenado por caracteres (descendente): " + new String(nums));

        ingreso.close(); // Cerrar el Scanner
    }
}
