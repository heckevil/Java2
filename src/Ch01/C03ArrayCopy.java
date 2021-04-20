package Ch01;

public class C03ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//얕은복사 (위치값 복사)
		int[] arr1 = new int[3];
		int[] arr2 = {100,200,300};
		arr2=arr1; //윗치값을 복사시켜서 넣어준다.
		System.out.println(arr1);
		System.out.println(arr2);
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30; //위치 값이 복사되어 넣어졌기때문에 반영된다
		System.out.println("0 idx : " + arr2[0]);
		System.out.println("1 idx : " + arr2[1]);
		System.out.println("2 idx : " + arr2[2]);
	}

}
