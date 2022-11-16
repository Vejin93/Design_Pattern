package structural.bridge;

import structural.bridge.implementation.FancyWindowImpl;
import structural.bridge.implementation.NormalWindowsImpl;
import structural.bridge.specification.FrameWindow;
import structural.bridge.specification.SplashWindow;
import structural.bridge.specification.Window;

public class Test {

    public static void main(String[] args) {

        Window nw1 = new FrameWindow(new NormalWindowsImpl());
        nw1.drawWindow();
        Window nw2 = new FrameWindow(new FancyWindowImpl());
        nw2.drawWindow();

        Window sw1 = new SplashWindow(new NormalWindowsImpl());
        sw1.drawWindow();
        Window sw2 = new SplashWindow(new FancyWindowImpl());
        sw2.drawWindow();
    }
}
