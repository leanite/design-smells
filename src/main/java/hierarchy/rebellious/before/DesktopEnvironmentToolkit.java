package hierarchy.rebellious.before;

import hierarchy.rebellious.PointerManager;

public class DesktopEnvironmentToolkit extends Toolkit {
    @Override
    public void createWindow() {
        // ...
    }

    @Override
    public PointerManager getPointerManager() {
        // ...

        return new PointerManager();
    }
}
