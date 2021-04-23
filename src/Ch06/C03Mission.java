package Ch06;
//추상클래스명 : unit;

//좌표위치 int x, int y 가 멤버변수로
//공통적인 메서드 move() , stop() 추상메서드로 선언

abstract class Movement {
	int x;
	int y;

	abstract void move(int x, int y);

	abstract void stop();
}

class Marine extends Movement { // 보병
	// 현재 위치
	@Override
	void move(int x, int y) {
		/* */ } // 지정된 위치로 이동

	@Override
	void stop() {
		/* */ } // 현재 위치에 정지

	void stimPack() {
		/* . */} // 스팀팩을 사용한다

}

class Tank extends Movement { // 탱크
	// 현재 위치
	@Override
	void move(int x, int y) {
		/* */ } // 지정된 위치로 이동

	@Override
	void stop() {
		/* */ } // 현재 위치에 정지

	void changeMode() {
		/* . */} // 공격모드를 변환한다

}

class Dropship extends Movement{ // 수송선
 // 현재 위치
@Override	
void move(int x, int y) { /* */ } //지정된 위치로 이동
@Override
void stop() { /* */ } //현재 위치에 정지
void load() { /* .*/ } //선택된 대상을 태운다
void unload() { /* .*/ } //선택된 대상을 내린다
}




public class C03Mission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		main 함수
		Marine soldier = new Marine();
		Tank tank1 = new Tank();
		Dropship ship1 = new Dropship();

	}

}
