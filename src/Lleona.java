
public class Lleona extends Terrestre {

	// PROPIEDADES

	// CONSTRUCTORES
	public Lleona(String nom, int edat, double pes, String colorPel) {
		super(nom, edat, pes, colorPel);
	}

	// METODOS
	void fesSo() {
		System.out.println("Grrrrrrrr!");
	}

	void llepar() {
		System.out.println(this.nom + " t'esta llepant la cara");
	}

}