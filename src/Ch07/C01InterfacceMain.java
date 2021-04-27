package Ch07;
interface Remocon{
	
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	void TurnON();
	void TurnOFF();
	void setVolume(int volume);
	
}

class TV implements Remocon{

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
		if(volume > MAX_VOLUME) {
			this.volume=MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume=MIN_VOLUME;
		} else
			this.volume = volume;
		System.out.println("현재 tv volume : "+this.volume);
		
	}
	
	
}
class Radio implements Remocon{

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
		if(volume > MAX_VOLUME) {
			this.volume=MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume=MIN_VOLUME;
		} else
			this.volume = volume;
		System.out.println("현재 raido volume : "+this.volume);
		
	}
	
	
}
public class C01InterfacceMain {
	public static void main(String[] args) {
		
		Remocon rc = null;
		TV LG1234 = new TV();
		Radio Rdio = new Radio();
		
		rc=LG1234;
		rc.TurnON();
		rc.setVolume(0);
		rc.TurnOFF();
		rc=Rdio;
		rc.TurnON();
		rc.TurnOFF();
	}
}
