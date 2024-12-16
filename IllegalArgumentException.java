public class IllegalArgumentException {
    public static void main(String[] args) {
        try {
            Thread.sleep(-1000); // Invalid argument (negative time)
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
        }
    }
}
