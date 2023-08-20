package clg;
//Method overloading
public class Method {
      int a;
      int b;
      int c;
    static int add(int a,int b){
            return a+b;
    }
    static int add(int a,int b,int c){
            return a+b+c;
    }
    static public void main(String[] args){
           /*Method a = new Method();
           a.add(1,2);
           a.add(2,3,4);*/
           System.out.println(Method.add(1,2));
        System.out.println(Method.add(1,256,5));
    } 
}
