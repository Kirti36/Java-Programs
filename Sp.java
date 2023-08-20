package clg;

class Sp extends Cricket{

    public static void main(String[] args){
Cricket ab = new Cricket();
ab.set_values("Kirti", "Outdoor");
ab.display();
    }
}
abstract class Sports {
    String Sports_name;
    String Sports_type;

    abstract void set_values(String name, String type);
    
}
class Cricket extends Sports{
  
void set_values(String name, String type){
    this.Sports_name=name;
    this.Sports_type=type;
}

void display(){
    System.out.println("Person: "+ Sports_name+ " "+"Spots type: "+Sports_type);
}

    
    }


