package concepts.oop.exceptions;

public class CustomException extends RuntimeException {
    public CustomException() {
        super("Number must be between 1 - 10");
    }
}
