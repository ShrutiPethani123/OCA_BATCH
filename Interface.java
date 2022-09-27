/*
 
-> by default methods in interface --> public abstract
variable -> public static final


C
|   extends
C

I 
|   extends
I


C
|   invalid
I


I
|   implements
C

    I   I
      I 

      I     I
         C
 */


interface A{

    void print();
    
}

public  abstract class Interface  implements A{

    // public void print()
    // {

    // }
    public static void main(String[] args) {
        
    }
}
