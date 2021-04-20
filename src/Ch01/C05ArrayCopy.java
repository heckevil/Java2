package Ch01;

public class C05ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		int[] arr2 = {100,200,300};
	//요소간 복사
		arr2[0] = arr1[0];
		arr2[1] = arr1[1];
		arr2[2] = arr1[2];
		for(int i=0; i<arr2.length;i++) {
			arr2[i] = arr1[i];
		}
	}

}
