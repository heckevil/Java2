package Ch05;
//다운캐스팅 : 업캐스팅된 상황에서 필요에 의해 하위객체의 추가된(확장된)기능이나 속성에 접근할때 사용.


class C04Simple{
	int num;
}

class C04Son extends C04Simple{
	int x; 						//확장 추가
	void ShowX() {				//확장 추가
		System.out.println("X : "+x);
	}
}
public class C04DownCastingMain {
	public static void main(String[] args) {
		//업캐스팅
		C04Simple obj = new C04Son();
		
		
		obj.num=100;
		//obj.x=10;    		//추가된 하위객체의 멤버변수 접근 불가능
		//obj.ShowX();		//추가된 하위객체의 멤버메서드 접근 불가능
		
		//다운캐스팅 하는법
		C04Son down =(C04Son)obj;
		down.num = 100;
		down.x=200;
		down.ShowX();
		
	}
}
