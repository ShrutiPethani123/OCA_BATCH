class Bird{

    int leg=4;
    void fly()
    {
        System.out.println("Bird can fly");
    }

    void eat()
    {
        System.out.println("Bird can eat!!!");
    }

    static void dance()
    {
        System.out.println("Dance.....");
    }
}

class Peacock extends Bird{

    int leg=5;
    void color()
    {
        System.out.println("Blue-Green-yellow");
    }
    void eat()
    {
        System.out.println("Peacock can eat!!");
    }
    static void dance()
    {
        System.out.println("Dance Peacock...");
    }
}


public class ClassParentChild {
    public static void main(String[] args) {
        
        Bird b = new Bird();
        b.fly();
        // b.color(); // invalid

        Peacock p = new Peacock();
        p.fly();
        p.color();
        p.dance();

        // Peacock p1 = new Bird(); // invlid

        Bird b1 = new Peacock();  // paren ref = child obj
        b1.fly();
        // b1.color(); // invalid
        b1.eat();
        b1.dance();

        System.out.println(b1.leg);
    }
}
