class Transaction{
	Account sender= new Account();
	Account receiver = new Account();
	int amount;
	String additionalInfo;
	
	Transaction(){
		amount = 0;
		additionalInfo=" ";
		
	}
	Transaction(Account sender,Account  receiver,int amount,String additionalInfo){
			this.sender = sender;
			this.receiver = receiver;
			this.amount = amount;
			this.additionalInfo = additionalInfo;
	}

}

class Account{
	private String accName;
    private String acid;
    private int balance;
	Transaction[] listOfTransaction= new Transaction[100];
	int totalNumberOfTransaction;

	
	Account(){
	    accName=" ";
        acid=" ";
        balance=0;
		totalNumberOfTransaction=0;
	}
	Account(String accName,String acid,int balance){
		this.accName=accName;
        this.acid=acid;
        this.balance=balance;
		
		//this.totalNumberOfTransaction = totalNumberOfTransaction;
	}
	void addTransaction(Account sender,Account receiver,int amount){
		
	 
	}
	void showAllTransaction(){
	for(int i=0;i<=totalNumberOfTransaction;i++){
		System.out.println(listOfTransaction[i]);
	}
	
	}
	void showInfo(){
		System.out.println("accName: "+accName);
		System.out.println("acid: "+acid);
		System.out.println("balance: "+balance);
	}
	void deposit(int amount){
	    this.balance = this.balance + amount;
		Transaction example = new Transaction(this,this,amount,"Deposite");
		
		listOfTransaction[totalNumberOfTransaction++] = example;
	}
    boolean Withdraw(int amount){
	    if(this.balance>amount){
		this.balance =this.balance- amount;
		Transaction example = new Transaction(this,this,amount,"Withdraw");
		
		listOfTransaction[totalNumberOfTransaction++] = example;
		return true;
		}
		else{
			System.out.println("invalid operation");
			return false;
		}
	
        		
	}
	int GetBalance(){
	     return this.balance;
	}
	String GetAccName(){
		return this.accName;
	}
	String GetAcid(){
		return this.acid;
	}
	void SetBalance(int balance){
	     this.balance= balance;
	}
	void FundTrans(int balance,Account obj2){
		if(this.GetBalance()>=balance){
			this.balance +=balance;
			obj2.balance -= balance;
			
		}
		else{
			System.out.println("transaction not posible");
		
		}
		
		
		}
	
	
	
	
	
	
}
class OverdraftAccount extends Account{
	int overdraftLimit;
	OverdraftAccount(){
		this("","",0,0);
	}
	OverdraftAccount(String accName,String acid,int balance,int overdraftLimit){
		super(accName,acid,balance);
		this.overdraftLimit = overdraftLimit;
		
		
	}
	boolean Withdraw(int amount){
		if(this.GetBalance()>amount){
		SetBalance(GetBalance()-amount);

		return true;
		}
		else{
			System.out.println(".....Invalid operation.....");
			return false;
		}
		
	}
	void Display(){
		System.out.println("Balance: " + GetBalance());
		System.out.println("Name: " + GetAccName());
		System.out.println("ID :" + GetAcid());
		
	}
	public static void main(String args[]){
		
		
		//Account obj1 = new Account("Rasjs","3ksj",1000);
		//Account obj2 = new Account("sdjksjdf","kjsd",1000);
		//obj1.deposit(500);
		//obj1.deposit(200);
		//obj1.showAllTransaction();
		OverdraftAccount oobj= new OverdraftAccount ("A","B",1234,500);
		oobj.Withdraw(100);
		oobj.Display();
		
		
		
		
		
       		
	}
	
	
}