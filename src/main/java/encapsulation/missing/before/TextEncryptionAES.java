package encapsulation.missing.before;

public class TextEncryptionAES extends TextEncryption {

    @Override
    public void encrypt(String source) {
        System.out.println("Encrypted with AES algorithm");
    }

    @Override
    public String decrypt(String source) {
        System.out.println("Decrypted with AES algorithm");
        return source;
    }
}
