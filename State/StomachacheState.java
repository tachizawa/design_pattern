package State;

public class StomachacheState extends DogState {
	private static StomachacheState s = new StomachacheState();
	private StomachacheState() {}

	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		moto.changeState(FrustratedState.getInstance());
	}
	public void tabeta(Dog moto) {
		moto.changeState(FrustratedState.getInstance());
	}
	public String toString() {
		return "普通状態";
	}
}
