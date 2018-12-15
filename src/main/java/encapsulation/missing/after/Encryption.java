package encapsulation.missing.after;

public abstract class Encryption<T> {

    protected EncryptionAlgorithm algorithm;

    public Encryption(EncryptionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public abstract void encrypt(T source);
    public abstract T decrypt(T source);
}
