package modularization.insufficient;

public class View {

    private ClickListener clickListener;

    public String getText() {
        // ...

        return "";
    }

    public void setOnClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ClickListener {
        void onClick();
    }
}
