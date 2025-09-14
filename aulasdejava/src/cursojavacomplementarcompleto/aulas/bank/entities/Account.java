package cursojavacomplementarcompleto.aulas.bank.entities;

public class Account {

    // Atributos

    private int accountNumber;
    private String name;
    private double balance;

    // Construtores
    public Account(int accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0;
    }

    // Getters e Setters

    public int getAccountNumber() {
        return accountNumber;
    }

    // Número da conta não deve ter setter, pois é imutável após a criação.

    public double getBalance() {
        return balance;
    }

    // Saldo não deve ter setter, pois deve ser modificado apenas por métodos específicos (depósito, saque).

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos

    public void deposit(double amount){
        this.balance += amount;

    }

    public void withdraw(double amount){
        this.balance -= amount + 5.0; // Taxa de saque de 5.0
    }


    @Override
    public String toString(){
        return "Account "
        + accountNumber
        + ", Holder: "
        + name
        + ", Balance: $ "
        + String.format("%.2f", balance);
    }


}
