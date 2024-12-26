class Main {
	public static void main(String[] args) {
		// single inheritance
		// Child obj = new Child();
		// obj.getData(0,1);
		// obj.add();


		// mulilevel inheritance
		// GrandSon obj = new GrandSon();
		// obj.getData(1,2);
		// obj.add();
		// obj.disp();



		// hierarchical inheritance
		// Father objf = new Father();
		// objf.getData(1,99);
		// objf.disp();
		// Son objs = new Son();
		// objs.getData(1,99);
		// objs.disp();
		// Daughter objd = new Daughter();
		// objd.getData(1,99);
		// objd.disp();




		// final keyword with method
		Father objf = new Father();
		Son objs = new Son();
		Daughter objd = new Daughter();
		objf.disp();
		objs.cal();
		objd.cal();
	}
}


// single inheritance
// class Parent {
// 	int a, b;
// 	void getData(int x, int y) {
// 		a=x;
// 		b=y;
// 	}
// };

// class Child extends Parent {
// 	void add() {
// 		System.out.println("sum = "+(a+b));
// 	}
// }







// mulilevel inheritance
// class Father {
// 	int a, b;
// 	void getData(int x, int y) {
// 		a=x;
// 		b=y;
// 	}
// };

// class Son extends Father {
// 	int c = 5;
// 	int add() {
// 		return (a+b+c);
// 	}
// };

// class GrandSon extends Son {
// 	void disp() {
// 		System.out.println("a = "+(a));
// 		System.out.println("b = "+(b));
// 		System.out.println("c = "+(c));
// 		System.out.println("sum = "+add());
// 	}
// }






// hierarchical inheritance
// also method overriding
// class Father {
// 	int a, b;
// 	void getData(int x, int y) {
// 		a=x;
// 		b=y;
// 	}
// 	void disp() {
// 		System.out.println("a = "+(a));
// 		System.out.println("b = "+(b));
// 	}
// };

// class Son extends Father {
// 	int add() {
// 		return (a+b);
// 	}
// 	void disp() {
// 		System.out.println("sum = "+add());
// 	}
// };

// class Daughter extends Father {
// 	int mul() {
// 		return (a*b);
// 	}
// 	void disp() {
// 		System.out.println("multiplication = "+mul());
// 	}
// };








// final with method === when we dont want to override our method by derived class we use final
class Father {
	int a=1;
	final void disp() {
		System.out.println("father class\n");
	}
};

class Son extends Father {
	int b=99;
	void cal() {
		int sum = a+b;
		System.out.println("addition="+sum+"\n");
	}
};

class Daughter extends Father {
	int c=19;
	void cal() {
		int mul = a*c;
		System.out.println("multiplication="+mul+"\n");
	}
};











// final with class = when we dont want to inherit out class we use final
// final class Father {

// }

// class Son extends Father { // we cant inherit final class

// }