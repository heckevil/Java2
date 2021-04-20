package Ch01;

public class C06MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 10;
		arr[1][2] = 10;
		arr[1][3] = 10;

		System.out.println("arr 행의 갯수 : " +arr.length);
		System.out.println("arr의 0번째 요소 길이 : " +arr[0].length);
		System.out.println("arr 1번째 요소 길이 : " +arr[1].length);
		int[][] arr1 = {
				{10,20,30},
				{40,50,60},
				{70,80},
				{90},
				{100,101,102,103}
		};
		for(int i=0; i <arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.println(arr[i][j]+" ");
			}
		}
	}

}
