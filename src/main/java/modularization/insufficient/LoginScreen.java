package modularization.insufficient;

public class LoginScreen extends Screen{

    private User loggedUser = null;
    private View usernameInput;
    private View passwordInput;
    private View okButton;
    private View registerButton;
    private View forgotPasswordButton;

    public void init() {
        initViews();
    }

    private void initViews() {
        usernameInput = new View();
        passwordInput = new View();

        okButton = new View();
        okButton.setOnClickListener(() -> {
            if (usernameInput.getText() != null && passwordInput.getText() != null) {
                login(usernameInput.getText(), passwordInput.getText());
            }
        });

        registerButton = new View();
        registerButton.setOnClickListener(() -> {
            changeScreen(new RegisterScreen());
        });

        forgotPasswordButton = new View();
        forgotPasswordButton.setOnClickListener(() -> {
            if (usernameInput.getText() != null) {
                requestNewPassword(usernameInput.getText());
            }
        });
    }

    private void login(String username, String password) {
        User user = requestLogin(username, password);

        if (user != null) {
            loggedUser = user;
        }

        changeScreen(new MainScreen(loggedUser));
    }

    private User requestLogin(String username, String password) {
        // ...
        return new User();
    }

    private void requestNewPassword(String text) {
        // ...
    }
}
