// extending one interface
// we cant extend class with interface
// one interface extending one interface

// interface Father {
// 	// by default interface variable are --- public static final written
// 	// public static final int a = 1;
// 	int a = 1; // same as above
// 	int b = 99;
// 	void disp();
// 	int add(int x, int y);
// }

// interface Son extends Father {
// 	int c = 19;
// 	int d = 12;
// 	int mul(int x, int y);
// }









// one interface extending more than one interface

// interface Mother {
// 	int c = 19;
// 	int d = 12;
// 	int mul(int x, int y);
// }


// interface Son extends Father, Mother {

// }









// one class implement one interface

// interface Father {
// 	// by default interface variable are --- public static final written
// 	// public static final int a = 1;
// 	int a = 1; // same as above
// 	int b = 99;
// 	void disp();
// 	int add(int x, int y);
// }



// class Son implements Father {
// 	int x = Father.a;
// 	int y = Father.b;

// 	public int add(int x, int y) {
// 		return (x+y);
// 	}
// 	public void disp() {
// 		System.out.println("sum = "+add(x,y));
// 	}

// }









// one class implement more than one interface

// interface Father {
// 	// by default interface variable are --- public static final written
// 	// public static final int a = 1;
// 	int a = 1; // same as above
// 	int b = 99;
// 	int add(int x, int y);
// }

// interface Mother {
// 	int a = 1;
// 	int b = 99;
// 	int mul(int x, int y);
// }



// class Son implements Father, Mother {
// 	int a = Father.a;
// 	int b = Father.b;

// 	int x = Mother.a;
// 	int y = Mother.b;

// 	public int add(int x, int y) {
// 		return (x+y);
// 	}
// 	public int mul(int x, int y) {
// 		return (x*y);
// 	}

// 	void disp() {
// 		System.out.println("sum = "+add(a,b));
// 		System.out.println("mul = "+mul(x,y));
// 	}

// }











// extend class and implements interface together --- multiple inheritence

// class Father {
	
// 	int a = 19;
// 	int add(int y) {
// 		int b = y;
// 		return (a+b);
// 	}
// }

// interface Mother {
// 	int c = 99;
// 	void disp();
// }



// class Son extends Father implements Mother {

// 	int mul = a * Mother.c;
// 	int sum = add(1);

// 	public void disp() {
// 		System.out.println("addition = "+sum);
// 		System.out.println("multiplication = "+mul);
// 	}

// }
















// extend class and implements interface together --- hybrid inheritence (combination of two or more type inheritence)

// classes 										interface

// student
// exam extends student							project
// result extends exam implements project

// above class is multilevel inheritence and if we ignore student project and exam represent muliple inheritance

class Student {
	int roll_num = 1;
	int practical = 50;
}

class Exam extends Student {
	int theory = 100;
	int total_mark = theory + practical;
}

interface Project {
	int project_mark = 200;
	void disp();
}

class Result extends Exam implements Project {
	int passing = total_mark + Project.project_mark;
	
	public void disp() {
		System.out.println("Roll number: "+ roll_num);
		System.out.println("Theory: "+ theory);
		System.out.println("Practical: "+ practical);
		System.out.println("Project: "+ Project.project_mark);
		System.out.println("Total marks: "+ passing);
	}
}

class Test {
	public static void main(String[] args) {
		Result obj = new Result();
		obj.disp();
	}
}