class ConstructorClass {

	// two types of constructor
	// default constructor
	// parematerized constructor
	// constructor overloading === by parameter number, by parameter type


	// int a,b;
	
	// ConstructorClass() { //default constructor
	// 	a=19;
	// 	System.out.println("a = "+a);
	// 	System.out.println("Default constructor invoked");
	// }

	// ConstructorClass(int x, int y) { //parematerized constructor
	// 	a = x;
	// 	b = y;

	// 	System.out.println("a="+x);
	// 	System.out.println("b="+y);
	// 	System.out.println("constructor invoked");
	// }





	// constructor overloading
	int x, y, z;
	float f;
	ConstructorClass(int a) {
		x=a;
		System.out.println("x="+a);
	}

	ConstructorClass(float a) {
		f=a;
		System.out.println("f="+a);
	}

	ConstructorClass(int a, int b) {
		y=a;
		z=b;
		System.out.println("y="+a);
		System.out.println("z="+b);
	}

	public static void main(String[] args) {
		// ConstructorClass obj = new ConstructorClass();
		// ConstructorClass obj = new ConstructorClass(1, 99);
		

		ConstructorClass obj = new ConstructorClass(1);
		ConstructorClass obj1 = new ConstructorClass(19.1f);
		ConstructorClass obj2 = new ConstructorClass(1, 99);
	}
}