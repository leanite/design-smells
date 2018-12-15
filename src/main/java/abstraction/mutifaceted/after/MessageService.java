package abstraction.mutifaceted.after;

public class MessageService {

    private EmailValidationService emailValidationService;

    public MessageService(EmailValidationService emailValidationService) {
        this.emailValidationService = emailValidationService;
    }

    public void sendMessage(String email, String message) {
        emailValidationService.validateEmail(email);
        send(message);
    }

    private void send(String message) {
        // ...
    }
}
