package hierarchy.rebellious.after;

import hierarchy.rebellious.PointerManager;

public class DesktopEnvironmentToolkit extends Toolkit {
    // ...

    public void createWindow() {
        // ...
    }

    public PointerManager getPointerManager() {
        // ...

        return new PointerManager();
    }
}
