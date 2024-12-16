public class NullPointerException  {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // Accessing a null reference
        } catch (java.lang.NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
