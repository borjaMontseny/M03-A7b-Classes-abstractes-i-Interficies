import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Terrestre lleona = new Lleona("Nala", 6, 98.5, "Marro");
		Serp serp = new Serp("Margarida", 4);
		Dofi dofi = new Dofi("Flipper", 8);
		Animal aliga = new Aliga("Thunder", 4);

		Animal[] arrayAnimals = { aliga, lleona, serp, dofi,  };

		// Ordenarà els animals segons pes, de major a menor
		Arrays.sort(arrayAnimals);

		// mostrem que si s'han ordenat per pes DESC
		for (Animal animal : arrayAnimals) {
			System.out.println(animal.getNom() + " " + animal.getPes() + "\n");
		}

	}

}