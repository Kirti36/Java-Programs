package clg;

class ConstDemo {
    String name;

// default constructor
    ConstDemo(){
          System.out.println("hello Kirti");
    }
     // constructor overloading and parametrized contructor
    ConstDemo(String n){
            name = n;
    }

    void display(){ System.out.println(name);}
    public static void main(String[] args){
        ConstDemo a = new ConstDemo();
        ConstDemo b = new ConstDemo("Kirti");
        b.display();
    }

}
