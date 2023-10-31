import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class DataFormatException extends InputMismatchException {
    public DataFormatException(String message) {
        super(message);
    }
}
