package mixeddrinkbuilder;

public class StirState implements State {
	StateController stateController;
	public StirState(StateController stateController) {
		this.stateController = stateController;
	}

	@Override
	public void pour() {
		System.out.println("Mixture already in glass");

	}

	@Override
	public void mix() {
		System.out.println("Mixture already mixed");

	}

	@Override
	public void stir() {

		System.out.println("Stirring the ingredients");
		stateController.setState(stateController.getShakeState());

	}

	@Override
	public void shake() {

		System.out.println("Shaking not ready");
	}

	@Override
	public void reward() {
		System.out.println("Drink not Ready");


	}
	public String toString() {
		return " stir";
	}
}
