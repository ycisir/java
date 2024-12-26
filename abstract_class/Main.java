class Main {
	public static void main(String[] args) {
		Son s = new Son();
		Daughter d = new Daughter();
		s.disp();
		d.disp();
	}
}

abstract class Father {
	abstract void disp();
}

class Son extends Father {
	void disp() {
		System.out.println("abstract method defined in son class");
	}
}


class Daughter extends Father {
	void disp() {
		System.out.println("abstract method defined in daughter class");
	}
}