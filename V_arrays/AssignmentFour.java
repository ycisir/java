package V_arrays;

import java.util.Arrays;

public class AssignmentFour {
    public static void main(String[] args) {
//        q1: sum of array
//        int arr[] = {1, 2, 3, 4, 5};
//        int ans = 0;
//        for (int i = 0; i < arr.length; i++) {
//            ans += arr[i];
//        }
//        System.out.println(ans);



//        q2: count even and odd numbers from an array
//        int arr[] = {1, 2, 3, 4, 5};
//        int odd = 0, even = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]%2 == 0)
//                even ++;
//            else
//                odd++;
//        }
//        System.out.println("odd number count = "+odd+", "+"even number count = "+even);




//        q3: sorting array element using for loop
//        int arr[] = {50, 20, 40, 10, 100};
//        int arr[] = {500, 20, 40, 1, 10, 100, 99};
//        System.out.println("before sorting: "+ Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tmp;
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        System.out.println("after sorting: "+ Arrays.toString(arr));




//        q4: find missing number in array
//        int arr[] = {1, 2, 5, 3};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tmp;
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//        }
//
//        if (count>1) {
//            System.out.println("array contains duplicates");
//        } else {
//            int last_digit = arr[arr.length-1];
//            int sum = 0;
//            for (int i = 0; i < arr.length; i++) {
//                sum += arr[i];
//            }
//            int missing_element = (last_digit*3) - sum;
//            System.out.println(missing_element);
//        }




//        q5: find largest number in array
//        int arr[] = {50, 20, 40, 10, 100};
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max)
//                max = arr[i];
//        }
//        System.out.println(max);

        // second approach is first sort the array and return last element
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tmp;
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        System.out.println(arr[arr.length-1]);




//        q6: find smallest number in array
//        int arr[] = {50, 20, 40, 10, 100};
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min)
//                min = arr[i];
//        }
//        System.out.println(min);

        // second approach
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tmp;
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        System.out.println(arr[0]);
    }
}
