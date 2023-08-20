package clg;

public class Singleton {
    public static void main(String[] args){
        AB ab = AB.getInstance();
        AB ch = AB.getInstance();
    }
}

class AB{
    static AB instance = new AB();
    private AB(){

    }
    public static AB getInstance(){
        return instance;
    }
}
