package OOP_ENCAPSULATION;

public class Account {
    private int acc_no;
    private String holder_name;
    private double balance;

    public void Set_account(int a,String n,double b)
    {
        acc_no=a;
        holder_name=n;
        balance=b;

    }
    public void Show_account()
    {
        System.out.println("Account number="+acc_no);
        System.out.println("Holder name"+holder_name);
        System.out.println("Account balance"+ balance);
    }
    public void withdraw(double w)
    {
        if(w>0 && w<=balance) {
            balance = balance - w;
            System.out.println("after withdraw new balance is" + balance);
        }
        else{

        }
    }
    public void deposit(double d)
    {
        if(d<0){
            System.out.println("amount should be positive");
        }

balance=balance+d;
        System.out.println("after deposit"+balance);
    }

}
