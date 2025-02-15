package VII_object_oriented_programming;

public class BoxMain {
//    constructor overloading
    public static void main(String[] args) {
        Box b = new Box();
        Box b1 = new Box(10.0, 20.0, 30.0);
        Box b2 = new Box(30.0);
        System.out.println(b.volume());
        System.out.println(b1.volume());
        System.out.println(b2.volume());
    }
}
