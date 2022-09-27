/*

    final --> class , method , variable

    -> we can't inherite final class.
    -> we can't override final method.
    -> we can't change value of final Variable.

 */

 class Test{

    int x=56;
    Test(int y)
    {
        x=y;
    }
    // Test()
    // {
    //     x=45;
    // }
    // final void print()
    // {
    //     // x=89;
    // }

 }

public class Final extends Test  {

    Final(int y)
    {
        super(5);
    }

    public static void main(String[] args) {
        Test obj = new Test(8);
        // Test obj1 = new Test();
    }
    
}
