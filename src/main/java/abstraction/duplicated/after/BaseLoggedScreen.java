package abstraction.duplicated.after;

import java.awt.*;

public abstract class BaseLoggedScreen extends BaseScreen {

    @Override
    public void renderScreen(Color color) {
        super.renderScreen(color);
        System.out.println("background color is " + color.toString());
    }
}
