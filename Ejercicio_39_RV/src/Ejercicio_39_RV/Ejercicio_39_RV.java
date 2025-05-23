package Ejercicio_39_RV;

enum memes {
    ENERO(31), FEBRERO(28), MARZO(31), ABRIL(30),
    MAYO(31), JUNIO(30), JULIO(31), AGOSTO(31),
    SEPTIEMBRE(30), OCTUBRE(31), NOVIEMBRE(30), DICIEMBRE(31);

    private final int rt; // almacenar los días del mes privado=solo es de aca y
    //final no se puede modificar

   
    memes(int q) {
        this.rt = q;
    }

    // Método para obtener los días del mes fuera del enum
    public int getdasy() {
        return rt; //return = dar 
    }
}

public class Ejercicio_39_RV {

	public static void main(String[] args) {
	memes elmes = memes.FEBRERO;
	 System.out.println("mes: " + elmes + " tiene " + elmes.getdasy() + " días.");

	}

}
