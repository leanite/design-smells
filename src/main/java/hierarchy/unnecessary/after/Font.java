package hierarchy.unnecessary.after;

public enum Font {
    ARIAL("Arial"),
    CALIBRI("Calibri"),
    TAHOMA("Tahoma");

    private String name;

    Font(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
