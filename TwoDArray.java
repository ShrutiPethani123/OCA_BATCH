public class TwoDArray {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6};

        // for(int x:a)
        // {
        //     System.out.print(x+ " ");
        // }

        int b[][]={{1,2,3},{3,4}};

        for(int x[]:b)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        

       

        
    }
}
