package structural.adapter;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        PS2Keyboard ps2Keyboard = new PS2Keyboard();

        computer.keyboard = new PS2ToUsbAdapter(ps2Keyboard);

        computer.testKeyboards();
    }
}
