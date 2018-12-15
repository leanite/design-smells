package abstraction.mutifaceted.before;

public class MessageService {

    public void sendMessage(String email, String message) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid e-mail format");
        }

        send(message);
    }

    private void send(String message) {
        // ...
    }
}
