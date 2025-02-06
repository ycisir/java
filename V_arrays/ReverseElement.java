package V_arrays;

import java.util.Arrays;

public class ReverseElement {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400, 500};

        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
