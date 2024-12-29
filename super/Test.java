// How a Subclass can hide variable of super class

// class Father {
// 	int a = 100;
// }

// class Son extends Father {
// 	int a = 200; // it will print
// 	void disp() {
// 		// System.out.println("value of A: "+a); // it will print a=200

// 		// but i want to print a=100; bcz it hide
// 		System.out.println("value of super class A: "+super.a);
// 		System.out.println("value of sub class A: "+a);
// 	}
// }


// initializing

// class Father {
// 	int a;
// }

// class Son extends Father {
// 	int a;
// 	void disp() {
// 		// a = 100; // it will set son a = 100;
// 		super.a = 100; // it will set father a = 100;
// 		System.out.println("value of sub class A: "+super.a);
// 	}
// }

















// How a Subclass can hide method of super class

// class Father {
// 	void put() {
// 		System.out.println("super class method");
// 	}
// }

// class Son extends Father {
// 	void put() {
// 		System.out.println("sub class method");
// 	}
// 	void disp() {
// 		// put();
// 		super.put();
// 	}
// }



















// super with default constructor

// class Father {
// 	Father() {
// 		System.out.println("super class constructor");
// 	}
// }

// class Son extends Father {
// 	// you have not mention super() here but here it's
// 	Son() {
// 		// super() --- this called super class constructor --- written by compiler
// 		// optional in default constructor 
// 		System.out.println("sub class constructor");
// 	}
// }













// super with parameterized constructor

// we cant inherit constructor
class Father {
	Father(int x) {
		int a = x;
		System.out.println("super class constructor A: "+a);
	}
}

class Son extends Father {
	// you have not mention super() here but here it's
	Son() {
		super(100); // number of parameters and type should be same here and in sequence
		int b = 200;
		System.out.println("sub class constructor B: "+b);
	}
}





class Test {
	public static void main(String[] args) {
		Son obj = new Son();
		// obj.disp();
	}
}