abstract class base1{
    public base1(){
        System.out.println("Base");
    }
    abstract public void phone();
}

class derived1 extends base1{
    @Override
    public void phone() {
        System.out.println("derived1.phone");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        base1 b1 = new derived1();
        b1.phone();
    }
}
