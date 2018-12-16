package modularization.cyclicallydependent.after;

public class EncryptionDES implements Encryption {

    // ...

    @Override
    public SecureDocument encrypt(SecureDocument document) {
        // ...

        return new SecureDocument();
    }
}