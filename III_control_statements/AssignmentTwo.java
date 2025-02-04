package III_control_statements;

public class AssignmentTwo {
    public static void main(String[] args) {
//        question: 1
//        largest of two numbers

//        int a=100,b=20;
//        int res = a>b ? a : b;
//        System.out.println(res);


//        question: 2
//        smallest of three numbers

//        int a=1,b=99,c=19;
//        if (a<b && a<c)
//            System.out.println(a);
//        else if (b<a && b<c)
//            System.out.println(b);
//        else
//            System.out.println(c);



//        question: 3
//        print week number using week names (swithc)

        String week_name = "Friday";

        switch (week_name) {
            case "Sunday": System.out.println(1); break;
            case "Monday": System.out.println(2); break;
            case "Tuesday": System.out.println(3); break;
            case "Wednesday": System.out.println(4); break;
            case "Thursday": System.out.println(5); break;
            case "Friday": System.out.println(6); break;
            case "Saturday": System.out.println(7); break;
            default: System.out.println("invalid day");
        }


    }
}
