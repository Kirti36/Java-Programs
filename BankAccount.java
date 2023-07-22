public class BankAccount {

     public static void main(String []args){
         System.out.println("Create account: ");
         
     }
     

public class Account{
    private String Depositor_name;
    private int Acc_no;
    private String Acc_type;
    private int Balance;

public void Create_acc(String Depositor_name, int Acc_no, String Acc_type){
        this.Depositor_name= Depositor_name;
        this.Acc_no = Acc_no;
        this. Acc_type= Acc_type;
        this.Balance = Balance;
    }

    public void Deposit(double amount) {
        Balance += amount;
    }

    public void withdraw(double amount) {
        if (Balance >= amount) {
            Balance -= amount;
        } 
        else {
            System.out.println("Insufficient balance");
      }
    }      
}
}
