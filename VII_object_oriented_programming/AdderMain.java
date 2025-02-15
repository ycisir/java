package VII_object_oriented_programming;

public class AdderMain {
//    polymorphism
//    method overloading
    public static void main(String[] args) {
        Adder ad = new Adder();
        ad.sum();
        ad.sum(1,3);
        ad.sum(1.0, 5);
        ad.sum(1, 9.0);
    }
}
