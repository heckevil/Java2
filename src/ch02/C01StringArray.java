package ch02;

public class C01StringArray {

	public static void main(String[] args) {
		//String 클래스 배열(위치값을 가르키는 참조변수 형)
		//문자열상수는 상수 pool에 선저장후 name[0] 참조변수의 위치값에 저장된다
		String[] name = new String[3];
		name[0] = "정우균";
		name[1] = "이태수";
		name[2] = "홍길동";
		System.out.println("name배열의 길이 : "+name.length);
		//System.out.prinln(System.identityHashCode("정우균"));
		
		//String 클래스 배열 (입력되는 값에 딸 ㅏ객체 배열 생성)
		String[] addr = {"대구","울산","부산","진해"};
		System.out.println("addr배열 길이 : "+addr.length);
		
		System.out.printf("이름 : %s 주소 : %s \n",name[0],addr[0]);
		System.out.printf("이름 : %s 주소 : %s \n",name[1],addr[1]);
		System.out.printf("이름 : %s 주소 : %s \n",name[2],addr[2]);

	}

}
