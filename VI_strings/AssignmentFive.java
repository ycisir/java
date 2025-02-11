package VI_strings;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        q1: check string is palindrome or not
        System.out.println("enter the string: ");
        String s = sc.next();
        String rev = "";

        for (int i = s.length()-1; i >= 0 ; i--) {
            rev += s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }




//        q2: remove junck or special characters in string
//        String s = "jack@email.com";
//        String tmp[] = s.split("@");
//        String user_name = tmp[0];
//        System.out.println(Arrays.toString(tmp));
//        System.out.println(user_name);
//
//        String amount = "$19,12,000";
//        System.out.println(amount.replace("$","").replace(",",""));




//        q3: remove white spaces in string
//        String s = "    s     tr       i      ng";
//        System.out.println(s.trim());
//        System.out.println(s.replace(" ",""));




//        q4: count occurences of a character in a string
//        String s = "aabcddaccaabbaa";
//        char[] ch = s.toCharArray();
//        boolean[] b = new boolean[s.length()];
//
//        System.out.print("Character Occurrences ===> ");
//        for (int i = 0; i < ch.length; i++) {
//            if (b[i]) continue;     // Skip already counted characters
//            int count = 1;
//            for (int j = i + 1; j < ch.length; j++) {
//                if (ch[i] == ch[j]) {
//                    count++;
//                    b[j] = true;     // Mark character as counted
//                }
//            }
//            System.out.print(ch[i] + ": " + count +", ");
//        }




//        q5: count words in a string
//        String s = "Hello world";
//        String arr[] = s.split(" ");
//        int count = 0;
//        for (String val: arr) {
//            count++;
//        }
//        System.out.println(count);
    }
}
