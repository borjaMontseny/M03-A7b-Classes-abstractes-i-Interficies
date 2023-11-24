
public class Serp extends Terrestre implements Ovipar, Habitat {

	// PROPIEDADES

	// CONSTRUCTORES
	public Serp(String nom, int edat) {
		super(nom, edat, 1, "Sense definir");
	}

	// MÉTODOS
	void fesSo() {
		System.out.println("Sssssssss!");
	}

	@Override
	public void posarOus() {
		System.out.println(this.nom + " esta posant ous. Potser neix una petita serp");
	}

	@Override
	public void mostrarHabitat() {
		System.out.println(this.nom + "es originari de la selva tropical.");

	}
}