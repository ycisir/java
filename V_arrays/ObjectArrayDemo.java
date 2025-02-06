package V_arrays;

public class ObjectArrayDemo {
    public static void main(String[] args) {
//        for storing heterogenous data (multiple data types in single arr)
//        Object is a root class of all predefined class of java
        Object arr[] = {1, 99.0, "Nineteen", true, 'Y'};
//        for (Object val: arr) {
//            System.out.println(val);
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
