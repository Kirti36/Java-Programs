package clg;

public class Exp {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            //System.out.println(e.toString());
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
