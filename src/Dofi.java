
public class Dofi extends Aquatic implements Habitat {

	// PROPIEDADES

	// CONSTRUCTORES
	public Dofi(String nom, int edat) {
		super(nom, edat, 1);
	}

	// MÉTODOS
	void fesSo() {
		System.out.println("Xiulet de dofi");
	}

	@Override
	public void mostrarHabitat() {
		System.out.println(this.nom + " es originari de el ocea pacific.");

	}

}