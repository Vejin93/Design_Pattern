package structural.bridge.specification;

import structural.bridge.implementation.WindowsImpl;

public class SplashWindow extends Window {

    public SplashWindow(WindowsImpl impl) {
        this.impl = impl;
    }

    @Override
    public void drawWindow() {
        System.out.println("Splash Window - no title bar.");
        impl.drawSurface();
    }
}
