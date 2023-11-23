
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal gremlin = new Animal("Gizmo", 2, 1.5);
		Terrestre lleona = new Lleona("Nala", 6, 98.5, "Marro");
		Serp serp = new Serp("Margarida", 4);
		Dofi dofi = new Dofi("Flipper", 8);
		Animal aliga = new Aliga("Thunder", 4);

		System.out.println(gremlin);
		System.out.println(gremlin.getPes());
		System.out.println(gremlin.getNom());
		System.out.println(gremlin.getEdat());

		System.out.println();

		System.out.println(lleona);
		System.out.println(lleona.getColorPel());

		System.out.println();

		System.out.println(serp);
		serp.fesSo();
		serp.getPes();
		serp.correr();

		System.out.println();

		System.out.println(dofi);
		dofi.fesSo();
		dofi.nedar();

		System.out.println();

		System.out.println(aliga);

		((Aliga) aliga).fesSo();

		// Què li afegiries a aquesta línia perquè funcioni?
		// castejar aliga per a que pugui accedir al metode pare planejar()
		((Aeri) aliga).planejar();

		/*
		 * Afegeix un mètode o atribut propi de la classe Lleona i intenta cridar-lo o
		 * mostrar-lo per pantalla al mètode Tester
		 */
		System.out.println();
		((Lleona) lleona).llepar();

		// Part 3: Array

		Animal[] arrayAnimals = { gremlin, lleona, serp, dofi, aliga };

		System.out.println("\nRecorrem l'array d'animals:");
		for (Animal animal : arrayAnimals) {
			System.out.println(animal.getNom());
			if (animal instanceof Lleona) {
				((Lleona) animal).fesSo();
			} else if (animal instanceof Serp) {
				((Serp) animal).fesSo();
			} else if (animal instanceof Dofi) {
				((Dofi) animal).fesSo();
			} else if (animal instanceof Aliga) {
				((Aliga) animal).fesSo();
			} else {
				System.out.println("Aquest animal no te un so definit");
			}
			animal.getEdat();
			System.out.println("---------------------------");
		}

	}

}