package clg;
public class Inheritance {
	public static void main(String[] args)
	{
		three g = new three();
		g.print_geek();
       
	}
}

class one {
	public void print_geek()
	{
		System.out.println("Geeks");
	}
}

class two extends one {
	public void print_geek() 
    { 
        //super.print_geek();
        System.out.println("for"); 
    }
}

class three extends two {
	public void print_geek()
	{  super.print_geek();
		System.out.println("Freaks");
	}
}



