package Ejercicio_21_RV;

import java.util.Scanner;
public class Ejercicio_21_RV {
public static void main(String[] args) throws InterruptedException {
Scanner datos = new Scanner(System.in);

int bate = 100;


while (bate <= 100 && bate > 0) {
	bate--;
Thread.sleep(20);
System.out.println("tenes "+bate+"% de batería");
if(bate == 20){
Thread.sleep(1000);
System.out.println("Batería Baja");

}
if(bate == 0){
Thread.sleep(1000);
System.out.println("Batería Agotada");

}
}






}


}
