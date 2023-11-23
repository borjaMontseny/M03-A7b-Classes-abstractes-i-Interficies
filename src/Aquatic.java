
abstract class Aquatic extends Animal {

	// PROPIEDADES

	// CONSTRUCTORES
	public Aquatic(String nom, int edat, double pes) {
		super(nom, edat, pes);
	}

	// MÉTODOS
	void nedar() {
		System.out.println("L'animal mari esta nedant.");
	}

	@Override
	public String toString() {
		return super.toString();
	}

}