package creational.prototype;

public class Cell implements Cloneable {

    Nucleus nucleus;

    public Cell() {
        nucleus = new Nucleus();
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new Error("This should not happen.");
        }
    }

    public Cell deepClone() {
        Cell copy = (Cell) clone();
        copy.nucleus = (Nucleus) nucleus.clone();
        return copy;
    }

    @Override
    public String toString(){
        return "Cell with size of nucleus: " + nucleus.size + ", hashcode of nucleus: " + nucleus.hashCode();
    }
}
