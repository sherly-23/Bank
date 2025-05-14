

import java.time.LocalDate;

public class Transaction {
      String ID;
      String senderName;
      String receiverName;
      double amount;
      String status; 
      LocalDate transactionDate;

    public Transaction(String ID, String senderName, String receiverName, double amount, String status, LocalDate transactionDate) 
    {
        this.ID = ID;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.amount = amount;
        this.status = status;
        this.transactionDate = transactionDate;
    }

    public void displayTransaction() {
        System.out.println("Transaction ID: " + ID);
        System.out.println("Sender Name: " + senderName);
        System.out.println("Receiver Name: " + receiverName);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
        System.out.println("Transaction Date: " + transactionDate);
    }
    public static void main(String[] args) {
       
        Transaction t= new Transaction("1A","abc","xyz",5000,"Success",LocalDate.now());
        t.displayTransaction();

    }
}