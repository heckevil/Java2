package Ch07;

interface Tire {

	void roll();
}

class HankookTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다");

	}
}

class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다");

	}
}

class C02Car {
	Tire leftfront = new HankookTire();
	Tire rightfront = new HankookTire();
	Tire leftrear = new HankookTire();
	Tire rightrear = new HankookTire();

	void start() {
		System.out.println("왼쪽 앞바퀴 : ");
		leftfront.roll();
		System.out.println("오른쪽 앞바퀴 : ");
		rightfront.roll();
		System.out.println("왼쪽 뒷바퀴 : ");
		leftrear.roll();
		System.out.println("오른쪽 뒷바퀴 : ");
		rightrear.roll();
	}
}

public class C02Tire {
	public static void main(String[] args) {
		C02Car avantee123 = new C02Car();
		avantee123.start();
		avantee123.leftfront = new KumhoTire(); // 객체화로 통해 부품 교체 인터페이스라 가능
		avantee123.start();
	}
}
