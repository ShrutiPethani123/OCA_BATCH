/*

abstract -> class , method

-> we can't create constructor of abstract class.
-> abstract method do not have body.
-> we can't write abstract method in non abstract class.
-> we can write both abstract and non abstract method in abstarct class.
-> we need to override abstract method.

 */

abstract class Test{

    // abstract int x;
    // final abstract int display()
    // {

    // }
    abstract void dip();
    void print()
    {

    }
    
 }


public class Abstract extends Test {

   void dip()
    {

    }

    public static void main(String[] args) {
        
        // Test t1 = new Test();
    }
    
}
