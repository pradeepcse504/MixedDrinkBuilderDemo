package mixeddrinkbuilder;

public class French75Builder extends DrinkBuilder {

	public French75Builder() {
		this.name = "French 75 ";
	}
	public DrinkBuilder addLemonJuice() {
		this.ingredients.add("lemon Juice");
		return this;
	}
	public DrinkBuilder addGin() {
		this.ingredients.add("Gin");
		return this;
	}
	public DrinkBuilder addChampagne() {
		this.ingredients.add("Champagne");
		return this;
	}
	public  DrinkBuilder addSyrup() {
		this.ingredients.add("Syrup");
		return this;
	}
	public DrinkBuilder addTequila() {
		return this;
	}
	public 	DrinkBuilder addLimeJuice() {
		return this;
	}
	public DrinkBuilder addIce() {
		this.ingredients.add("ICE");
		return this;
	}

}
