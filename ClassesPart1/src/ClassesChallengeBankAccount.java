public class ClassesChallengeBankAccount {
    public static void main(String[] args) {
        // BankAccount acc1 = new BankAccount();
        // acc1.setAccountBalance(1000000);
        // acc1.setBankNumber(123456);
        // acc1.setCustomerName("Mike");
        // acc1.withdrawBankAccount(100000);
        // acc1.depositBankAccount(20000000);
        // System.out.println(acc1.getAccountBalance());
        // acc1.describeAccount();

        // BankAccount bobsAccount = new BankAccount(
        //     344555, 1000000, 
        //     "Bob Ray", "bob@gmail.com", 
        //     "(+84) 888888");
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.describeAccount();

        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail.com", "0840000");
        timsAccount.describeAccount();
    }   
}
