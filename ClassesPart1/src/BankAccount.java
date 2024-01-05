public class BankAccount {
    private int bankNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;
    
    // Constructors
    public BankAccount() {
        this(00000, 0, "default", "default", "000");
        System.out.println("Empty contructor called.");
    }
    public BankAccount(int bankNumber, int accountBalance, String customerName, 
                       String email, String phoneNumber) {
        System.out.println("Account contructor with parameters called.");
        this.bankNumber = bankNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public BankAccount(String customerName, String email, String phoneNumber) {
        this(000000, 0, customerName, email, phoneNumber);
    }
    
    public int getBankNumber() {
        return bankNumber;
    }


    public int getAccountBalance() {
        return accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }
    public void setAccountBalance(int accountBalance) {
        if (accountBalance <= 0) return;
        this.accountBalance = accountBalance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdrawBankAccount(int withdrawAmount) {
        if (this.accountBalance == 0) {
            System.out.println("Not sufficent amount.");
        } else if (withdrawAmount > this.accountBalance) {
            System.out.println("Not sufficent amount.");
        } else {
            this.accountBalance -= withdrawAmount;
        }
    }

    public void depositBankAccount(int depositAmount) {
        if (depositAmount <= 0) return;
        this.accountBalance += depositAmount;
    }

    public void describeAccount() {
        System.out.println(
            "Account name: " + customerName + "\n" +
            "Account number: " + bankNumber + "\n" +
            "Account balance: " + accountBalance + "\n");
        }
}
