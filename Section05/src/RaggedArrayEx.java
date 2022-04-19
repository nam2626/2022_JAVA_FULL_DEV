
public class RaggedArrayEx {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[]{1,5,6,78,9,0,2};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println();
		arr[0] = new int[5];
		System.out.println(arr[0]);
	}
}






