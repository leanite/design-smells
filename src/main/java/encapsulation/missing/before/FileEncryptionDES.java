package encapsulation.missing.before;

import java.io.File;

public class FileEncryptionDES extends FileEncryption {

    @Override
    public void encrypt(File source) {
        System.out.println("Encrypted with DES algorithm");
    }

    @Override
    public File decrypt(File source) {
        System.out.println("Decrypted with DES algorithm");
        return source;
    }
}
