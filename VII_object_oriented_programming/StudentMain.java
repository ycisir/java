package VII_object_oriented_programming;

public class StudentMain {
//    methods
    public static void main(String[] args) {
        System.out.println("Id   Name    Grade");
//        Student stud1 = new Student();
//      1: assign data through object reference variable
//        stud1.sid = 101;
//        stud1.sname = "Ginny";
//        stud1.grade = 'A';
//        stud1.printData();


//      2: assign data through method
//        Student stud2 = new Student();
//        stud2.setStudentData(102, "Harry", 'C');
//        stud2.printData();

//      3: constructor
        Student stud1 = new Student(101, "Ginny", 'A');
        Student stud2 = new Student(102, "Harry", 'C');
        stud1.printData();
        stud2.printData();
    }
}
