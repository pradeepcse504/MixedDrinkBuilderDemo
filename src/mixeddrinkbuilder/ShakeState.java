package mixeddrinkbuilder;

public class ShakeState implements State {
	StateController stateController;
	public ShakeState(StateController stateController) {
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
		System.out.println("Shaking the mixture");
		stateController.setState(stateController.getRewardState());
	}

	@Override
	public void reward() {
		System.out.println("Drink not Ready");

	}
	public String toString() {
		return " shaking";
	}

}
