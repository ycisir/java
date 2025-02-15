package VII_object_oriented_programming;

public class Student {
//    class variables
    int sid;
    String sname;
    char grade;

    void printData() {
        System.out.println(sid+"  "+sname+"   "+grade);
    }


//    local variables or method specific variables
//    void setStudentData(int id, String name, char gr) {
//        sid = id;
//        sname = name;
//        grade = gr;
//    }

    Student(int id, String name, char gr) {
        sid = id;
        sname = name;
        grade = gr;
    }
}
