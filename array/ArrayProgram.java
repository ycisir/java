// 1

import java.util.Scanner;

class ArrayProgram {
  Scanner get = new Scanner (System.in);

  public static void main(String args[]) {
    ArrayProgram obj = new ArrayProgram();


    // 1d array
    // System.out.print("Enter the size of array: ");
    // int n = obj.get.nextInt();
    // int arr[] = new int[n];
    
    // System.out.print("Enter the digits (limit = 5): ");
    // obj.getArr(arr);

    // System.out.print("Entered array digits are: ");
    // obj.disp(arr);

    // System.out.println();






    // 2d array
    System.out.print("Number of rows: ");
    int n = obj.get.nextInt();

    System.out.print("Number of columns: ");
    int m = obj.get.nextInt();


    int matrix[][] = new int[n][m];
    // System.out.println(matrix.length);
    // System.out.println(matrix[0].length);
    System.out.println("Enter the digits: ");
    obj.getArr(matrix);

    System.out.println("Entered array digits are: ");
    obj.disp(matrix);

    // System.out.println();

  }


  // 1d array 
  // void getArr(int arr[]) {
  //   for(int i=0; i<arr.length; i++) {
  //     arr[i] = get.nextInt();
  //   }
  // }

  // void disp(int arr[]) {
  //   for(int i=0; i<arr.length; i++) {
  //     System.out.print(arr[i]+" ");
  //   }
  // }




   // 2d array 
  void getArr(int arr[][]) {
    for(int i=0; i<arr.length; i++) {
    	for(int j=0; j<arr[0].length; j++){
      	arr[i][j] = get.nextInt();
    	}
    }
  }

  void disp(int arr[][]) {
    for(int i=0; i<arr.length; i++) {
    	for(int j=0; j<arr[0].length; j++){
      	System.out.print(arr[i][j]+" ");
    	}
    	System.out.println();
    }
  }


}
