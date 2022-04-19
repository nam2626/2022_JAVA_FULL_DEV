
public class Array2DEx2 {

	public static void main(String[] args) {
		int[][] arr = new int[][]{ 
				    //   0 1 2 3   
 						{1,2,3,4},//0행
					//   0 1 2 3   
						{5,6,7,8},//1행
					//   0 1  2  3   
						{9,10,11,12}//2행
					  };
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
									
	}

}
