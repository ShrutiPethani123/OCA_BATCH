public class StaticBlock{

    static int i=10;

    static{

        System.out.println(i);
    }

    public static void main(String[] args) {
        
        StaticBlock obj = new StaticBlock();
    }
}