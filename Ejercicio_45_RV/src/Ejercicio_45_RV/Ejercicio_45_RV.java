package Ejercicio_45_RV;

import java.util.ArrayList; // Necesaria para casi todos los métodos.
import java.util.Scanner;

public class Ejercicio_45_RV {

    public static void main(String[] args) {
        ArrayList<String> suda = new ArrayList<>();
        Scanner ingreso = new Scanner(System.in);
        String name;

        suda.add("Argentina");
        suda.add("Bolivia");
        suda.add("Brasil");
        suda.add("Chile");
        suda.add("Colombia");
        suda.add("Ecuador");
        suda.add("Paraguay");
        suda.add("Peru");
        suda.add("Uruguay");
        suda.add("Venezuela");

        
       
        System.out.println("Ingrese un país para verificar si es sudamericano: ");
        name = ingreso.next();

        for (String paisSuda : suda) {
            if (paisSuda.equalsIgnoreCase(name)) {
                System.out.println("El país " + name + " es sudamericano.");
                return;
            }
        }

        
        System.out.println("El país " + name + " no está en Sudamérica.");
    }
    }

