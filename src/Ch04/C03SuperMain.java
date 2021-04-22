package Ch04;

class C03Super {
	int num1;

	C03Super() {
		System.out.println("Super클래스 디폴트 생성자 호출!");
	}

	C03Super(int n) {
		this.num1 = n;
		System.out.println("super 클래스 인자 1 생성자 호출!");
	}
}

class C03Sub extends C03Super {
	int num2;

	C03Sub() {
		System.out.println("Sub클래스 디폴트 생성자 호출!");
	}

	C03Sub(int x, int y) {
		super(x);
		num2 = y;
		System.out.println("Sub클래스 인자 2 생성자 호출");
	}

	public void ShowNum() {
		System.out.println("NUM1 : " + super.num1); //super -> this 상관없음 상속되니 num1어차피 생성됨
		System.out.println("NUM2 : " + this.num2);
	}
}

public class C03SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C03Sub obj1 = new C03Sub(); // C03Super - >C03Sub();
		System.out.println("------------------------");
		C03Sub obj2 = new C03Sub(10, 20);

	}

}
