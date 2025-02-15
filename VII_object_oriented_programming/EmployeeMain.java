package VII_object_oriented_programming;

public class EmployeeMain {
//    classes and objects
    public static void main(String[] args) {
        // object
        Employee emp1 = new Employee();
        emp1.eid = 101;
        emp1.ename = "Harry";
        emp1.job = "Developer";
        emp1.sal = 100000;
        emp1.display();

        Employee emp2 = new Employee();
        emp2.eid = 102;
        emp2.ename = "Ron";
        emp2.job = "Designer";
        emp2.sal = 50000;
        emp2.display();

    }
}
