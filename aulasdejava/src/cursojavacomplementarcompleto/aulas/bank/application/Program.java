package cursojavacomplementarcompleto.aulas.bank.application;
import java.util.Scanner;
import java.util.Locale;
import cursojavacomplementarcompleto.aulas.bank.entities.Account;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account;

        // Input data
        System.out.println("Enter account number: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter account holder: ");
        String holder = scan.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = scan.next().charAt(0);

        // Account creation
        if(response == 'y' || response == 'Y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(number, initialDeposit, holder);
        } else {
            account = new Account(number, holder);
        }

        // Account data
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        // Deposit
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scan.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        // Withdraw
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scan.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        scan.close();
    }
}
