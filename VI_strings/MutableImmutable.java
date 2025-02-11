package VI_strings;

public class MutableImmutable {
    public static void main(String[] args) {
//        string are immutable

//        String s = "welcome";
//        System.out.println(s);
//        s.concat(" to java"); // cant change original value of s
//        System.out.println(s);



//        stringbuffer are mutable

//        StringBuffer s = new StringBuffer("welcome");
//        s.append(" to jave"); // can change original value of s
//        System.out.println(s);



//        stringbuilder are mutable
        StringBuilder s = new StringBuilder("welcome");
        s.append(" to advance java"); // can change original value of s
        System.out.println(s);
    }
}
