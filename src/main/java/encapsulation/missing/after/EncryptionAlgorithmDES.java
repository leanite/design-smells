package encapsulation.missing.after;

public class EncryptionAlgorithmDES implements EncryptionAlgorithm {

    @Override
    public void encrypt(byte[] data) {
        System.out.println("Encrypted with DES algorithm");
    }

    @Override
    public byte[] decrypt(byte[] data) {
        System.out.println("Decrypted with DES algorithm");
        return data;
    }
}
