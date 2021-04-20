package Ch01;

import java.util.Scanner;

public class C03BaisicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[10];
		int[] arr = {1,5,6,7,8,1,20,56,49,55};
		int sum = 0;
		double avr = 0.0;
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < arr.length; i++) {
//			System.out.printf("%d idx 입력 : ", i);
//			arr[i] = sc.nextInt();
//			sum += arr[i];
//		}
		System.out.println(sum);
		System.out.println((double) sum / arr.length);
		
		int max = arr[0];
		int min =arr[0];
		for(int i=0; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {min = arr[i];}
		}
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
	}

}
