
public class Aliga extends Aeri implements Ovipar, Habitat {

	// PROPIEDADES

	// CONSTRUCTORES
	public Aliga(String nom, int edat) {
		super(nom, edat);
	}

	// MÉTODOS
	void fesSo() {
		System.out.println("Crits de l'Aguila!");
	}

	@Override
	public void posarOus() {
		System.out.println(this.nom + " esta posant ous. Potser neix una petita aliga");
	}

	@Override
	public void mostrarHabitat() {
		System.out.println(this.nom + " es originaria de les montañes d'Europa i America.");

	}

}