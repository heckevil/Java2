package Ch04;

public class C02Car {
	String owner;
	int fuel;

	public void StartCar() {
		System.out.println("차 시동을 겁니다.");
	}

	public void PowerOff() {
		System.out.println("차 시동을 끕니다.");
	}

}

class C02SuperCar extends C02Car {
	public void OpenCar() {
		System.out.println("차 뚜껑을 엽니다.");
	}

	public void CloseCar() {
		System.out.println("차 뚜껑을 닫습니다.");
	}
}
