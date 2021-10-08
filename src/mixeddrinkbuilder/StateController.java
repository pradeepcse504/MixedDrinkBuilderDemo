package mixeddrinkbuilder;

public class StateController {
	State pourState;
	State mixState;
	State stirState;
	State shakeState;
	State rewardState;

	State state;


	public StateController() {
		pourState = new PourState(this);
		mixState = new MixState(this);
		stirState = new StirState(this);
		shakeState = new ShakeState(this);
		rewardState = new RewardState(this);


		state = pourState;
	}
	public void pour() {
		state.pour();
	}
	public void stir() {
		state.stir();
	}
	public void shake() {
		state.shake();
	}
	public void mix() {
		state.mix();

	}
	public void reward() {
		state.reward();

	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return this.state;
	}
	public State getPourState() {
		return pourState;
	}
	public State getMixState() {
		return mixState;
	}
	public State getShakeState() {
		return shakeState;
	}
	public State getRewardState() {
		return rewardState;
	}
	public State getStirState() {
		return stirState;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nDonalds Mixed Drink Store ");
		result.append("\nDrink is " + state + "\n");
		return result.toString();
	}


}
