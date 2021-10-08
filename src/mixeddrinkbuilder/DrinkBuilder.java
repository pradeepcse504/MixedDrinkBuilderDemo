package mixeddrinkbuilder;
import java.util.*;
public abstract class DrinkBuilder {
	String name;
	List<String> ingredients = new ArrayList<String>();

	public abstract DrinkBuilder addLemonJuice();
	public abstract DrinkBuilder addGin();
	public abstract DrinkBuilder addChampagne();
	public abstract DrinkBuilder addSyrup();
	public abstract DrinkBuilder addTequila();
	public abstract	DrinkBuilder addLimeJuice();
	public abstract DrinkBuilder addIce();

	public MixedDrink build() {
		MixedDrink mixedDrink = new MixedDrink();
		mixedDrink.setName(this.name);
		mixedDrink.addIngredients(ingredients);
		return mixedDrink;
	}

}
