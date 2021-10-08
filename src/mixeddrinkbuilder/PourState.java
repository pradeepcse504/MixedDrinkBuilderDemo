package mixeddrinkbuilder;

public class PourState implements State {
	StateController stateController;
	public PourState(StateController stateController) {
		this.stateController = stateController;
	}

	@Override
	public void pour() {
		System.out.println("Pour ingredients in a glass");
		stateController.setState(stateController.getMixState());
	}

	@Override
	public void mix() {
		System.out.println("Mixing not ready");


	}

	@Override
	public void stir() {
		System.out.println("ingredients not mixed yet to stir");

	}

	@Override
	public void shake() {
		System.out.println("Ingredients not ready to shake");

	}

	@Override
	public void reward() {

		System.out.println("Mixed Drink not ready yet");
	}
	public String toString() {
		return " pouring";
	}
}
