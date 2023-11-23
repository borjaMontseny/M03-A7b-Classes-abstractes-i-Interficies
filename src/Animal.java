
public class Animal {

	// PROPIEDADES
	protected String nom;
	protected int edat;
	protected double pes;

	// CONSTRUCTORES
	public Animal(String nom, int edat, double pes) {
		this.nom = nom;
		this.edat = edat;
		this.pes = pes;
	}

	public Animal(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
		this.pes = 1;
	}

	// MÉTODOS

	String getNom() {
		return nom;
	}

	void setNom(String nom) {
		this.nom = nom;
	}

	int getEdat() {
		return edat;
	}

	void setEdat(int edat) {
		this.edat = edat;
	}

	double getPes() {
		return pes;
	}

	void setPes(double pes) {
		this.pes = pes;
	}

	@Override
	public String toString() {
		return "nom: " + nom + ", edat: " + edat + ", pes: " + pes;
	}

}