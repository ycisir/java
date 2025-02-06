package V_arrays;

public class SingleDimensionalArrayDemo {
    public static void main(String[] args) {
//        declaring array
//        approach1
//        int a[] = new int[5]; // size of 5 fixed arr
//        a[0] = 1;
//        a[1] = 99;
//        a[2] = 19;
//        a[3] = 47;
//        a[4] = 33;

//        approach2
        int a[] = {1,99,19,33,47}; // dynamic nature
//        System.out.println(a.length); // find length
//
//        System.out.println(a[3]); // accessing single value using index value
//
//        for (int i=0; i<a.length; i++) { // i<=4, i<5, i<=a.length-1 or i<a.length
//            System.out.println(a[i]);
//        }


//        enhanced for loop for collection (foreach)
        for (int i:a) {
            System.out.println(i);
        }




    }
}
