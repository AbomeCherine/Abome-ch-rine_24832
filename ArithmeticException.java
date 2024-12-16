public class ArithmeticException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero
        } catch (java.lang.ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
