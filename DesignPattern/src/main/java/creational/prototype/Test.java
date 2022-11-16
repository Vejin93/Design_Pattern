package creational.prototype;

public class Test {

    public static void main(String[] args){
        CellFactory factory = new CellFactory();
        Cell cellShallow = factory.createCellShallow();
        Cell cellDeep = factory.createCellDeep();

        factory.changeSizeNucleus(10);

        System.out.println("Original: " + factory.getOriginal());
        System.out.println("Shallow: " + cellShallow);
        System.out.println("Deep: " + cellDeep);
    }
}
