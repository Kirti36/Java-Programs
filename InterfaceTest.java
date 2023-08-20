package clg;

interface GPI {
 
    // Default method
    default void show()
    {
 
        // Print statement
        System.out.println("Default GPI");
    }
}
 

interface PI1 extends GPI {
}
 

interface PI2 extends GPI {
}
 

public class InterfaceTest implements PI1, PI2 {
 
    
    public static void main(String args[])
    {
 
        InterfaceTest d = new InterfaceTest();
 
        // Now calling the function defined in interface 1
        // from whom Interface 2and 3 are deriving
        d.show();
    }
}
