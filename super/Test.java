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

class Father {
	void put() {
		System.out.println("super class method");
	}
}

class Son extends Father {
	void put() {
		System.out.println("sub class method");
	}
	void disp() {
		// put();
		super.put();
	}
}






class Test {
	public static void main(String[] args) {
		Son obj = new Son();
		obj.disp();
	}
}