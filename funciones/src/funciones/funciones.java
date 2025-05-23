package funciones;

import java.util.Scanner;

public class funciones {

	// Creamos un objeto Scanner para leer lo que escribe el usuario

	static Scanner entrada = new Scanner(System.in);

	// Esta variable guardará el nombre del usuario

	static String nombre;

	// -------------------------------

	// FUNCIÓN PARA INGRESAR EL NOMBRE

	// -------------------------------

	public static void ingresarNombre() {

		System.out.print("Ingrese su nombre: ");

		// Leemos el nombre desde el teclado y lo guardamos en la variable

		nombre = entrada.next();

	}

	// --------------------------------

	// FUNCIÓN PARA INGRESAR EL PRIMER NÚMERO

	// --------------------------------

	public static int ingresarNumero1() {

		System.out.print("Ingrese el primer número: ");

		int n1 = entrada.nextInt(); // Leemos un número entero

		return n1; // Lo devolvemos al que llame esta función

	}

	// --------------------------------

	// FUNCIÓN PARA INGRESAR EL SEGUNDO NÚMERO

	// --------------------------------

	public static int ingresarNumero2() {

		System.out.print("Ingrese el segundo número: ");

		int n2 = entrada.nextInt(); // Leemos un número entero

		return n2; // Lo devolvemos

	}

	// -------------------------------

	// FUNCIÓN PARA SUMAR DOS NÚMEROS

	// -------------------------------

	public static int sumar(int num1, int num2) {

		// Recibe dos números como parámetros y devuelve la suma

		int suma = num1 + num2;

		return suma;

	}

	// -------------------------------

	// FUNCIÓN PARA MOSTRAR LOS DATOS

	// -------------------------------

	public static void mostrarDatos(String nombre, int resultadoSuma) {

		// Muestra el nombre y el resultado de la suma

		System.out.println("Hola " + nombre + ", el resultado de la suma es: " + resultadoSuma);

	}

	// -------------------------------

	// FUNCIÓN PRINCIPAL (main)

	// -------------------------------

	public static void main(String[] args) {

		// Primero pedimos el nombre

		ingresarNombre();

		// Luego pedimos los dos números

		int numero1 = ingresarNumero1();

		int numero2 = ingresarNumero2();

		// Llamamos a la función que suma los dos números

		int resultado = sumar(numero1, numero2);

		// Mostramos los resultados finales

		mostrarDatos(nombre, resultado);

	}

}
