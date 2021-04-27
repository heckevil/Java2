package Ch08;

class MyData1 {
	int num;

	public MyData1(int num) {
		this.num = num;
	}
}

class MyData2 {
	int num;

	public MyData2(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) { //oject obj = md4
		MyData2 down = (MyData2)obj;
		return this.num==down.num;
	}
}

public class C05EqualsMain {

	public static void main(String[] args) {
		MyData1 md1 = new MyData1(100);
		MyData1 md2 = new MyData1(100);
		System.out.println(md1.equals(md2));
		System.out.println(md1 == md2);
		
		MyData2 md3 = new MyData2(100);
		MyData2 md4 = new MyData2(100);
		System.out.println(md3.equals(md4));
		System.out.println(md3 == md4);
	}

}
