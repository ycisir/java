package VII_object_oriented_programming;

//single inheritance
class A {
    int a;
    void disp() {
        System.out.println(a);
    }
}

class B extends A {
    int b;
    void show() {
        System.out.println(b);
    }
}

// multilevel
class C extends B {
    int c;
    void print() {
        System.out.println(c);
    }
}



// only one class has public access classifier in a same file
public class InheritanceTypes {
    public static void main(String[] args) {
        //B bobj=new B();
        //System.out.println(bobj.a);
        //System.out.println(bobj.b);
        //bobj.disp();
        //bobj.show();

        C cobj=new C();
        cobj.a=100;
        cobj.b=200;
        cobj.c=300;
        cobj.disp();
        cobj.show();
        cobj.print();
    }
}
