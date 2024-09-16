package davidegiliberti.epicode_16_9_24.exceptions;

public class NotFoundEx extends RuntimeException {
    public NotFoundEx(long id) {
        super("L'ID " + id + " non è presente");
    }
}
