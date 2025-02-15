package VII_object_oriented_programming;

import java.io.PrintStream;

public class StaticKeywordMain {
    public static void main(String[] args) {
        System.out.println(StaticKeyword.a);
        StaticKeyword.m1();

        StaticKeyword st=new StaticKeyword();
        System.out.println(st.b);
        st.m2();

        st.m3();
    }
}




//Below are exaples

//class Test {
//    static String s = "test";
//}
//Test.s.length();



//class System {
//    static PrintStream out;
//}
//
//System.out.println();