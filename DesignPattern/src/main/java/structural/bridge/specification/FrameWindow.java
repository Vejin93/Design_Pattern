package structural.bridge.specification;

import structural.bridge.implementation.WindowsImpl;

public class FrameWindow extends Window {

    public FrameWindow(WindowsImpl impl) {
        this.impl = impl;
    }

    @Override
    public void drawWindow() {
        System.out.println("Frame Window with title bar.");
        impl.drawSurface();
        impl.drawTitleBar();
    }
}
