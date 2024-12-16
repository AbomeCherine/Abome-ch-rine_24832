public class ClassCastException {
    public static void main(String[] args) {
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Invalid type cast
        } catch (java.lang.ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}
