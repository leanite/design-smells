package encapsulation.missing.after;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileEncryption extends Encryption<File> {

    public FileEncryption(EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void encrypt(File source) {
        try {
            byte[] data = Files.readAllBytes(source.toPath());
            algorithm.encrypt(data);
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found");
        }
    }

    @Override
    public File decrypt(File source) {
        try {
            byte[] encodedData = Files.readAllBytes(source.toPath());
            byte[] decodedData = algorithm.decrypt(encodedData);

            return Files.write(new File("tmp").toPath(), decodedData).toFile();
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found");
        }
    }
}
