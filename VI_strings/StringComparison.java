package VI_strings;

public class StringComparison {
    public static void main(String[] args) {
//        when we declare string like below example
//        String s1 = "welcome";
//        String s2 = "welcome";
//        System.out.println(s1==s2); // true
//        System.out.println(s1.equals(s2)); // true



//        String s1 = new String("welcome");
//        String s2 = new String("welcome");
//        System.out.println(s1==s2); // false
//        System.out.println(s1.equals(s2)); // true




        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


//        equals() ---> compare the values
//        == ---> compare the objects

    }
}
