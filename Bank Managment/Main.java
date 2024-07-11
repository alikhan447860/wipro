public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S12345", 1000.0, 3.0);
        CheckingAccount checking = new CheckingAccount("C12345", 500.0, 200.0);

        System.out.println("Savings Account:");
        savings.deposit(200);
        savings.withdraw(100);
        savings.addInterest();
        savings.displayBalance();

        System.out.println("\nChecking Account:");
        checking.deposit(300);
        checking.withdraw(600);
        checking.displayBalance();
    }
}
