package V_arrays;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        //        declaring array
        //        approach1
//        int mat[][] = new int[3][2];
//        mat[0][0] = 1;
//        mat[0][1] = 99;

//        mat[1][0] = 19;
//        mat[1][1] = 33;

//        mat[2][0] = 43;
//        mat[2][1] = 97;
//        System.out.println(mat[1][1]);

//        approach2
        int mat1[][] = {
                {1, 99, 19},
                {33, 47, 39},
                {59, 79, 83}
        };
//        System.out.println("length of rows: "+mat1.length); // find length
//        System.out.println("length of columns: "+mat1[0].length); // find length

//        System.out.println(mat1[2][0]); // read single value


//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.print(mat1[i][j]+" ");
//            }
//            System.out.println();
//        }


//        enhanced for loop
        for (int arr[]: mat1) {
            for (int val: arr) {
                System.out.print(val+" ");
            }
            System.out.println();
        }



    }
}
