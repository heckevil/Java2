package Ch03;

//자바 메모리 구조

//
//1) 스택영영 : {}내 변수
//  		{}내에 생성되고, {} 벗어나면 소멸
//
//2)힙영역 : 객체 저장공간
//		new 예약어를 통해서 생성, 소멸은 JVM 가비지 컬렉터에 의해 소멸
//		
//3) 클래스 영역 : 공유 메모리
//			static변수, static매서드 멤머메서드 생성자 매서드
//			프로그램 시작과 동시에 생성, 프로그램 종료시 소멸

class C01Simple {
	static int num1 = 0; // 객체 생성과 무관하게 입력하자마자 힙공간에 올라가서 쓸수있느 변수

	int num2; // 객체화 해야 쓸수있음

	void ShowNum() {
		System.out.println("Num1 = " + num1 + "Num 2 : " + num2);
	}

}

public class Ch01StaticVar {
	public static void main(String[] args) {
//	C01Simple obj1 = new C01Simple();
//	C01Simple obj2 = new C01Simple();
//	obj1.num1=10;
//	obj1.num2=20;
//	obj1.ShowNum();
//	obj2.ShowNum();
		C01Simple.num1 = 100; //스태틱이 붙은건 객체화 하지 않아도 입출력 가능
		

	}
}
