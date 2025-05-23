package Ejercicio_20_RV;

import java.util.Scanner;

public class Ejercicio_20_RV {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);

		int contra;

		int intentos = 0;

		boolean contras = false;
		do {

			System.out.println("Ingresa la contraseña: ");

			contra = datos.nextInt();

			if (contra != 2008) {

				Thread.sleep(1000);

				intentos++;

				if (intentos < 3) {

					System.out.println("Volve a intentarlo. ");

					System.out.println("maximo de intentos son 3 te quedan: " + intentos);

				}

			}

		} while (contra != 2008 && intentos < 3);

		if (contra == 2008) {
			contras = true;
			if (contras == true)
			{
				System.out.println("Contrasena correcta.");
			}
			

		}

		if (contra != 2008 && contras == false) {

			System.out.println("Bloqueado. ");

		}
		
	}

}
