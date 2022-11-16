package structural.facade;

public class Computer {
    final int BOOT_ADDRESS = 1024;
    Processor processor = new Processor();
    Memory memory = new Memory();
    Disc disc = new Disc();

    public void start(){
        disc.run();
        memory.loadBootSector(disc.returnBootSector());
        processor.jumpTo(BOOT_ADDRESS,memory);
    }
}
