package Ch04;

public class C02CarMain {

	public static void main(String[] args) {
		C02Car car1 = new C02Car();
		C02SuperCar ram = new C02SuperCar();
		ram.owner = "홍길동";
		ram.fuel = 100;
		ram.StartCar();
		ram.OpenCar();
		ram.CloseCar();
		ram.PowerOff();

	}

}
