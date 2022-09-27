/*

    static --> variable , method,class , block

    --> for static variable all objects refer same memory location 
    --> for static method we not need to create object.
    --> we can't use non static variable in static method. 
    --> we can't make outer class as static but we can make inner class as static
    

 */

class Test{

    static class JAVA{

    }

    int x; // instance
    static int y; 

    Test()
    {
       System.out.println(y++); 

    }

    static void disp()
    {
        // System.out.println(x);
        System.out.println(y);
        System.out.println("Java");
    }

    {
       System.out.println("Instance block"); 
    }

    static {
        System.out.println("static block");
    }
}

public class Static {
    
    
    public static void main(String[] args) {
        
        Test t1=new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        // System.out.println(t1.y);

        Test.disp();


    }



}
