
/*Now we want to reuse our Account class.
1. If a student deposit a book after certain duration then for each day 10 taka will be charged by 
the library authority.
2. Student can pay that amount (charged amount) from his/her bank account to the library account.
So the library also has an account.
3. Show the total amount a student paid to the library.
4. Show the total amount library gets from the students (total charged amount).
5. But if any student has any valid reason for delay then the librarian can excuse the charged
amount. Librarian can excuse full or partially (%).*/

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

class Account2{
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
	void Withdraw(int amount){
	    if(this.balance>amount){
		this.balance =this.balance- amount;
		Transaction example = new Transaction(this,this,amount,"Withdraw");
		
		listOfTransaction[totalNumberOfTransaction++] = example;
		}
		else{
			System.out.println("invalid operation");
		}
        		
	}
	int GetBalance(){
	     return this.balance;
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
	
	
	
	
	
	public static void main(String args[]){
		
		
		
		
		
		
       		
	}
	
}
class Student{
	Account acc;
	String name;
	String id;
	Student(){
		this(" "," ");
		
	}
	Student(String name,String id){
		this.name = name;
		this.id = id;
	}
}
class Librrary{
	Account acc;
	int fine;
	
	void returnBook(Student std,int date,boolean excuse){
		if(excuse == true){
			fine =0;
		}
		else{
			if(date > 7){
				fine = (date-7)*10;
                acc.FundTrans(fine,std.acc);				
			}
			
		}
		
	}
}
