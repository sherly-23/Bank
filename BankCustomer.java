
public class BankCustomer {
    String custName;
     String accNo;
     int custAge;

    public BankCustomer(String custName, String accNo, int custAge) {
        this.custName = custName;
        this.accNo = accNo;
        this.custAge = custAge;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Account Number: " + accNo);
        System.out.println("Customer Age: " + custAge);
    }
    public static void main(String[] args) {
        BankCustomer c = new BankCustomer("xyz", "AS65654898458", 20);
        c.displayDetails();
    }
}
