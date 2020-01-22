package State;

public class FrustratedState extends DogState {
	private static FrustratedState s = new FrustratedState();
	private FrustratedState() {}

	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		moto.changeState(ByoukiState.getInstance());
	}
	public void tabeta(Dog moto) {
		moto.changeState(EnjoyableState.getInstance());
	}
	public String toString() {
		return "いらいら状態";
	}
}
