public class CreditCard extends BankCard{
    //Attributes are declared as private to not acces from other package//
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    public CreditCard(int cardId,String clientName,String issuerBank,String bankAccount,int balanceAmount,int cvcNumber,double interestRate,String expirationDate){
        //constructor passes the parameters as well as it call parameter from the parent class//
        super(balanceAmount,cardId,bankAccount,issuerBank);
        setclientName(clientName);
        this.cvcNumber=cvcNumber;
        this.interestRate=interestRate;
        this.expirationDate=expirationDate;
        this.isGranted=false;
    }
    //accessor method//
    public int cvcNumber(){
        return this.cvcNumber;
    }
    public double creditLimit(){
        return this.creditLimit;
    }
    public double interestRate(){
        return this.interestRate;
    }
    public String expirationDate(){
        return this.expirationDate;
    }
    public double gracePeriod(){
        return this.gracePeriod;
    }public boolean isGranted(){
        return this.isGranted;
    }
    //this method passes the parameter as well as it shows condition//
    public void setcreditLimit(double creditLimit, int gracePeriod){
        
        this.creditLimit=creditLimit;
        if(creditLimit <= (2.5* super.getbalanceAmount())){
            System.out.println("Credit Granted:" + creditLimit);
            this.creditLimit=creditLimit;
            this.gracePeriod=gracePeriod;
            this.isGranted=true;
        }
        else{
            System.out.println("Credit Card not Granted:" + creditLimit);
        }
    }
    //this method used to cancel credit card asigning the value of attributes//
    public void cancelCreditcard(){
        this.cvcNumber=0;
        this.creditLimit=0;
        this.gracePeriod=0;
        this.isGranted=false;
    }
    //this method used to call the method display from parent class and for the print statement//
    public void display(){
        super.display();
        if(isGranted==true){
            
            System.out.println("CVC Number:" + cvcNumber);
            System.out.println("Credit Limit:" + creditLimit);
            System.out.println("Interest Rate:" + interestRate);
            System.out.println("Expiration Date:" + expirationDate);
            System.out.println("Grace Period:" + gracePeriod);
            System.out.println(" Credit Is Granted Successfully:" + isGranted);
        }
        else{
            System.out.println("Credit is not Granted:" + isGranted);
        }
    }
}