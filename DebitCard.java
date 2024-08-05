public class DebitCard extends BankCard{
 //Attributes are declared as private to not acess from other package//
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfwithdrawal;
    private boolean hasWithdrawan;
    public DebitCard(int balanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int pinNumber){
        //constructor passes the parameters as well as it call the parameter of parent class parameter//
        super(balanceAmount,cardId,bankAccount,issuerBank);
        setclientName(clientName);
        this.pinNumber=pinNumber;
        this.hasWithdrawan=false;

}
public void setwithdrawalAmount(int withdrawalAmount){
    this.withdrawalAmount=withdrawalAmount;
}
public int getpinNumber(){
    return this.pinNumber;
}
//accessor method//
public String getdateOfwithdrawal(){
    return this.dateOfwithdrawal;
}
public boolean gethasWithdrawan(){
    return this.hasWithdrawan;
    
}
int balanceAmount=super.getbalanceAmount();
// this method passes the parameter as well as shows condition//
public void Withdraw(int pinNumber,String dateOfwithdrawal,int withdrawalAmount){
    if(pinNumber!=pinNumber){
      System.out.println("Wrong PIN Number");
    }
    else if(withdrawalAmount>balanceAmount){
        System.out.println("Insufficient Balance");
    }
    else{
        hasWithdrawan=true;
        balanceAmount=balanceAmount-withdrawalAmount;
    }
this.withdrawalAmount=withdrawalAmount;
this.dateOfwithdrawal=dateOfwithdrawal;
}
//this method print the statement//
public void display(){
    if(hasWithdrawan=true){
        super.display();
        System.out.println("PIN Number:" + pinNumber);
        System.out.println("Withdrawal Amount:" + withdrawalAmount);
        System.out.println("Date of Withdrawal:" + dateOfwithdrawal);
    }
    else{
        System.out.println("Balance Amount:" + balanceAmount);
    }
}
        
}
