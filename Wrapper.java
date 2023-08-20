package clg;
public class Wrapper{
    public static void main(String[] args){
        int num = 90;
        // old way of boxing --> Integer num1= new Integer(num);
        //new way of boxing --> 
        Integer num1= num;
        System.out.println(num1); //boxing
        int num2 = num1.intValue();
        System.out.println(num2);//unboxing

        String s="234";
        int n = Integer.parseInt(s);
        System.out.println(n);
    }
}