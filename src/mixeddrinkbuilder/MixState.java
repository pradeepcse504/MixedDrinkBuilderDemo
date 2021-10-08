package mixeddrinkbuilder;

public class MixState implements State {
	StateController stateController;
	public MixState(StateController stateController) {
		this.stateController = stateController;
	}

	@Override
	public void pour() {
		System.out.println("Mixture already in glass");

	}

	@Override
	public void mix() {
		System.out.println("Mixing the ingredients");
		stateController.setState(stateController.getStirState());

	}

	@Override
	public void stir() {
		System.out.println("Stiring the ingredients");

	}

	@Override
	public void shake() {

		System.out.println("Stiring not done to shake the drink");
	}

	@Override
	public void reward() {
		System.out.println("Mixed Drink not ready yet");

	}
	public String toString() {
		return " mixing";
	}

}
