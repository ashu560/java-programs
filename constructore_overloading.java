class base{
    base(){
        System.out.println("Base default");
    }
    base(int x){
        System.out.println("Base parameter : "+ x);
    }
}

class derived extends base{
    derived(){
        System.out.println("Derived default");
    }
    derived(int x, int y){
        super(x);
        System.out.println("Derived Paramter "+y);
    }
}

class derivedAgain extends derived{
    derivedAgain(){
        System.out.println("DerivedAgain default");
    }
    derivedAgain(int x, int y, int z){
        super(x,y);
        System.out.println("DerivedAgain paramter "+z);
    }
}

public class constructore_overloading {
    public static void main(String[] args) {
//    base b = new base(1);
//    derived d = new derived(1,2);
    derivedAgain da1 = new derivedAgain();
    derivedAgain da = new derivedAgain(1,2,3);
    }
}
