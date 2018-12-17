package hierarchy.rebellious.before;

import hierarchy.rebellious.PointerManager;

public class HeadlessToolkit extends Toolkit {
    @Override
    public void createWindow() {
        throw new UnsupportedOperationException("Headless environments do not support displays");
    }

    @Override
    public PointerManager getPointerManager() {
        throw new UnsupportedOperationException("Headless environments do not support pointer devices");
    }
}
