public class Main {

    public static boolean isTrue(String text) {
        return text.equalsIgnoreCase("true") || text.equalsIgnoreCase("yes");
    }

    public static boolean containsTrue(String text) {
        return text.contains("true");
    }

    public static boolean hasThreeLetters(String text) {
        return text.matches("[a-zA-Z]{3}");
    }

    public static boolean noNumberAtBeginning(String text) {
        return !text.matches("^[0-9].*");
    }

    public static boolean containsNotB(String text) {
        return !text.matches(".*b.*");
    }

    public static boolean containsNumberLessThan300(String text) {
        return text.matches(".*\\b(2[0-9]{2}|1\\d{2}|[1-9]\\d?)\\b.*");
    }


}
