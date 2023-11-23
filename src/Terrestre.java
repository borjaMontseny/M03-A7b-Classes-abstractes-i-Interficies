
abstract class Terrestre extends Animal {

	// PROPIEDADES
	protected String colorPel;

	// CONSTRUCTORES
	public Terrestre(String nom, int edat, double pes, String colorPel) {
		super(nom, edat, pes);
		this.colorPel = colorPel;
	}

	// MÉTODOS
	String getColorPel() {
		return colorPel;
	}

	void setColorPel(String colorPel) {
		this.colorPel = colorPel;
	}

	void correr() {
		System.out.println("L'animal terrestre esta corrent.");
	}

	@Override
	public String toString() {
		return super.toString() + " colorPel: " + colorPel;
	}

}