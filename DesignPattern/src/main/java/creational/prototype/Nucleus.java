package creational.prototype;

public class Nucleus implements Cloneable {
    int size;

    public Nucleus() {
        size = 5;
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
}
