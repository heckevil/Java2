package ch02;

import java.util.Scanner;

class Profile {
	String name;
	int age;
	String gender;
	String addr;
	String phone;
	String email;
}

public class C05ClassArrMission {

	public static void main(String[] args) {
//		사람의 수를 입력받아
//		profile 클래스로 프로필리스트(Plist[])를 해당 수만큼 배열생성후
//		각요소에 객체 Profile를 바인딩(요소에 주소 저장)한뒤
//		각 배열 요소에 프로필 정보를 키보드로부터 입력받아 저장, 출력.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("사람수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine(); //인트를 버퍼공간을 초기화 시키려고 넣어준다
		Profile[] Plist = new Profile[num];
		for (int i = 0; i < num; i++) {
			Plist[i] = new Profile();
			System.out.println("이름 : ");
			Plist[i].name = sc.next();
			System.out.println("나이 : ");
			Plist[i].age = sc.nextInt();
			sc.nextLine(); //인트를 버퍼공간을 초기화 시키려고 넣어준다
			System.out.println("전화번호 : ");
			Plist[i].phone = sc.next();
			System.out.println("주소 : ");
			Plist[i].addr = sc.next();
			System.out.println("이메일 : ");
			Plist[i].email = sc.next();
		}
		for (int i = 0; i < num; i++) {
			System.out.printf("%s %d %s %s %s", Plist[i].name, Plist[i].age, Plist[i].phone, Plist[i].addr,
					Plist[i].email);
		}
	}

}
