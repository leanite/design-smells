package encapsulation.missing.after;

public class EncryptionAlgorithmAES implements EncryptionAlgorithm {

    @Override
    public void encrypt(byte[] data) {
        System.out.println("Encrypted with AES algorithm");
    }

    @Override
    public byte[] decrypt(byte[] data) {
        System.out.println("Decrypted with AES algorithm");
        return data;
    }
}
