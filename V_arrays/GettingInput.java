package V_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GettingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter int value: ");
//        int num = sc.nextInt(); // cant get double type
//        System.out.print("Entered value: "+num);



//        System.out.print("Enter double value: ");
//        double num = sc.nextDouble(); // can get integer type
//        System.out.print("Entered value: "+num);


//        System.out.print("Enter string value: ");
//        String name = sc.next(); // only get jack from this [jack sparrow]
//        System.out.print("Entered value: "+name);



//        System.out.print("Enter string value: ");
//        String name = sc.nextLine();
//        System.out.print("Entered value: "+name);

        int arr[] = new int[5];

//        System.out.print("Enter array element: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element for position: "+i+": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array elements: "+ Arrays.toString(arr));
    }
}
