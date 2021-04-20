package ch02;

class C04Simple {
	int x;
	int y;

	C04Simple() {

		System.out.println("디폴트 생성자 호출됨!");
	}

	C04Simple(int x, int y) {
		System.out.println("인자 2 생성자 호출!");
		this.x = x;
		this.y = y;
	}
}

public class C04ClassArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C04Simple[] obj = new C04Simple[2];
		// 데이터를 담는 객체가아니라 참조하는 변수이다. 즉 생성자 호출 X
		// 각각 위치에 한번더 객체를 생성해야함
		obj[0] = new C04Simple();
		obj[1] = new C04Simple(12, 23);
		for(int i=0; i<obj.length;i++) {
			System.out.println(obj[i].x+obj[i].y);
		}
	}

}
