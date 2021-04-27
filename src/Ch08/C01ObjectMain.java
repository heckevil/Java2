package Ch08;

class ABC {

	@Override
	public String toString() {
		
		return "ABC클래스로 만든 객체 입니다.";
	}
 
}

public class C01ObjectMain {

	public static void main(String[] args) {

		ABC obj = new ABC();
		System.out.println(obj);
		System.out.println(obj.toString());
	}

}
