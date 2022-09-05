class base {
    void say()  {
        System.out.println("base");
    }
}

class derived extends base {
    @Override
    void say()  {
        System.out.println("derived");
    }
}


public class override {
    public static void main(String[] args) {
        base b = new base();
        derived d = new derived();

        b.say();
        d.say();
    }
}
