package Ch05;

//캐스팅 : 클래스형 형변환(자동으로 바뀌거나 강제로바꾸거나)
//업캐스팅 : 상위클래스의 참조변수로 하위클래스의 객체를 가리킬때
//			자료형이 자동으로 상위클래스형으로 변환되는 클래스 형 변환
//  super : 상위, sub: 하위
//Super obj = new Sub();
// 상위형이 하위형으로 만들때 하위형 클래스는 상위로 강제 형변환
//Super obj = (super)new Sub(); 하위클래스의 공통된 멤버요소,메소드에 접근하기위해
//업캐스팅된 참조변수는 확장된 하위객체의 멤버변수/메서드에는 접근 불가능
//업캐스팅된 참조변수는 오버라이딩된 하위객체의 멤버메서드에는 접근 가능

class C03Parent {
	int x;
	void print() {};
	
}

class C03Son1 extends C03Parent {
	int y; //확장
	
	void Print() { //par는 모르는 메소드지만 오버라이딩을 사용하여 접근가능
		System.out.println("Son1에서 print 함수 사용");
	}
}

class C03Son2 extends C03Parent {
	int z;//확장
}

class C03Son3 extends C03Parent {
	int h;//확장
}

public class C02UpCasting {

	public static void main(String[] args) {
		C03Parent par = null;
		
		C03Son1 obj1 = new C03Son1();
		C03Son2 obj2 = new C03Son2();
		C03Son3 obj3 = new C03Son3();
		
		par = obj1;//upcasting par = (C03Parent)obj1
		obj1.x =10;
		obj1.y =20;
		par.x=100;
		//par.y=200;
		par.print();//par는 모르는 메소드지만 오버라이딩을 사용하여 접근가능
		
		
		
		par = obj2; //upcasting
		par.x=20;
		//par.z=30;
		
		System.out.println("obj1.x = "+obj1.x);
		System.out.println("obj2.x = "+obj2.x);
		

	}

}
