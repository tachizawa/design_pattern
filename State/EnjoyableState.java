package State;

public class EnjoyableState extends DogState {
	private static EnjoyableState s = new EnjoyableState();
	private EnjoyableState() {}

	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		moto.changeState(StomachacheState.getInstance());
	}
	public void tabeta(Dog moto) {
		// なにもしない
	}
	public String toString() {
		return "楽しい状態";
	}
}
