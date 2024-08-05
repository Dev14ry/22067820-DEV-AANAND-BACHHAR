// importing packages
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;  
public class BankGUI implements ActionListener {
    // Attributes are declared as private to not acccess from the other class and package
    private JFrame Frame1;
    private JPanel Panel1;
    private JLabel bankCardTitle,cardIdLabel,clientNameLabel,issuerBankLabel,bankAccountLabel,balanceAmountLabel,debitCardTitle,pinNumberLabel,withdrawalAmountLabel,withdrawDateLabel,creditCardTitle,cvcNumberLabel,interestRateLabel,expirationDateLabel,creditLimitLabel,gracePeriodLabel;
    private JTextField cardIdTextField,clientNameTextField,issuerBankTextField,bankAccountTextField,balanceAmountTextField,pinNumberTextField,withdrawalAmountTextField,cvcNumberTextField,interestRateTextField,creditLimitTextField,gracePeriodTextField;
    private JButton addDebitbtn1,withdrawbtn2,addCreditbtn3,cancelCreditbtn4,setCreditLimitbtn5,displaybtn6,clearbtn7,displaybtn8;
    private JComboBox<String> withdrawalDate1ComboBox,withdrawalDate2ComboBox,withdrawalDate3ComboBox,expirationDate1ComboBox,expirationDate2ComboBox,expirationDate3ComboBox;
    
    
    private ArrayList<BankCard> BankCardArraylist = new ArrayList <BankCard>();
    // constructor is made of class BankGUI which components are made inside the constructor.
    public BankGUI(){
        // Class BankGUI Frame is made
        Frame1 = new JFrame("Bank GUI");
        
        // JPanel is constructed with their setBounds
        Panel1 = new JPanel();
        Panel1.setBackground(new Color(58,135,162));
    
        bankCardTitle = new JLabel("Bank Card System");
        bankCardTitle.setBounds(585,0,150,45);
        bankCardTitle.setFont(new Font("Default",Font.BOLD,15));
    
        cardIdLabel = new JLabel("Card ID");
        cardIdLabel.setBounds(120,64,54,38);
    
        clientNameLabel = new JLabel("Client Name");
        clientNameLabel.setBounds(109,124,76,38);
    
        issuerBankLabel = new JLabel("Issuer Bank");
        issuerBankLabel.setBounds(109,184,76,38);
    
        bankAccountLabel = new JLabel("Bank Account");
        bankAccountLabel.setBounds(795,58,95,38);
    
        balanceAmountLabel = new JLabel("Balance Amount");
        balanceAmountLabel.setBounds(795,122,106,38);
    
        debitCardTitle = new JLabel("Debit Card");
        debitCardTitle.setBounds(278,272,83,45);
        debitCardTitle.setFont(new Font("Default",Font.BOLD,15));
    
        pinNumberLabel = new JLabel("PIN Number");
        pinNumberLabel.setBounds(109,335,76,38);
    
        withdrawalAmountLabel = new JLabel("Withdrawal Amount");
        withdrawalAmountLabel.setBounds(109,407,127,38);
    
        withdrawDateLabel = new JLabel("Withdraw Date");
        withdrawDateLabel.setBounds(109,479,94,38);
    
        creditCardTitle = new JLabel("Credit Card");
        creditCardTitle.setBounds(860,266,88,45);
        creditCardTitle.setFont(new Font("Default",Font.BOLD,15));
    
        cvcNumberLabel = new JLabel("CVC Number");
        cvcNumberLabel.setBounds(588,341,92,38);
    
        interestRateLabel = new JLabel("Interest Rate");
        interestRateLabel.setBounds(588,407,92,38);
    
        expirationDateLabel = new JLabel("Expiration Date");
        expirationDateLabel.setBounds(588,473,106,38);
    
        creditLimitLabel = new JLabel("Credit Limit");
        creditLimitLabel.setBounds(920,341,92,38);
    
        gracePeriodLabel = new JLabel("Grace Period");
        gracePeriodLabel.setBounds(920,407,92,38);
        
        //TextField is constructed with their setbounds and background color
        cardIdTextField = new JTextField();
        cardIdTextField.setBounds(252,70,258,32);
        cardIdTextField.setBackground(Color.decode("#d9d9d9"));
    
        clientNameTextField = new JTextField();
        clientNameTextField.setBounds(253,130,257,32);
        clientNameTextField.setBackground(Color.decode("#d9d9d9"));
    
        issuerBankTextField = new JTextField();
        issuerBankTextField.setBounds(253,190,257,32);
        issuerBankTextField.setBackground(Color.decode("#d9d9d9"));
    
        bankAccountTextField = new JTextField();
        bankAccountTextField.setBounds(952,58,258,32);
        bankAccountTextField.setBackground(Color.decode("#d9d9d9"));
    
        balanceAmountTextField = new JTextField();
        balanceAmountTextField.setBounds(952,122,258,32);
        balanceAmountTextField.setBackground(Color.decode("#d9d9d9"));
    
        pinNumberTextField = new JTextField();
        pinNumberTextField.setBounds(253,341,257,32);
        pinNumberTextField.setBackground(Color.decode("#d9d9d9"));
    
        withdrawalAmountTextField = new JTextField();
        withdrawalAmountTextField.setBounds(253,413,257,32);
        withdrawalAmountTextField.setBackground(Color.decode("#d9d9d9"));
    
        cvcNumberTextField = new JTextField();
        cvcNumberTextField.setBounds(710,347,180,32);
        cvcNumberTextField.setBackground(Color.decode("#d9d9d9"));
    
        interestRateTextField = new JTextField();
        interestRateTextField.setBounds(710,413,180,32);
        interestRateTextField.setBackground(Color.decode("#d9d9d9"));
    
        creditLimitTextField = new JTextField();
        creditLimitTextField.setBounds(1027,341,183,32);
        creditLimitTextField.setBackground(Color.decode("#d9d9d9"));
    
        gracePeriodTextField = new JTextField();
        gracePeriodTextField.setBounds(1027,413,183,32);
        gracePeriodTextField.setBackground(Color.decode("#d9d9d9"));
        
        // button is constructed for DebitCard with their setBounds, background color and action listener of button
        addDebitbtn1 = new JButton("Add DebitCard");
        addDebitbtn1.setBounds(252,571,120,47);
        addDebitbtn1.setBackground(Color.decode("#f4eb49"));
        addDebitbtn1.addActionListener(this);
    
        withdrawbtn2 = new JButton("Withdraw");
        withdrawbtn2.setBounds(390,571,120,47);
        withdrawbtn2.setBackground(Color.decode("#72bb53"));
        withdrawbtn2.addActionListener(this);
        
        displaybtn6 = new JButton("Display");
        displaybtn6.setBounds(110,570,120,47);
        displaybtn6.setBackground(Color.decode("#00c8f8"));
        displaybtn6.addActionListener(this);
        
        // Button is constructed for CreditCard with their setBounds, background color and actionlistener
        addCreditbtn3 = new JButton("Add CreditCard");
        addCreditbtn3.setBounds(590,571,134,47);
        addCreditbtn3.setBackground(Color.decode("#fefb64"));
        addCreditbtn3.addActionListener(this);
    
        cancelCreditbtn4 = new JButton("Cancel Credit");
        cancelCreditbtn4.setBounds(926,571,120,47);
        cancelCreditbtn4.setBackground(Color.decode("#ffa382"));
        cancelCreditbtn4.addActionListener(this);
    
        setCreditLimitbtn5 = new JButton("Set Credit Limit");
        setCreditLimitbtn5.setBounds(762,571,135,47);
        setCreditLimitbtn5.setBackground(Color.decode("#75a9f9"));
        setCreditLimitbtn5.addActionListener(this);
    
        clearbtn7 = new JButton("Clear");
        clearbtn7.setBounds(1090,571,120,47);
        clearbtn7.setBackground(Color.decode("#e692f8"));
        clearbtn7.addActionListener(this);
    
        displaybtn8 = new JButton("Display");
        displaybtn8.setBounds(1090,499,120,47);
        displaybtn8.setBackground(Color.decode("#4dd7fa"));
        displaybtn8.addActionListener(this);
        
        // ComboBox is constructed for the DebitCard with their setBounds
        String date1 [] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        withdrawalDate1ComboBox = new JComboBox<String>(date1);
        withdrawalDate1ComboBox.setBounds(253,473,77,41);
    
        String date2 [] = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        withdrawalDate2ComboBox = new JComboBox<String>(date2);
        withdrawalDate2ComboBox.setBounds(343,473,77,41);
    
        String date3 [] = {"2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        withdrawalDate3ComboBox = new JComboBox<String>(date3);
        withdrawalDate3ComboBox.setBounds(433,473,77,41);
        
        // ComboBox is constructed for the CreditCard with their setBounds
        String date4 [] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        expirationDate1ComboBox = new JComboBox<String>(date4);
        expirationDate1ComboBox.setBounds(710,473,77,41);
    
        String date5 [] = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        expirationDate2ComboBox = new JComboBox<String>(date5);
        expirationDate2ComboBox.setBounds(813,473,77,41);
    
        String date6 [] = {"2022","2023","2024","2025","2026","2027","2028","2029","2030","2031","2032","2033","2034","2035"};
        expirationDate3ComboBox = new JComboBox<String>(date6);
        expirationDate3ComboBox.setBounds(916,473,77,41);
        
        // JLabel  of DebitCard and CreditCard is added to the JPanel
        Panel1.add(bankCardTitle);
        Panel1.add(cardIdLabel);
        Panel1.add(clientNameLabel);
        Panel1.add(issuerBankLabel);
        Panel1.add(bankAccountLabel);
        Panel1.add(balanceAmountLabel);
        Panel1.add(debitCardTitle);
        Panel1.add(pinNumberLabel);
        Panel1.add(withdrawalAmountLabel);
        Panel1.add(withdrawDateLabel);
        Panel1.add(creditCardTitle);
        Panel1.add(cvcNumberLabel);
        Panel1.add(interestRateLabel);
        Panel1.add(expirationDateLabel);
        Panel1.add(creditLimitLabel);
        Panel1.add(gracePeriodLabel);
        
        //JTextfield  of DebitCard and CreditCard is added to the JPanel
        Panel1.add(cardIdTextField);
        Panel1.add(clientNameTextField);
        Panel1.add(issuerBankTextField);
        Panel1.add(bankAccountTextField);
        Panel1.add(balanceAmountTextField);
        Panel1.add(pinNumberTextField);
        Panel1.add(withdrawalAmountTextField);
        Panel1.add(cvcNumberTextField);
        Panel1.add(interestRateTextField);
        Panel1.add(creditLimitTextField);
        Panel1.add(gracePeriodTextField);
        
        // JButton of DebitCard and CreditCard is added to the JPanel
        Panel1.add(addDebitbtn1);
        Panel1.add(withdrawbtn2);
        Panel1.add(addCreditbtn3);
        Panel1.add(cancelCreditbtn4);
        Panel1.add(setCreditLimitbtn5);
        Panel1.add(displaybtn6);
        Panel1.add(clearbtn7);
        Panel1.add(displaybtn8);
        
        // ComboBox of DebitCard and CreditCard is added to the JPanel
        Panel1.add(withdrawalDate1ComboBox);
        Panel1.add(withdrawalDate2ComboBox);
        Panel1.add(withdrawalDate3ComboBox);
        Panel1.add(expirationDate1ComboBox);
        Panel1.add(expirationDate2ComboBox);
        Panel1.add(expirationDate3ComboBox);
        
        //JPanel SetLayout,setSize and added to the JFrame
        Panel1.setLayout(null);
        Panel1.setSize(1300,660);
        Frame1.add(Panel1);
        
        // JFrame setLayout,setSize,setvisible 
        Frame1.setLayout(null);
        Frame1.setSize(1300,660);
        Frame1.setVisible(true);
        Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Frame1.setResizable(false);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent a){
        // Event handling is performed for the Add Debit Button
        if(a.getSource() == addDebitbtn1){
            // checks for the text field empty found with suitable message
            if(cardIdTextField.getText().isEmpty() || bankAccountTextField.getText().isEmpty() || issuerBankTextField.getText().isEmpty() || clientNameTextField.getText().isEmpty() || balanceAmountTextField.getText().isEmpty() || pinNumberTextField.getText().isEmpty()){
        JOptionPane.showMessageDialog(Frame1,"Please Fill the Empty Field for DebitCard","Alert",JOptionPane.WARNING_MESSAGE);
        return;
        }
            // checks for the exception handling for the Number Format
            try{
                // takes the variable with conversion string into integer
                int CardId = Integer.parseInt(cardIdTextField.getText());
                int balanceAmount = Integer.parseInt(balanceAmountTextField.getText());
                int pinNumber = Integer.parseInt(pinNumberTextField.getText());
                String clientName = clientNameTextField.getText();
                String bankAccount = bankAccountTextField.getText();
                String issuerBank = issuerBankTextField.getText(); 
                // boolean varaible is taken as false
                boolean cardIdExists_check = false;
                //for each loop is executed for the Bankcard arraylist
                for(BankCard card_number : BankCardArraylist){
                     // checks the card id is exist in the arraylist or not 
                    if(card_number.getcardId() == CardId){
                        JOptionPane.showMessageDialog(Frame1,"This CardID is Already Exists","Alert",JOptionPane.WARNING_MESSAGE);
                        cardIdExists_check = true;
                        return;
                    }
                }
                    // checks the variable is false then object is add in the bankcard arraylist with suitable messagge
                    if(!cardIdExists_check){
                        DebitCard debitCard_obj = new DebitCard(balanceAmount,CardId,bankAccount,issuerBank,clientName,pinNumber);   
                        BankCardArraylist.add(debitCard_obj);
                        JOptionPane.showMessageDialog(Frame1,"Debit Card Added Successfully!","Information",JOptionPane.INFORMATION_MESSAGE);
                    }
    
            }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(Frame1,"Enter Applicable Format value","Error",JOptionPane.WARNING_MESSAGE);
                }
        } 
        // event handling for the withdrawa button of Debit Card
        else if(a.getSource() == withdrawbtn2){
            // checks for the text field empty found with suitable message
            if(cardIdTextField.getText().isEmpty() || withdrawalAmountTextField.getText().isEmpty() || withdrawalDate1ComboBox.getSelectedItem().toString().isEmpty() || withdrawalDate2ComboBox.getSelectedItem().toString().isEmpty() || withdrawalDate3ComboBox.getSelectedItem().toString().isEmpty() || pinNumberTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(Frame1,"Fill the Required Information for Withdraw","Alert",JOptionPane.WARNING_MESSAGE);
            return;
            }
                // checks for the exception handling for the Number Format
                try{
                    // takes the variable with conversion string into integer
                    int CardId = Integer.parseInt(cardIdTextField.getText());
                    int balanceAmount = Integer.parseInt(balanceAmountTextField.getText());
                    int pinNumber = Integer.parseInt(pinNumberTextField.getText());
                    int withdrawalAmount = Integer.parseInt(withdrawalAmountTextField.getText());
                    String dateOfwithdrawal = withdrawalDate1ComboBox.getSelectedItem().toString() + withdrawalDate2ComboBox.getSelectedItem().toString() + withdrawalDate3ComboBox.getSelectedItem().toString();
                    //for each loop is executed for the Bankcard arraylist
                    for(BankCard card_number : BankCardArraylist){
                        // Downcasting from debitcard to bankcard to call the method of child class DebitCard
                        if(card_number instanceof  DebitCard){
                          DebitCard debit_card = (DebitCard) card_number;
                          // checks the card id is exist in the Debit Card or not . If not then it further checks inside otherwise it shows error message
                          if(debit_card.getcardId() == CardId){
                              // checks the pin number is exist in the Debit card or not. If not then it further checks inside otherwise it shows error messsage
                              if(debit_card.getpinNumber() == pinNumber){
                                  // checks the balanceamount is greater than equal to withdrawal amount or not. If not it show error message other wise it shows success message
                                  if( debit_card.getbalanceAmount() >= withdrawalAmount){
                                      // calling the Debit Card Method 
                                      debit_card.Withdraw(pinNumber,dateOfwithdrawal,withdrawalAmount);
                                      JOptionPane.showMessageDialog(Frame1," Amount Withdraw Succesfully!","Information",JOptionPane.INFORMATION_MESSAGE);
                                  }
                                      else{
                                          JOptionPane.showMessageDialog(Frame1,"Insufficent Balance!","Alert",JOptionPane.WARNING_MESSAGE);
                                  
                                      }
                              } 
                                  else{
                                      JOptionPane.showMessageDialog(Frame1,"Please Enter Valid PIN Number!","Alert",JOptionPane.WARNING_MESSAGE);
                                  }
                          }
                              else{
                                  JOptionPane.showMessageDialog(Frame1,"Please Enter Valid Card ID!","Alert",JOptionPane.WARNING_MESSAGE);
                              }
                        } 
                  }
                }
                    catch(NumberFormatException e) {
                        JOptionPane.showMessageDialog(Frame1,"Please Enter Applicable Format value","Error",JOptionPane.WARNING_MESSAGE);
                    }
        }
        // Event handling for the display button for the Debit Card
        else if(a.getSource() == displaybtn6){
            // checks the bankcard arraylist is empty or not . If empty then it shows the message to add debit card object first 
            if(BankCardArraylist.isEmpty() == false){
                // for each loop is executed for the bankcard arraylist 
                for(BankCard card_number : BankCardArraylist){
                    // Down casting from debit card to bankcard to call the method for the childclass
                    if(card_number instanceof DebitCard){
                        // calling the display method of DebitCard to bankcard class
                        ((DebitCard)card_number).display();
                    }
                }
            }
                else{
                    JOptionPane.showMessageDialog(Frame1,"Please First Add the Debit Card","Alert",JOptionPane.WARNING_MESSAGE);
                }
        }
        // event handling for the add credit button
        else if(a.getSource() == addCreditbtn3){
            // checks the empty text field found with the error message
            if(cardIdTextField.getText().isEmpty() || bankAccountTextField.getText().isEmpty() || issuerBankTextField.getText().isEmpty() || clientNameTextField.getText().isEmpty() || balanceAmountTextField.getText().isEmpty() || cvcNumberTextField.getText().isEmpty() || interestRateTextField.getText().isEmpty() || expirationDate1ComboBox.getSelectedItem().toString().isEmpty() || expirationDate2ComboBox.getSelectedItem().toString().isEmpty() || expirationDate3ComboBox.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(Frame1,"Please Fill the Empty Field for CreditCard","Alert",JOptionPane.WARNING_MESSAGE);
            return;   
        }// checks for the exception handling for the Number Format
            try{
                // takes the variable with conversion string into integer
                int CardId = Integer.parseInt(cardIdTextField.getText());
                int balanceAmount = Integer.parseInt(balanceAmountTextField.getText());
                int cvcNumber = Integer.parseInt(cvcNumberTextField.getText());
                double interestRate = Integer.parseInt(interestRateTextField.getText());
                String clientName = clientNameTextField.getText();
                String bankAccount = bankAccountTextField.getText();
                String issuerBank = issuerBankTextField.getText(); 
                String expirationDate = expirationDate1ComboBox.getSelectedItem().toString() + expirationDate2ComboBox.getSelectedItem().toString() + expirationDate3ComboBox.getSelectedItem().toString();
                // boolean varaible is taken as false
                boolean cardIdExists_check = false;
                //for each loop is executed for the Bankcard arraylist
                for(BankCard card_number : BankCardArraylist){
                    // checks the card id is exist in the arraylist or not 
                    if(card_number.getcardId() == CardId){
                        JOptionPane.showMessageDialog(Frame1,"This CardId is Already Exists","Alert",JOptionPane.WARNING_MESSAGE);
                        cardIdExists_check = true;
                        return;
                    }
                }
                   // checks the variable is false then object is add in the bankcard arraylist with suitable messagge
                    if(!cardIdExists_check){
                        CreditCard creditCard_obj = new CreditCard(CardId,clientName,issuerBank,bankAccount,balanceAmount,cvcNumber,interestRate,expirationDate);   
                        BankCardArraylist.add(creditCard_obj);
                        JOptionPane.showMessageDialog(Frame1,"Credit Card Added Successfully!","Information",JOptionPane.INFORMATION_MESSAGE);
                    }   
            }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(Frame1,"Enter Applicable Format value","Error",JOptionPane.WARNING_MESSAGE);
                }
            
        } 
        // event handling for the setCreditLimit butto of Credit Card
        else if(a.getSource() == setCreditLimitbtn5){
            // checks for the text field empty found with suitable message
            if(cardIdTextField.getText().isEmpty() || creditLimitTextField.getText().isEmpty() || gracePeriodTextField.getText().isEmpty()){
                JOptionPane.showMessageDialog(Frame1,"Please Fill Empty Field for Credit Limit","Alert",JOptionPane.WARNING_MESSAGE);
                return;
            }
            // checks the exception handling for the number format
            try{
                // takes the variable with conversion string into integer
                int CardId = Integer.parseInt(cardIdTextField.getText());
                double interestRate = Integer.parseInt(interestRateTextField.getText());
                int gracePeriod = Integer.parseInt(gracePeriodTextField.getText());
                int balanceAmount  = Integer.parseInt(balanceAmountTextField.getText());
                double creditLimit = Integer.parseInt(creditLimitTextField.getText());
                //for each loop is executed for the Bankcard arraylist
                for(BankCard card_number : BankCardArraylist){
                    // Downcasting from debitcard to bankcard to call the method of child class Credit Card
                    if(card_number instanceof CreditCard){
                        CreditCard credit_card = (CreditCard) card_number;
                        // checks the card id is exist in the Debit Card or not . If not then it further checks inside otherwise it shows error message
                        if(credit_card.getcardId() == CardId){
                            // if creditlimit is less than equal to 2.5* balanceamount then scredit limit set succesfully otherwise not granted
                            if(creditLimit <= (2.5*credit_card.getbalanceAmount())){
                                credit_card.setcreditLimit(creditLimit,gracePeriod);
                                JOptionPane.showMessageDialog(Frame1,"Credit Limit Set Successfully!","Information",JOptionPane.INFORMATION_MESSAGE);
                            }
                                else{
                                    JOptionPane.showMessageDialog(Frame1,"Credit Card Not Granted!","Alert",JOptionPane.WARNING_MESSAGE);
                                }
                        }
                            else{
                                JOptionPane.showMessageDialog(Frame1,"Please Enter Valid Card ID!","Alert",JOptionPane.WARNING_MESSAGE);
                            }
                    }
                }
            }
        
                catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(Frame1,"Enter Applicable Format value","Error",JOptionPane.WARNING_MESSAGE);
                }
        }
        // event handling for the cancel credit button for the credit card
        else if(a.getSource() == cancelCreditbtn4){
                // checks the card id is empty or not if not fill it shows the error messagge
                if(cardIdTextField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(Frame1,"Please Fill the Card ID To Cancel!","Alert",JOptionPane.WARNING_MESSAGE);
                    return;
                }// takes the variable with conversion string into integer
                     try{
                          int CardId = Integer.parseInt(cardIdTextField.getText());
                          //for each loop is executed for the Bankcard arraylist
                          for(BankCard card_number : BankCardArraylist){
                              // Downcasting from debitcard to bankcard to call the method of child class Credit Card
                              if(card_number instanceof CreditCard){
                                  CreditCard credit_card = (CreditCard) card_number;
                                  // checks the card id is exist in the Debit Card or not . If not then it further checks inside otherwise it shows error message
                                  if(credit_card.getcardId() == CardId){
                                      // calling the cancel credit card from the Credit card class
                                      credit_card.cancelCreditcard();
                                      JOptionPane.showMessageDialog(Frame1,"Credit Card Cancel Successfully!","Information",JOptionPane.INFORMATION_MESSAGE);
                                  }
                                      else{
                                          JOptionPane.showMessageDialog(Frame1,"Please Enter Valid Card ID!","Alert",JOptionPane.WARNING_MESSAGE);
                                      }
                              }
                          }
                      }
                          catch(NumberFormatException e){
                              JOptionPane.showMessageDialog(Frame1,"Enter Applicable Format value","Error",JOptionPane.WARNING_MESSAGE);
                          }
        }
        // Event handling for the display button for the Credit card   
        else if(a.getSource() == displaybtn8){
                // checks the bankcard arraylist is empty or not . If empty then it shows the message to add debit card object first 
                if(BankCardArraylist.isEmpty() == false){
                    // for each loop is executed for the bankcard arraylist 
                    for(BankCard card_number : BankCardArraylist){
                        // Downcasting from debitcard to bankcard to call the method of child class Credit Card
                        if(card_number instanceof CreditCard){
                            // calling the display method of Credit card class
                            ((CreditCard)card_number).display();
                        }
                    }   
                }
                    else{
                        JOptionPane.showMessageDialog(Frame1,"Please First Add the Credit Card","Alert",JOptionPane.WARNING_MESSAGE);
                    }
        }
        // event handling for the clear button    
        else if(a.getSource()== clearbtn7){
                // it sets the all the text field of debit card and credit card to the clear
                cardIdTextField.setText("");
                clientNameTextField.setText("");
                issuerBankTextField.setText("");
                balanceAmountTextField.setText("");
                bankAccountTextField.setText("");
                pinNumberTextField.setText("");
                withdrawalAmountTextField.setText("");
                cvcNumberTextField.setText("");
                creditLimitTextField.setText("");
                interestRateTextField.setText("");
                gracePeriodTextField.setText("");
                withdrawalDate1ComboBox.setSelectedIndex(0);
                withdrawalDate2ComboBox.setSelectedIndex(0);
                withdrawalDate3ComboBox.setSelectedIndex(0);
                expirationDate1ComboBox.setSelectedIndex(0);
                expirationDate2ComboBox.setSelectedIndex(0);
                expirationDate3ComboBox.setSelectedIndex(0);
        }
    }
    // main method of class BankGUI call 
    public static void main(String[] args){
        new BankGUI();
        
    }   
}