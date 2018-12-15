package abstraction.duplicated.before;

import java.awt.*;

public abstract class BaseLoggedScreen {

    protected Color backgroundColor;

    public void changeBackgroundColor(Color color) {
        this.backgroundColor = color;
    }

    public void renderScreen(Color color) {
        // ...

        changeBackgroundColor(color);
        System.out.println("background color is " + color.toString());
    }
}
