package creational.prototype;

public class CellFactory {

    private Cell original;

    public CellFactory(){
        original = new Cell();
        System.out.println("Original: " + original);
    }

    public Cell createCellShallow(){
        return (Cell)original.clone();
    }

    public Cell createCellDeep(){
        return original.deepClone();
    }

    public void changeSizeNucleus(int size){
        original.nucleus.size = size;
    }

    public Cell getOriginal(){
        return original;
    }
}
