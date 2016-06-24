class Book{
	static int bookCounter;
	private String bookName;
    private String bookAuthor;
	private String bookId;
	private String bookType;
    private int bookCopy;
	
	Book(){
	    bookName=" ";
        bookAuthor=" ";
		bookId=" ";
		bookType=" ";
        bookCopy=0;
		bookCounter++;
	}
	Book(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy){
	    this.bookName=bookName;
        this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
        this.bookCopy=bookCopy;
		bookCounter++;
	}
	void showInfo(){
		System.out.println("*******************************************");
		System.out.println("*Print of book Number: "+bookCounter);
		System.out.println("*bookName: "+ bookName);
		System.out.println("*bookAuthor: "+bookAuthor);
		System.out.println("*bookId: "+bookId);
		System.out.println("*bookType: "+bookType);
		System.out.println("*bookCopy: "+bookCopy);
		System.out.println("\n*******************************************");
	}
	
	int GetNoOfBookType(){
	    return bookCounter;
	}
	
	
	public static void main(String args[]){
		
		Book obj1 = new Book("Itro to C","Raiyan","123","education",100);
		obj1.showInfo();
		Book obj2 = new Book("Itro to C++","Raiyan","123","education",140);
		obj2.showInfo();
        System.out.println("The no Of type/types of book/books are: "+obj1.GetNoOfBookType());
	}
	
}
