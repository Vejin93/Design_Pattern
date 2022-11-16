package structural.facade;

public class Processor {
    public void jumpTo(int address, Memory memory){
        System.out.println("PROC: executes the program at the address: " + address);
    }
}
