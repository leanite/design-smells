package modularization.cyclicallydependent.after;

public class SecureDocument {

    private Encryption encryption;

    // ...

    public void encrypt() {
        // ...
        encryption.encrypt(this);
    }
}
