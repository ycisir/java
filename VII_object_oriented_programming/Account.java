package VII_object_oriented_programming;

public class Account {

    //class variables
    private int account_number;
    private String name;
    private double amount;


//    dont use same variable name if use then remember to use this

    public int getAccount_number() {
        return account_number;
    }

    //account_number is local variable
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
