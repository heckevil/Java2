package Ch06;

class C02MoonBangGguMain {
	static abstract class C03Moonbanggu {
		static int Sharpencount1 = 100;
		static int Pencilcount1 = 100;

		abstract void write();
	}

	class C03Sharp extends C03Moonbanggu {
		@Override
		void write() {
			System.out.println("샤프로 씁니다.");
		}

		C03Sharp() {
			C03Moonbanggu.Sharpencount1--;
		}
	}

	class C03Pencil extends C03Moonbanggu {
		void write() {
			System.out.println("연필로 씁니다.");
		}

		C03Pencil() {
			C03Moonbanggu.Pencilcount1--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
