package Ch04;

class Animal {
	public void Sound() {
		System.out.println("소리를 냅니다.");
	}
}

class Cat extends Animal {

	public void Sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	public void Sound() {
		System.out.println("멍멍");
	}
}

public class C04OverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog =new Dog();
		Cat cat =new Cat();
		dog.Sound();
		cat.Sound();
	}

}
