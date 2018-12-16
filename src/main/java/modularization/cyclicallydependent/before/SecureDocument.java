package modularization.cyclicallydependent.before;

public class SecureDocument {

    private EncryptionDES encryption;

    // ...

    public void encrypt() {
        // ...
        encryption.encrypt(this);
    }
}
