package UsoEnum;

public class UsoEnum {
    // Definimos un tipo enumerado
    enum Nivel { BAJO, MEDIO, ALTO }

    public static void main(String[] args) {
        Nivel importancia = Nivel.ALTO;

        // Verificamos qué nivel fue asignado
        if (importancia == Nivel.ALTO) {
            System.out.println("El nivel es alto");
        }
    }
}
