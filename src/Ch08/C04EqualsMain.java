package Ch08;

class A {
	
	
}


public class C04EqualsMain {

	public static void main(String[] args) {
		A obj1 =new A();
		A obj2 =new A();
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println("-------------------");
		String str1 =new String("abc");
		String str2 =new String("abc");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));//객체를 각각 만들어서 주소값이 다를꺼라 생각하지만
		//toString을 재정의 하여 문자열이 같으니 true
		
		}

}
