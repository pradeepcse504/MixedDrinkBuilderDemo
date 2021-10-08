package mixeddrinkbuilder;
import java.util.*;
public class MixedDrink {


		String name;
		List<String> ingredients;
		public void addIngredients(List<String> ingredients) {
			this.ingredients = ingredients;
		}

	void prepare() {
		System.out.println("Prepare " + name );
		System.out.println("Pouring ingredients into glass");
		for(String ingredient : ingredients) {
			System.out.println("   " + ingredient);
		}

	}
	void shake() {
		System.out.println("Shake the ingredients");
	}
	void mix() {
		System.out.println("Mixing the ingredients");
	}
	void stir() {
		System.out.println("Stiring the ingredients");
	}
	void serve() {
		System.out.println("Serving " + name);
	}
	public void setName(String name ) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("-----" + this.name + "-----");
		for(String ingredient: ingredients) {
			display.append(ingredient + "\n");
		}
		return display.toString();
	}

}
