package structural.bridge.implementation;

public class FancyWindowImpl extends WindowsImpl {

    @Override
    public void drawSurface() {
        System.out.println("drawRect() - Fancy windows implementation.");
    }

    @Override
    public void drawTitleBar() {
        System.out.println("drawTitleBar() - Fancy window implementation.");
    }
}
