
public class Lleona extends Terrestre implements Habitat {

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

	@Override
	public void mostrarHabitat() {
		System.out.println(this.nom + " es originaria de la sabana africana.");

	}

}