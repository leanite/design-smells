package encapsulation.missing.before;

public class TextEncryptionDES extends TextEncryption {

    @Override
    public void encrypt(String source) {
        System.out.println("Encrypted with DES algorithm");
    }

    @Override
    public String decrypt(String source) {
        System.out.println("Decrypted with DES algorithm");
        return source;
    }
}
