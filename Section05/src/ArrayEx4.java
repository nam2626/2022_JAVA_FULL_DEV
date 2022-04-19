import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//for each
		//n은 arr로부터 값을 하나씩 복사 받기때문에
		//n값이 바뀌어도 arr과는 상관이 없다
		for(int n : arr) {
			System.out.println(n);
			n++;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
