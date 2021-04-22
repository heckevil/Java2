package Ch03;
class C04Store{
	static float coffeeSale;
	static float colaSale;
	static float ciderSale;
	
	int coffeePrice;
	int colaPrice;
	int ciderPrice;
	
	String StorName;
	
	C04Store (String name,int coffee,int cola, int cider){
		this.coffeePrice = coffee;
		this.colaPrice = cola;
		this.ciderPrice = cider;
		this.StorName = name;
		
	}
	public void ShowPrice () {
		System.out.println("------"+StorName+"------");
		System.out.println("커피 : "+(int)((coffeePrice)-(coffeePrice*coffeeSale)));
		System.out.println("콜라 : "+(int)((colaPrice)-(colaPrice*colaSale)));
		System.out.println("사이다 : "+(int)((ciderPrice)-(ciderPrice*ciderSale)));
		
	}
	
	
}
public class C04StorMain {

	public static void main(String[] args) {
		//객체 할인률
C04Store.coffeeSale = 0.05F;
C04Store.colaSale = 0.03F;
C04Store.ciderSale = 0.02F;

//편의점 지점 생성
C04Store Gamsam = new C04Store("GS감삼점",1000,2000,2200);
C04Store JukJeon = new C04Store("GS죽전점",1500,1800,1900);
C04Store DongSungRo= new C04Store("GS동성로점",2000,2500,2600);

//편의점 ㅈ지점별 제품가격
System.out.println("------지점별 제품 가격------");
Gamsam.ShowPrice();
JukJeon.ShowPrice();
DongSungRo.ShowPrice();
	}

}
