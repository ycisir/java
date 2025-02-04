package III_control_statements;
import java.util.Scanner;

public class ConditionalStatementsDemo {
    public static void main(String[] args) {

//        ex:1
//        int person_age = 13;
//
//        if (person_age > 18) {
//            System.out.println("Eligible for vote");
//        } else {
//            System.out.println("Not eligible");
//        }


//        ex:2
//        int num = 19;
//
//        if (num%2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }



//        ex:3
//        int num = 1;
//        if (num > 0)
//            System.out.println("positive number");
//        else if (num < 0)
//            System.out.println("negative number");
//        else
//            System.out.println("number is 0");


//        ex:4
//        int a=10, b=20, c=30;
//
//        if (a>b && a>c)
//            System.out.println("a is greater");
//        else if (b>a && b>c)
//            System.out.println("b is greater");
//        else
//            System.out.println("c is greater");



        int num1, num2;
        char oper;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter operator: ");
        oper = sc.next().charAt(0);

        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        int res = 0;
        switch (oper) {
            case '+': {
                res = num1+num2;
                System.out.println(res);
                break;
            }
            case '-': {
                res = num1-num2;
                System.out.println(res);
                break;
            }
            case '*': {
                res = num1*num2;
                System.out.println(res);
                break;
            }
            case '/': {
                res = num1/num2;
                System.out.println(res);
                break;
            }
            case '%': {
                res = num1%num2;
                System.out.println(res);
                break;
            }
            default: {
                System.out.println("invalid input");
            }
        }

    }
}
