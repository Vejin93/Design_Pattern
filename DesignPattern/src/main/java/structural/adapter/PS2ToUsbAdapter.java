package structural.adapter;

public class PS2ToUsbAdapter implements USBKeyboard {
    PS2Keyboard keyboard;

    public PS2ToUsbAdapter(PS2Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public int returnButton() {
        return keyboard.returnButton();
    }
}
