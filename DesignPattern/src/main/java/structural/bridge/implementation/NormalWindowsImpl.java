package structural.bridge.implementation;

public class NormalWindowsImpl extends WindowsImpl {

    @Override
    public void drawSurface() {
        System.out.println("drawRect() - Normal window implementation.");
    }

    @Override
    public void drawTitleBar() {
        System.out.println("drawTitleBar() - Normal window implementation.");
    }
}
