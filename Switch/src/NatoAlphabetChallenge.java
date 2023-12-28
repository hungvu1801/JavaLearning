public class NatoAlphabetChallenge {
    public static void main(String[] arg) {
        System.out.println(getNatoString("A"));
        System.out.println(getNatoString("B"));
        System.out.println(getNatoString("C"));
        System.out.println(getNatoString("D"));
        System.out.println(getNatoString("E"));
    }
    public static String getNatoString(String letter) {
        return switch (letter) {
            case "A" -> "Able";
            case "B" -> "Baker";
            case "C" -> "Charlie";
            case "D" -> "Dog";
            case "E" -> "Easy";
            case "F" -> "Fox";
            case "G" -> "George";
            case "H" -> "How";
            case "I" -> "Item";
            case "J" -> "Jig";
            case "K" -> "King";
            case "L" -> "Love";
            case "M" -> "Mike";
            case "N" -> "Nan";
            case "O" -> "Oboe";
            case "P" -> "Peter";
            case "Q" -> "Queen";
            case "S" -> "Sugar";
            case "T" -> "Tare";
            case "U" -> "Uncle";
            case "V" -> "Victor";
            case "W" -> "William";
            case "X" -> "X-ray";
            case "Y" -> "Yoke";
            case "Z" -> "Zebra";
            default -> "not found";
        };
    }
}
