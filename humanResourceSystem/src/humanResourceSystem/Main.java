package humanResourceSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Student> students = new ArrayList<Student>();
	static int opt2 = 1;

	public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        
         int option;
         String ans;
         // creating array list
         Student s = new Student("001","lim kok yong", "24, Jlnmegah, Cheras ", "010-33388833", "yong@gmail.com");
         
         students.add(s);
         
         while(true) {
        	 if(opt2 == 0) {
        		 break;
        	 }
        	 System.out.println("Main Menu \n1-View Staff\n2-Add New Staff\n3-Calculate Salary\n4-Exit");
        	 option = console.nextInt();
        	 
        	 switch(option) {
        	 case 1:
        		 viewStudent();
        		 break;
        		 
        	 case 2:
        		 addStudent();
        		 break;
        	 default:
        		 break;
        	 }
        	 
        	   
        	   
           }
           
       }
	
	public static void viewStudent() {
		System.out.println("ID\tname\t        address\t                phone\t        email");
		for (Student temp : students) {
            System.out.println(temp.id+"\t"+temp.name+"\t"+temp.address+"\t"+temp.phoneNumber+"\t"+temp.email);
        }
	}
	
	public static void addStudent() {
		Scanner in= new Scanner(System.in);
		Student s = new Student();
		System.out.println("enter the details of staff ");
		System.out.print("enter the staff id: ");
		s.id = in.nextLine();
		System.out.print("\nenter staff name: ");         
		s.name = in.nextLine();
	    System.out.print("\nenter the staff address: ");
	    s.address = in.nextLine();
	    System.out.print("\nenter the staff phone number: ");
	    s.phoneNumber = in.nextLine();
	    System.out.print("\nenter the staff email: ");
	    s.email = in.nextLine();
	    System.out.print("\nAre you sure you want to save this record (Y/N)");
	    String opt = in.nextLine();
	    if(opt.equals("Y")){
	    	students.add(s);
	    }
	    System.out.println(" Press 1 to add more staff\nPress 2 to go to Main Menu\nPress 0 to exit");
	    opt2 = in.nextInt();
	    if(opt2 == 1) {
	    	System. out. flush();
	    	addStudent();
	    }
	    else if(opt2==2) {
	    	
	    }
	    else if(opt2==0) {
	    	return;
	    }
	    
		
	}
	
	
    
   

}
