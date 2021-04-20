package ch02;

class C03Person {
	String name;
	int age;
	String addr;
}

public class C03ClassArr {

	public static void main(String[] args) {

		C03Person[] employees = new C03Person[3];
//한칸 한칸 객체를 만들어줘야한다. 클래스 배열만들때.png 참조
		employees[0] = new C03Person();
		employees[1] = new C03Person();
		employees[2] = new C03Person();

 		employees[0].name = "정우균";
		employees[0].age = 40;
		employees[0].addr = "대구";
		
		employees[1].name = "이지성";
		employees[1].age = 33;
		employees[1].addr = "부산";
		
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i].name);
			System.out.println(employees[i].age);
			System.out.println(employees[i].addr);
			System.out.println();
			
		}
		
	}

}
