package mixeddrinkbuilder;

public class MargaritaBuilder extends DrinkBuilder{

	public MargaritaBuilder() {
		this.name = "Margarita Drink";
	}
	public DrinkBuilder addLemonJuice() {

		return this;
	}
	public DrinkBuilder addGin() {

		return this;
	}
	public DrinkBuilder addChampagne() {

		return this;
	}
	public  DrinkBuilder addSyrup() {

		return this;
	}
	public DrinkBuilder addTequila() {
		this.ingredients.add("Tequila");
		return this;
	}
	public 	DrinkBuilder addLimeJuice() {
		this.ingredients.add("Lime Juice");
		return this;
	}
	public DrinkBuilder addIce() {
		this.ingredients.add("ICE");
		return this;
	}
}
