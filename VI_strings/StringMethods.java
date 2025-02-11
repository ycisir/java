package VI_strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "welcome";
//        String s = new String("welcome"); // same as above
//        System.out.println(s);


        // length()
        System.out.println(s.length());


//        concat()
        String s1 = "hello ";
        String s2 = "harry ";
        String s3 = "potter ";

        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.concat(s2+s3));


//        trim()
        s = "                spaces                  ";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.trim().length());


//        charAt()
        s = "welcome";
        System.out.println(s.charAt(1));



//        contains() case sensitive --- return boolean
        System.out.println(s.contains("come"));//true
        System.out.println(s.contains("wel"));//true
        System.out.println(s.contains("Wel"));//false
        System.out.println(s.contains("COME"));//false
        System.out.println(s.contains("wellme"));//false



//        equals(), equalsIgnoreCase()
        s1 = "welcome";
        s2 = "welcome";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Welcome"));
        System.out.println(s1.equalsIgnoreCase("Welcome"));




//        replace() replace single/multiple(sequence)
        s = "Hello from core java";
        System.out.println(s.replace('o','x'));
        System.out.println(s.replace("core","advance"));



//        substring()
        String subs = s.substring(0,5);
        String subs1 = s.substring(16,20);
//        System.out.println(s.charAt(16));
        System.out.println(subs1);


//        split()
        s = "harry@email.com";
        String tmp[] = s.split("@");
        String user_name = tmp[0];
        System.out.println(Arrays.toString(tmp));
        System.out.println(user_name);

        String amount = "$19,12,000";
        System.out.println(amount.replace("$","").replace(",",""));
//        System.out.println(amount.replace('$','').replace(',','')); // empty value is not allowed in single qoutation


        s = "jack,73@gmail.com";
//        cant use as delimeter --- . * %  ^ & ()
        String arr1[] = s.split(",");
        System.out.println(Arrays.toString(arr1));
        String arr2[] = arr1[1].split("@");
        System.out.println(Arrays.toString(arr2));






    }

}
