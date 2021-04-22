package Ch05;

//--------------
//멤버함수의 동작방식
//--------------

//클래스 영역 : 공유 메모리,static,static 메서드, 일반메서드,생성자 매서드

class C01Super {
	int num1;

	void sound() {
		System.out.println("sound1()");
	}
}

class C01Sub extends C01Super {
	int num2; // 확장

	void move() {
		System.out.println("sub1 move");
	}
}

public class C01MethodInfo {

	public static void main(String[] args) {
		C01Super ob1 = new C01Super();
		System.out.println("---------------------");
		ob1.num1 = 100;
		ob1.sound();
		C01Sub ob2 = new C01Sub();
		ob2.num1 = 100;
		ob2.num2 = 200;
		ob2.sound();
		ob2.move();
		System.out.println("---------------------");
		C01Super ob3 = new C01Sub(); //업캐스팅방식으로 참조변수 - 객체연결
		ob3.num1 = 10;
//		ob3.num2 = 20; 불가능 Sub 안에 super를 상속받지만 어미 클래스는 sub안을 모른다.
		ob3.sound();
//		ob3.move(); 불가능
		
	}

}
