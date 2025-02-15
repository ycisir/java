package VII_object_oriented_programming;

public class AccountMain {
//    encapsulation
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccount_number(9210);
        acc.setName("Harry");
        acc.setAmount(5_000);

        System.out.println(acc.getAccount_number());
        System.out.println(acc.getName());
        System.out.println(acc.getAmount());
    }
}
