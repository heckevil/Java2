package Ch03;

class C02Point {
	// 공유 좌표점

	static int x1;
	static int y1;

	int x2;
	int y2;

	C02Point(int x, int y) {
		this.x2 = x;
		this.y2 = y;
	}

	public void DistanceXY() {
		System.out.println("기준점으로 부터 X좌표 :" + (x1 - x2));
		System.out.println("기준점으로 부터 y좌표 :" + (y1 - y2));
	}

}

public class C02StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C02Point.x1 = 50;
		C02Point.y1 = 50;

		C02Point pos1 = new C02Point(20, 30);
		C02Point pos2 = new C02Point(30, 40);
		System.out.println("--------------------");
		System.out.println("X : " + C02Point.x1 + " Y : " + C02Point.y1);
		System.out.println("-----------pos1---------");
		pos1.DistanceXY();
		System.out.println("-----------pos2---------");
		pos2.DistanceXY();
	}

}
