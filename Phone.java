interface Device{

    public void doIt();
    
}

class Electronics implements Device{

    public void doIt()
    {

    }
}

abstract class Phone1 extends Electronics{

}

abstract class Phone2 extends Electronics{

    void doStuff(){

    }

}
class Phone3 extends Electronics implements Device{
  

}

public class Phone {
    
    public static void main(String[] args) {
        
    }
}
