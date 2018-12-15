package encapsulation.missing.before;

import java.io.File;

public class FileEncryptionAES extends FileEncryption {

    @Override
    public void encrypt(File source) {
        System.out.println("Encrypted with AES algorithm");
    }

    @Override
    public File decrypt(File source) {
        System.out.println("Decrypted with AES algorithm");
        return source;
    }
}
