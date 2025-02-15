package VII_object_oriented_programming;

public class ThisKeyword {
//    class variables
    int x, y;

//    parameter are local variables
//    ThisKeyword(int x, int y) {
//        this.x=x;
//        this.y=y;
//
//        //x=x; logical error bcz method unable to understand x is class variable or local
//        //y=y;
//    }

    void setData(int x, int y) {
        this.x=x;
        this.y=y;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
//        ThisKeyword th=new ThisKeyword(10,20);
        ThisKeyword th=new ThisKeyword();
        th.setData(10,20);
        th.display();
    }
}
