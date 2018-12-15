package abstraction.mutifaceted.after;

public class EmailValidationService {

    public void validateEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid e-mail format");
        }
    }
}
