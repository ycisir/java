package VII_object_oriented_programming;

public class StaticKeyword {
    static int a=1; // static variable
    int b=99; // non static variable

    static void m1() { // static method
        System.out.println("static method");
    }

    void m2() { // non static method
        System.out.println("non static method");
    }

    void m3() {
        // non static methods can access everything directly
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    /*public static void main(String[] args) {
        // static methods and variables can directly access in static method
        System.out.println(a);
        m1();


        // cant access bcz these are non static create object of class and use them through object
        StaticKeyword st=new StaticKeyword();
        System.out.println(st.b);
        st.m2();

        st.m3();
    }*/

}
