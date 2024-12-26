import java.util.Scanner;
class JaggedArray {
	Scanner get = new Scanner (System.in);
	public static void main(String[] args) {
		JaggedArray obj = new JaggedArray();

		System.out.print("Enter number of rows: ");
		int m = obj.get.nextInt();
		int[][] arr = new int[m][];

		obj.getColumns(m, arr);

		System.out.println("Enter arr digits: ");
		obj.getArr(arr);

		System.out.println("Entered arr elements are: ");
		obj.printArr(arr);

	}

	void getColumns(int m, int[][] arr) {
		for(int i=0; i<m; i++) {
		System.out.print("Enter number of columns for "+(i+1)+" row: ");
			int n = get.nextInt();
			arr[i] = new int[n]; 
		}
	}


	void getArr(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = get.nextInt();
			}
		}
	}


	void printArr(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


}