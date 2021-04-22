package Ch03;

class C06Cal {
	private static C06Cal instance = new C06Cal();

	public static C06Cal getInstance() {
		if (instance == null) {
			instance = new C06Cal();
		}
		return instance;
	}

	void sum(int x, int y) {
		System.out.println("두 수의 합 : " + (x + y));
	}
}

public class C06CalMain {

	public static void main(String[] args) {
		C06Cal Client1 = C06Cal.getInstance();
		C06Cal Client2 = C06Cal.getInstance();
		C06Cal Client3 = C06Cal.getInstance();
		C06Cal Client4 = C06Cal.getInstance();
		Client1.sum(10,20);
		Client1.sum(30,40);
		Client1.sum(50,60);
		Client1.sum(70,80);

	}

}
