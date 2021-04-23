package Ch05;

class Powder {
	void doPrinting() {
		System.out.println("파우더 재료로 프린트!");
	}
}

class Plastic {
	void doPrinting() {
		System.out.println("플라스틱 재료로 프린트!");
	}
}

class Seramic {
	void doPrinting() {
		System.out.println("세라믹 재료로 프린트");
	}
}

class ThreeDPrint {
	Object material;

	void setMaterial(Object tmp) // Object temp = mal; 업캐스팅! 상위객체에게 하위객체 주소값이 전달된상황
	{
		material = tmp; // tmp(재료객체 참조값)를 멤버변수인 material에 저장
		// material.doPrinting(); 주소값은 들어왔지만 사용불가능 다운캐스팅 필요
	}

	void run() {// 다운캐스팅!
		if (material instanceof Powder) {
			Powder down = (Powder) material; // powder down 참조변수에 materia를 다운캐스팅
												// 참조변수 down 의 자료형과 일치하는 작업을 통해서
												// Powder 객체의 확장된 멤버에 접근이 간으하다
												// Powder 객체의 doPrinting()메소드 사용
			down.doPrinting();
		} else if (material instanceof Plastic) {
			Plastic down2 = (Plastic) material;
			down2.doPrinting();
		} else if (material instanceof Seramic) {
			Seramic down3 = (Seramic) material;
			down3.doPrinting();
		}

	}
}

class a {
}

public class C05ThreeDPrintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Powder ma1 = new Powder();
		Plastic ma2 = new Plastic();
		Seramic ma3 = new Seramic();
		ThreeDPrint pnt1 = new ThreeDPrint();

		pnt1.setMaterial(ma1);
		pnt1.run();

		pnt1.setMaterial(ma2);
		pnt1.run();

		pnt1.setMaterial(ma3);
		pnt1.run();

	}

}
