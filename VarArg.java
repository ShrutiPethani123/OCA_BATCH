class Parent{

    void print(int... i)
    {
        System.out.println("Parent class...");
    }
}

class Child extends Parent{

    void print(int i)
    {
        System.out.println("Child class...");
    }

}


public class VarArg {

    public static void main(String[] args) {
        
        Parent p1 = new Parent();
        p1.print(1,2,3,5);
        Child c1 = new Child();
        c1.print(1);
        c1.print(3,1,3,5);

        Parent p2 = new Child();
        p2.print(2); 
        p2.print(3,4,6);
    }
}
