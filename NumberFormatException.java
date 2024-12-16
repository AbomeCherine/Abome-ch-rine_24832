public class NumberFormatException {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc"); // Invalid format
        } catch (java.lang.NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
