package II_operators;

public class AssignmentOne {
    public static void main(String[] args) {
//        swapping two number without temp variable

        int a=11, b=22;
        System.out.println("a = "+a+", "+"b = "+b);
        a = a+b; //100
        b = a-b; //1
        a = a-b; //99
        System.out.println("a = "+a+", "+"b = "+b);
    }
}
