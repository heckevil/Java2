package Ch01;

import java.util.Scanner;

public class C07MaltiArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//필요한 만큼 2차원 배열의 행의 값을 받기(학생수입력을 통해)
		System.out.println("학생 수 입력 : ");
		int stdNum = sc.nextInt();
		String stdList[][] = new String[stdNum][4];
		
		
		//생성된 2차원배열의 각행마다 구분해서 국,영,수를 입력받기(문자열로받기)
		for (int i = 0; i < stdList.length; i++) {
			System.out.printf("%d 번째 입력(이름/국어/영어/수학) : ", i + 1);
			for (int z = 0; z < stdList[i].length; z++) {
				stdList[i][z] = sc.next();
			}
		}
		System.out.println();
		
		
		//학생 개별 총점과 평균 구하기
		int sum1 = 0;
		double avg1 = 0.0;
		for (int i = 0; i < stdList.length; i++) {
			sum1 = 0;
			for (int j = 0; j < stdList[i].length; j++) {
				System.out.printf("%s ", stdList[i][j]);
				if (j > 0) {
					sum1 += Integer.parseInt(stdList[i][j]);
				}
			}

			System.out.printf("총점 : %d, 평균 : %.2f", sum1, (double) sum1 / 3);
			System.out.println("");
		}
		
		
		//국,영,수 별 총점 구하기
		int scoreList[] = new int[3];
		int k = 0;
		for (int j = 1; j < 4; j++) {
			for (int i = 0; i < stdList.length; i++) {
				// stdList.lenth=행의 갯수 stdList[i].length=열의 갯수
				scoreList[k] += Integer.parseInt(stdList[i][j]);
				//문자열숫자를 정수형으로 변환하는 웨퍼클래스 Integer.parInteger.parseInt();
			}
			k++;
		}
		System.out.printf("%S %s %s ", scoreList[0], scoreList[1], scoreList[2]);

	}
}
