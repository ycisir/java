package IV_loops;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
//        1: break
//        after break; statement is not valid in the same block
//        for (int i=0; i<=10; i++) {
//            if (i==5)
//                break; // break the entire loop if condition satisfied and dont go further (jump)


//            System.out.println(i);
//        }


//        2: continue
        for (int i=0; i<=10; i++) {
            if (i==5)
                continue; // skip the iteration if condition satisfied
            System.out.println(i);
        }
    }
}
