package Ch04;

//상위 클래스 (부모클래스,수퍼클래스)
class Point2D {
	public int x;
	public int y;

	public void ShowPoint() {
		System.out.println(x + "," + y);
	}

	Point2D() {
		System.out.println("Point2D 생성자 호출");
	}
}

//하위클래스(자식클래스,서브클래스)
class Point3D extends Point2D {
	// 확장된 멤버변수
	public int z;

	public void ShowPoint3D() {
		 ShowPoint();
		System.out.println(x + "," + y + "," + z);
	}

	Point3D() {
		System.out.println("Point3D 생성자 호출");
		// 부모클래스 부터 먼저 호출 되고 자식 클래스가 호출이 된다. Point2D 생성자 호출 뜨는이유

	}
}

public class C01InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p2 = new Point2D();
		Point3D p3 = new Point3D();
		p3.x = 10;
		p3.y = 20;
		p3.z = 30;
		//p3.ShowPoint();
		p3.ShowPoint3D();

	}

}
