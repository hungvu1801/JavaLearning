public class Main {
    public static void main(String[] args) {
        Employee mike = new Employee("Mike", "01/01/1990", "01/01/2023");
        System.out.println(mike.getAge());
        System.out.println(mike);
        Employee joe = new Employee("Joe", "03/03/1990", "03/03/2023");
        System.out.println(joe);
        SalariedEmployee bill = new SalariedEmployee("Bill", "11/11/1990", "04/04/2021", 35000);
        System.out.println("Bill's paycheck " + bill.collectPay());
        System.out.println(bill);
        bill.retire();
        System.out.println("Bill's pension check = " + bill.collectPay());
    }
}
