package VII_object_oriented_programming;

public class GreetingsMain {
//    methods
    public static void main(String[] args) {
        Greetings gr = new Greetings();
        gr.method1();

        String s = gr.method2();
        System.out.println(s);

        gr.method3("harry");

        String name = gr.method4("jack");
        System.out.println(name);
    }
}
