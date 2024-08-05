
public class BankCard{    
 //Attributes  declared as private to not access from other package //
    private int cardId;      
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;

 public BankCard(int balanceAmount,int cardId,String bankAccount,String issuerBank){
        //Constructor accepts the four parameters and clientName as emptey//
        this.clientName="";
        this.balanceAmount=balanceAmount;
        this.cardId=cardId;
        this.bankAccount=bankAccount;
        this.issuerBank=issuerBank;
        
    }
    
    public void setclientName(String clientName){
        this.clientName=clientName;
    }
    public void setbalanceAmount(int balanceAmount){
        this.balanceAmount=balanceAmount;
    }
    // five accessor method to allow the access the property to sub class//
    public String getclientName(){
        return this.clientName;
    }
    public int getbalanceAmount(){
        return this.balanceAmount;
    }
    public int getcardId(){
        return this.cardId;
    }
    public String getbankAccount(){
        return this.bankAccount;
    }
    public String getissuerBank(){
        return this.issuerBank;
    }
    //display method is made to print the data//
    public void display(){
         System.out.println("cardId:" + cardId);
         System.out.println("issuerBank:" + issuerBank);
         System.out.println("bankAccount:" + bankAccount);
         System.out.println("balanceAmount:" + balanceAmount);
         if (clientName .equals("")){
             System.out.println("clientName: clientName is not assigned please enter clientName");
         }else{
             System.out.println("clientName: " + clientName);
         }
    
        
    }
}
    