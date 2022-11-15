package creational.singleton;

public class Test {

    public static void main (String[] args){
        Singleton s1 = Singleton.getInstance();
        s1.hello();

        Singleton s2 = Singleton.getInstance();
        s2.hello();

        System.out.println(s1==s2);
    }
}
