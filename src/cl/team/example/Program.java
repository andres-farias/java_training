package cl.team.example;

/**
 * @author Andrés Farías (a.farias@globant.com)
 */
public class Program {
    public static void main(String[] args) {
        Derived d = new DeriDerived();
    }
}

class Base {
    public Base() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public Derived() {
        System.out.println("Derived");
    }
}

class DeriDerived extends Derived {
    public DeriDerived() {
        System.out.println("DeriDerived");
    }
}
