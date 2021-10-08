package mixeddrinkbuilder;

public class MixedDrinkBuilderDemo {

	public static void main(String[] args) {
		StateController stateController= new StateController();
		System.out.println(stateController);
		stateController.mix();
		stateController.stir();
		stateController.shake();
		stateController.reward();
		System.out.println("============");
		stateController.pour();
		stateController.mix();
		stateController.stir();
		stateController.shake();
		stateController.reward();
	}

}
