package Ch03;

//상수
// 심볼릭 상수 : 문자형 이름 O - Final
// 리터럴 상수 : 문자형 이름 X


public class C07FinalMain {
	int num = 10;
	final int NUM = 100;

	public static void main(String[] args) {

		C07FinalMain obj = new C07FinalMain();
		obj.num = 100;
		//obj.NUM=200; final은 변경 불가
	}

}
