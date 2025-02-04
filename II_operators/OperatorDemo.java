package II_operators;

public class OperatorDemo {
    public static void main(String[] args) {
//        1 : arithmatic
        int a = 5, b = 2;

        System.out.println("addition : "+(a+b));
        System.out.println("substraction : "+(a-b));
        System.out.println("multiplication : "+(a*b));
        System.out.println("division : "+(a/b)); // qoutient
        System.out.println("modulo : "+(a%b)); // remainder

        System.out.println();


//        2 : relational
//        return boolean value
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        System.out.println();


//        3 : logical
//        work on boolean values
//        return boolean value
        boolean x=true, y=false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!y);
        System.out.println(!x);

        System.out.println();


//        4 : increment/decrement
        int z = 1;
        int res = z++;
        System.out.println(res); // 1


        int zx = 1;
        int res1 = ++zx;
        System.out.println(res1); // 2

        System.out.println();



//        5 : assignment
        int c = 1;
        c += 99;
        c -= 19;
        System.out.println(c);

        System.out.println();


//        6 : ternary
        String name = "harry";
        int age = 18;
//        System.out.println(age > 18 ? "Hi, "+name : "not eligible");

        String res12 = age > 18 ? "Hi, "+name : "not eligible";
        System.out.println(res12);

    }
}
