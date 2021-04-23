package Ch06;

//추상 클래스
//추상 매서드를 하나 이상 포함하는 클래스(미완성된 설계도면)
//일반 매서드나, 일반멤버현수 명시도 가능하ㅏ
//추상클래스로는 객체생성이 불가능하다
//추상클래스의 필요성
//1)개발 속도 향상
//2)강제성(선언된 방식의 매서드를 이름대로 만들도록 하위클래스에 강제,이름동일)
class Par1 {
	// 일반클래스
	void method1() {
	}

}

class Son1 extends Par1 {
	// 재정의
	@Override
	void method1() {
		System.out.println("Son1의 자율적 재정의된 매서드");
	}
}

//-------------------------추상클래스 상속관계--------------------//
abstract class Par2 {
	abstract void method2();
}

class Son2 extends Par2 {
	@Override
	void method2() {
		System.out.println("Son2의 강제 재정의한 매서드");
	}
}

public class C01AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Par1 obj1 = new Par1();
Son1 obj2 = new Son1();
Par1 obj3 = new Son1(); //업캐스팅
obj3.method1(); //하위클래스에서 재정의된 Method1()사용

//추상클래스
//par2 obj4 = new par2 ();//추상 클래스로는 객체 생성이 불가능
Son2 obj5 = new Son2(); // 추상매서드를 재정의한 자식클래스는 객체생성가능
Par2 obj6 = new Son2(); //업캐스팅
obj3.method1();
	
	}

}
