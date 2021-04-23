package Ch05;

class Animal {
	int x = 10;
}

class Human extends Animal {
	int y = 20;
}

class Tiger extends Animal {
	int z = 30;
}

public class C06InstanceofMain {

	public static void main(String[] args) {
		Animal ani = new Human(); // 상위 변수 = 하위 객체 업캐스팅!
		ani.x = 100;

		// 클래스로 다운캐스팅 , 참주변수명은 hul1
		if (ani instanceof Human) { // ani가 가르키는 클래스형이 HUman과 동일한가?
			Human hu1 = (Human) ani;
			hu1.y = 200;
		} else {
			System.out.println("다운캐스팅 불가능");
		}

		Animal ani2 = new Tiger(); // 다운캐스팅!
		if (ani2 instanceof Human) {
			Human hu2 = (Human) ani2; // 다운캐스팅 틀린예 타이거랑 휴먼은 서로 모른 사이이다.
		} else {
			System.out.println("다운캐스팅 실패");
		}

	}

}
