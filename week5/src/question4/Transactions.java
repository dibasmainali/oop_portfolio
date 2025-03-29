package question4;

public class Transactions {
    public static void main(String[] args) {
        Account acc1 = new Account("dibas", 11221122, 1000);
        Account acc2 = new Account("Digant",21231321);
        
        acc2.deposit(500);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
