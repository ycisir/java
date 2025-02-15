package VII_object_oriented_programming;

public class ConstructorDemo {
    int x;
    int y;
//    default constructor
    ConstructorDemo() {
        x=100;
        y=200;
    }

//    parameterized constructor
    ConstructorDemo(int a, int b) {
        x=a;
        y=b;
    }

    void sum() {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo(); // default constructor invoked
         ConstructorDemo cd1 = new ConstructorDemo(10,20); // parameterized constructor invoked
        cd.sum();
        cd1.sum();
    }
}
