package structural.bridge.specification;

import structural.bridge.implementation.WindowsImpl;

public abstract class Window {
    protected WindowsImpl impl;

    public abstract void drawWindow();
}
