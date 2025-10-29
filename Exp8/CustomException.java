class MyCustomException extends Exception {
    private String message;
    MyCustomException(String message) {
        this.message = message;
    }
    void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        System.out.println("Twarit, 24csu331");
        try {
            throw new MyCustomException("Something went wrong in the program!");
        } 
        catch (MyCustomException e) {
            e.printMessage();
        }
    }
}




