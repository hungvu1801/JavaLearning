public class Main {
    public static void main(String[] args) throws Exception {
        String bulletIt = "Print a Bulleted List:\n" +
            "\t\u2022 First Point\n" +
            "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);
        String textBlock = """
            Print a Bulleted List:
                \u2022 First Point
                    \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d.%n", age);

        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %d,%nBirth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);
        for (int i = 1; i <= 100000; i*=10) {
            // System.out.printf("Printing %d%n", i);
            System.out.printf("Printing %6d%n", i); // the number fills up 6 spaces
        }

        String formattedString =  String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
