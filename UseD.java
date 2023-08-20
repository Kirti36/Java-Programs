package clg;

class UseD extends Exception{

    private static int[] arr = {1,2,3,4,5,6,7};
    private static int[] paisa ={1000,3000,43132,500,3213,141414};
    UseD(){

    } 
    UseD(String s){
        super(s);
    }

    public static void main(String[] args){
        try{

            System.out.println("Starting: ");
              for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + "." + paisa[i]);
            if(paisa[i]<1000){
                UseD me = new UseD("Kam Paisa h bhai kl ana kl");
                throw me;
            }

        }
      
    }
    catch(UseD e){
      //System.out.println(e.toString());
       // e.printStackTrace();
       System.out.println(e.getMessage());
    }
    
}
}