package Ch05;
class C03Moonbanggu{
	static int Sharpencount = 100;
	static int Pencilcount = 100;
	
	void write() {};
}
class C03Sharp extends C03Moonbanggu{
	@Override
	void write() {
		System.out.println("샤프로 씁니다.");
	}
	C03Sharp(){
		C03Moonbanggu.Sharpencount--;
	}
}
class C03Pencil extends C03Moonbanggu{
	void write() {
		System.out.println("연필로 씁니다.");
	}
	C03Pencil(){
		C03Moonbanggu.Pencilcount--;
	}
}

public class C03Main {

	public static void main(String[] args) {
		C03Moonbanggu gu;
		
		gu = new C03Pencil();//Upcasting
		gu.write();
		System.out.println("연필재고량 : "+C03Moonbanggu.Pencilcount);
		System.out.println("샤프재고량 : "+C03Moonbanggu.Sharpencount);
		
		gu=new C03Sharp();
		gu.write();
		System.out.println("연필재고량 : "+C03Moonbanggu.Pencilcount);
		System.out.println("샤프재고량 : "+C03Moonbanggu.Sharpencount);

	}

}
