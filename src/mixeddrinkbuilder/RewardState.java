package mixeddrinkbuilder;

public class RewardState implements State {
	StateController stateController;
	public RewardState(StateController stateController) {
		this.stateController = stateController;
	}

	@Override
	public void pour() {
		System.out.println("Mixture already in glass");
	}

	@Override
	public void mix() {
		System.out.println("Ingredients already mixed");
	}

	@Override
	public void stir() {
		System.out.println("Mixture already stirred");
	}

	@Override
	public void shake() {
		System.out.println("Shaking the drink done!");
	}

	@Override
	public void reward() {
		System.out.println("Rewarding the customer");
		//here we create the builder pattern
		DrinkBuilder french75Builder = new French75Builder();
		MixedDrink french75 = french75Builder.addChampagne().addGin().addLemonJuice().addLimeJuice().addSyrup().addTequila().addIce().build();
		french75.prepare();
		french75.mix();
		french75.serve();
		System.out.println(french75);

	}
	public String toString() {
		return " reward";
	}
}
