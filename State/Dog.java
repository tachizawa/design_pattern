package State;

class Dog {
	private DogState myState;

	public Dog() {
		myState = EnjoyableState.getInstance();
	}

	public void roudou() {
		myState.tukareta(this);
	}

	public void shokuji() {
		myState.tabeta(this);
	}

	public void changeState(DogState d) {
		myState = d;
	}

	public void jyoutaiNani() {
		System.out.print("現在、わたしは「");
		System.out.print( myState.toString() );
		System.out.println("」です。");
	}
}
