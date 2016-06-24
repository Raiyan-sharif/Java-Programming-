class Account{
	private String accName;
    private String acid;
    private int balance;
	Account(){
	    accName=" ";
        acid=" ";
        balance=0;
		
	}
	Account(String accName,String acid,int balance){
		this.accName=accName;
        this.acid=acid;
        this.balance=balance;
	}
	void showInfo(){
		System.out.println("accName: "+accName);
		System.out.println("acid: "+acid);
		System.out.println("balance: "+balance);
	}
	void deposit(int amount){
	    this.balance = this.balance + amount;
	}
	void Withdraw(int amount){
		this.balance =this.balance - amount; 
	}
	
	
	
	public static void main(String args[]){
		Account obj1 = new Account();
		obj1.showInfo();
		
		Account obj2 = new Account("DBL","23432",230);
		obj2.showInfo();
		
		
		
		
       		
	}
	
}
