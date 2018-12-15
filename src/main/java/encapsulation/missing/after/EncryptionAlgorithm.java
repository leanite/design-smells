package encapsulation.missing.after;

public interface EncryptionAlgorithm {
    void encrypt(byte[] data);
    byte[] decrypt(byte[] data);
}
