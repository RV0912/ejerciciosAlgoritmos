package Ejercicio_22_RV;

public class Ejercicio_22_RV {
	public static void main(String[] args) throws InterruptedException {

		for (int i = 100; i >= 0; i--) {

			System.out.println("tenes " + i + "% de batería");
			Thread.sleep(40);
			
			if (i == 20) {
				Thread.sleep(40);
				System.out.println("Batería Baja");

			}

			if (i == 0) {
				Thread.sleep(40);
				System.out.println("Batería Agotada");
			
				
			}
			break;
		}
	}

}
