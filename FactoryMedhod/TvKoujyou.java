package FactoryMedhod;

public class TvKoujyou extends Koujyou {
	public Seihin factoryMethod() {
		return new Television();
	}
	public void touroku(Seihin s) {
		Television t = (Television) s;
		//productに施す処理
		t.numberring();
		t.setDate(Date.today());
	}
}
