package structural.adapter;

public class Computer {
    USBKeyboard keyboard;

    public void testKeyboards() {
        System.out.println(keyboard.returnButton());
    }
}
