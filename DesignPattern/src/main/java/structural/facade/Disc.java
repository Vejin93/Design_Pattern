package structural.facade;

public class Disc {
    public void run(){
        System.out.println("HD: hard disc running.");
    }

    public byte[] returnBootSector(){
        System.out.println("HD: boot sector found and supplied.");
        return new byte[512];
    }
}
