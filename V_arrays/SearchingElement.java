package V_arrays;

public class SearchingElement {
    public static void main(String[] args) {
//        linear search
//        int arr[] = {1, 99, 19, 33, 47};
//        int search_element = 313;
//        boolean status = false; // false --- not found, true --- found

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == search_element) {
//                System.out.println("element found");
//                status = true;
//                break;
//            }
//        }

//        for each loop
//        for (int val: arr) {
//            if (val == search_element) {
//                System.out.println("element found");
//                status = true;
//                break;
//            }
//        }
//
//        if (status == false)
//            System.out.println("element not found");






//        number repetation
        int arr[] = {1, 99, 19, 33, 47, 1, 80, 1, 73, 11, 91, 79, 1, 43};
        int search_element = 1, count = 0;

        for (int val: arr) {
            if (val == search_element)
                count++;

        }

        System.out.println(search_element+" repeat "+count+" times"+" in a array");

    }
}
