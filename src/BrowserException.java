/**
 * Created by rhondusmithwick on 2/4/16.
 *
 * @author Rhondu Smithwick
 */
public class BrowserException extends RuntimeException {
    public BrowserException() {
    }

    public BrowserException(String message, Throwable cause) {
        super(message, cause);
    }

    public BrowserException(String message) {
        super(message);
    }

    public BrowserException(Throwable cause) {
        super(cause);
    }

    public BrowserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
