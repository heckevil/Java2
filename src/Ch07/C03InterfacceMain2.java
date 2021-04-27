package Ch07;

interface Remocon2 {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	void TurnON();

	void TurnOFF();

	void setVolume(int volume);

}

class TV2 implements Remocon2 {

	private int volume;

	@Override
	public void TurnON() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void TurnOFF() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else
			this.volume = volume;
		System.out.println("현재 tv volume : " + this.volume);

	}

}

class Radio2 implements Remocon2 {

	private int volume;

	@Override
	public void TurnON() {
		System.out.println("raido를 켭니다.");

	}

	@Override
	public void TurnOFF() {
		System.out.println("radio를 켭니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else
			this.volume = volume;
		System.out.println("현재 raido volume : " + this.volume);

	}

}

public class C03InterfacceMain2 {
	public static void main(String[] args) {

		Remocon2 rc = null;
		TV2 LG1234 = new TV2();
		Radio2 Rdio = new Radio2();

	}
}
