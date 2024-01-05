public class ClassesChallengeCustomer {
    public static void main(String[] args) {
        Customer cus1 = new Customer("A", 50, "A@gmail.com");
        System.out.println("Name: " + cus1.getName() + 
                        "\nCredit Limit: " + cus1.getCreditLimit() +
                        "\nEmail: " + cus1.getEmail());
        Customer cus2 = new Customer();
        System.out.println("Name: " + cus2.getName() + 
                        "\nCredit Limit: " + cus2.getCreditLimit() +
                        "\nEmail: " + cus2.getEmail());

        Customer cus3 = new Customer("B", "B@gmail.com");
        System.out.println("Name: " + cus3.getName() + 
                        "\nCredit Limit: " + cus3.getCreditLimit() +
                        "\nEmail: " + cus3.getEmail());
    }
}
