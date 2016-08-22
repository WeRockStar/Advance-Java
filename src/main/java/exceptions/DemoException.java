package exceptions;


public class DemoException extends Exception {
    public DemoException() {
        this("default exception");
    }

    public DemoException(String message) {
        super(message);
    }
}
