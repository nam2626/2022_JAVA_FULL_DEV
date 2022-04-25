package method;

public class MethodParameter {
	
	public static void addArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			arr[i] += 1; 
	}
	
	public static int sum(int...in) {
		int sum = 0;
		for(int i=0;i<in.length;i++)
			sum += in[i];
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		addArray(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
	}

}




