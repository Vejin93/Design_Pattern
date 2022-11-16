package structural.facade;

public class Test {
    Computer computer;
    public Test(){
        computer = new Computer();
        computer.start();
    }

    public static void main(String[] args){
        new Test();
    }
}
