package abstraction.duplicated.after;

import java.awt.*;

public abstract class BaseScreen {

    protected Color backgroundColor;

    public void changeBackgroundColor(Color color) {
        this.backgroundColor = color;
    }

    public void renderScreen(Color color) {
        // ...

        changeBackgroundColor(color);
    }
}
