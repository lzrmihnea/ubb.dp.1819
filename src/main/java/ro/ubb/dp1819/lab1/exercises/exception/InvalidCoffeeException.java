package ro.ubb.dp1819.lab1.exercises.exception;

public class InvalidCoffeeException extends RuntimeException {
    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public InvalidCoffeeException(String message) {
        super(message);
    }
}
