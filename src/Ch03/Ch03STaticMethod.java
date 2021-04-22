package Ch03;

class C03Simple {
	private static int num1;
	int num2;

	static void setNum1(int n) {
		num1 = n;
		//num2 = 10; //static 매서드에서은 일반 변수 X
	}

	static int getNum1() {
		return num1;
	}

}

public class Ch03STaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C03Simple.setNum1(100);
		int result = C03Simple.getNum1();
		System.out.println("num1 : " + result);
		C03Simple obj = new C03Simple();
		System.out.println("obj's num1 : " + obj.getNum1());
	}

}
