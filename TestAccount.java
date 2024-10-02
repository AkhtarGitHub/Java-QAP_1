public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts with parameterized constructors
        Account acc1 = new Account("A101", "John", 5000);
        Account acc2 = new Account("A102", "Alice", 4000);

        // Display balance of both accounts
        System.out.println("Account 1 Balance: $" + acc1.getBalance());
        System.out.println("Account 2 Balance: $" + acc2.getBalance());

        // Transfer $1000 from Account 1 to Account 2
        acc1.transferTo(acc2, 1000);

        // Display balance of both accounts after the transfer
        System.out.println("After transferring $1000...");
        System.out.println("Account 1 Balance: $" + acc1.getBalance());
        System.out.println("Account 2 Balance: $" + acc2.getBalance());
    }
}
