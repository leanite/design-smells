package encapsulation.missing.after;

public class TextEncryption extends Encryption<String> {

    public TextEncryption(EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void encrypt(String source) {
        byte[] data = source.getBytes();
        algorithm.encrypt(data);
    }

    @Override
    public String decrypt(String source) {
        byte[] encodedData = source.getBytes();
        byte[] decodedData = algorithm.decrypt(encodedData);

        return new String(decodedData);
    }
}
