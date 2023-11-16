package exceptions;

public class NotInIntervalException extends Exception{
    public NotInIntervalException() {
    }

    public NotInIntervalException(String message) {
        super(message);
    }
}
