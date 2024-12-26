// labelled and unlabelled break statement
// labelled and unlabelled continue statement

// class Test {
// 	public static void main(String[] args) {
		// unlabelled === it terminate the inner for-loop
		// for(int i=0; i<5; i++) {
		// 	for(int j=0; j<5; j++) {
		// 		if(i == 3)
		// 			break;
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }


		// labelled = it terminate the labels
		// abc: // label
		// for(int i=0; i<5; i++) {
		// 	for(int j=0; j<5; j++) {
		// 		if(i == 3)
		// 			break abc;
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }







		// unlabelled === it skip the inner for-loop iteration when condition meets
		// for(int i=0; i<5; i++) {
		// 	for(int j=0; j<5; j++) {
		// 		if(i == 3)
		// 			continue;
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }



		// labelled === it skip the label
		// abc: // label
		// for(int i=0; i<5; i++) {
		// 	for(int j=0; j<5; j++) {
		// 		if(i == 3)
		// 			continue abc;
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }


// 	}
// }









// for each loop
// enhanced for loop

// class Test {
// 	public static void main(String[] args) {
// 		int[][] matrix = {{1, 99}, {19, 1}, {-1, -1}};
// 		for(int[] i: matrix) { // scan first row and store it in "i"
// 			for(int j: i) {
// 				System.out.print(j+" ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }














// final keyword === read only variable
// final with instance variable
// class Test {
// 	public static void main(String[] args) {
// 		A obj = new A();
// 		System.out.println("instance variable value: "+obj.y);
// 	}
// }


// class A {
// 	// final int y = 19;
// 	final int y; // now we cant assign any value, instead we use constructor for assign
// 	A() {
// 		y = 19;
// 	}
// }














// final with static variable
// final mean constant
// class Test {
// 	public static void main(String[] args) {
// 		A obj = new A();
// 		System.out.println("static/class variable value: "+obj.y);
// 	}
// }


// class A {
// 	// final int y = 19;
// 	static final int y; // now we cant assign any value, instead we use static block
// 	static {
// 		y = 19;
// 	}
// }















// final with local variable
// class Test {
// 	public static void main(String[] args) {
// 		A obj = new A();
// 		obj.disp();
// 	}
// }


// class A {
// 	// final int y = 19;
// 	void disp() {
// 		final int y; // now we cant assign any value, instead we can initialize with same method or block before use it
// 		y = 19;
// 		System.out.println("local variable value: "+y);
// 	}
// }












// final with parameter
class Test {
	public static void main(String[] args) {
		A obj = new A();
		obj.disp(19);
	}
}


class A {
	// final int y = 19;
	void disp(final int y) {
		// y = 1; // now we cant assign any value when we use final parameter above
		System.out.println("y: "+y);
	}
}






