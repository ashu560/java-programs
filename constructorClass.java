
class phone{
    int value;
    public phone(){
        System.out.println("Default Constructor...");
    }
    phone(int v){
        this.value = v;
    }
    public void greet(){
        System.out.println("This is greet...");
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class smartphone extends phone{
    public void phonee(){
        System.out.println("Extended again.");
    }
}


public class constructorClass {
    public static void main(String[] args) {

        phone ph = new phone();
        smartphone sm = new smartphone();

        ph.greet();
        sm.phonee();
    }
}
