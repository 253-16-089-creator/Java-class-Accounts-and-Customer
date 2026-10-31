package bd.edu.diu;

import java.time.LocalDateTime;

public class Transaction {
    private static int counter = 1;

    private int id;
    private String type;
    private double amount;
    private double balanceAfter;
    private LocalDateTime date;

    public Transaction() {
        this.id = counter++;
        this.date = LocalDateTime.now();
    }

    public Transaction(String type, double amount, double balanceAfter) {
        this();
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void showTransaction() {
        System.out.println(" Txn ID       : " + id);
        System.out.println(" Type         : " + type);
        System.out.println(" Amount       : " + amount);
        System.out.println(" Balance After: " + balanceAfter);
        System.out.println(" Date         : " + date);
        System.out.println("----------------------------------");
    }
}
