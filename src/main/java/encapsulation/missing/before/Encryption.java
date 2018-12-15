package encapsulation.missing.before;

public interface Encryption<T> {
    void encrypt(T source);
    T decrypt(T source);
}
