public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(25);
    }
    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int rowNum = 1; rowNum <= number; rowNum++) {
            for (int colNum = 1; colNum <= number; colNum++) {
                if (rowNum == 1 || rowNum == number) {
                    System.out.print("*");
                }
                else if (colNum == 1 || colNum == number) {
                    System.out.print("*");
                }
                else if (rowNum == colNum) {
                    System.out.print("*");
                }
                else if (colNum == (number - rowNum + 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }        
    }
}
