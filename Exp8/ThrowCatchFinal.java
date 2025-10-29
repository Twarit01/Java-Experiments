public class ThrowCatchFinal {
    public static void main(String[] args) {
        System.out.println("Twarit, 24csu331");
        try {
            throw new Exception("This is a test exception message!");
        } 
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed — we were here!");
        }
    }
}



