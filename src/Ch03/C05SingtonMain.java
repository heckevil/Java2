package Ch03;
//디자인 패턴
// 상품 제작시 사전에 발견 되었던 문제들을 해결하고 정형화된 작업패턴3

//프로그래밍 언어의 디자인 패턴
//프로그램 제작시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴


//싱글톤 패턴
//하나의 객체를 생성하여 다수의 클라이언트가 접속하여 사용하는 형태

//ex) db connection pool 생성

class C05Company{
	private static C05Company instance = new C05Company();
	private C05Company() {}
	public static C05Company getInstance() {
		if(instance == null) {
			instance = new C05Company();
		}
		return instance;
	}
}

public class C05SingtonMain {

	public static void main(String[] args) {
		C05Company com1 = C05Company.getInstance();
		C05Company com2 = C05Company.getInstance();
		System.out.println(com1==com2);

	}

}
