package humanResourceSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Student> students = new ArrayList<Student>();
	static int opt2 = 1;
	static int a,b;

	public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        
         int option;
         String ans;
         // creating array list
         Student s = new Student("001","lim kok yong", "24, Jlnmegah, Cheras ", "010-33388833", "yong@gmail.com");
         
         students.add(s);
         
         while(true) {
        	 if(opt2 == 0) {
        		 System.out.println("BYE-BYE");
        		 break;
        	 }
        	 System.out.println("Main Menu \n1-View Staff\n2-Add New Staff\n3-Calculate Salary\n4-Exit");
        	 option = console.nextInt();
        	 
        	 switch(option) {
        	 case 1:
        		 viewStudent();
        		 break;
        		 
        	 case 2:
        		Student s1 = new Student();
        		System.out.println("enter the details of staff ");
        		System.out.print("enter the staff id: ");
        		s1.id = console.nextLine();
        		System.out.print("\nenter staff name: ");         
        		s1.name = console.nextLine();
        		System.out.print("\nenter the staff address: ");
        		s1.address = console.nextLine();
        		System.out.print("\nenter the staff phone number: ");
        		s1.phoneNumber = console.nextLine();
        		System.out.print("\nenter the staff email: ");
        		s1.email = console.nextLine();
        		addStudent(s1);
        		break;
        	 case 3:
        		 System.out.println("SALARY CALCULATION");
        		 int opt3=1;
        		 while(opt3!=3) {
        			 System.out.println("Enter basic salary: ");
        			 b = console.nextInt();
        			 System.out.println("Enter allowance: ");
        			 a = console.nextInt();
        			 System.out.println("Total salary is: "+ totalSalary(b,a));
        			 System.out.println("Press 1 to calculate salary\nPress 2 to go to Main Menu\nPress 0 to exit\n");
        			 opt3 = console.nextInt();
        			 if(opt3 == 1) {
        				 
        			 }
        			 else if(opt3==2) {
        				 break;
        			 }
        			 else{
        				 opt2=0;
        				 break;
        			 }
        		 }
        		 
        		 break;
        		 
        	 case 4:
        		 opt2 = 0;
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
	
	public static void addStudent(Student s) {
		Scanner in= new Scanner(System.in);
		
	    System.out.print("\nAre you sure you want to save this record (Y/N)");
	    String opt = in.nextLine();
	    if(opt.equals("Y")){
	    	students.add(s);
	    }
	    System.out.println(" Press 1 to add more staff\nPress 2 to go to Main Menu\nPress 0 to exit");
	    opt2 = in.nextInt();
	    if(opt2 == 1) {
	    	Student s1 = new Student();
    		System.out.println("enter the details of staff ");
    		System.out.print("enter the staff id: ");
    		s1.id = in.nextLine();
    		System.out.print("\nenter staff name: ");         
    		s1.name = in.nextLine();
    		System.out.print("\nenter the staff address: ");
    		s1.address = in.nextLine();
    		System.out.print("\nenter the staff phone number: ");
    		s1.phoneNumber = in.nextLine();
    		System.out.print("\nenter the staff email: ");
    		s1.email = in.nextLine();
    		addStudent(s1);
	    }
	    else if(opt2==2) {
	    	
	    }
	    else if(opt2==0) {
	    	return;
	    }
	    
		
	}
	public static int totalSalary(int basic,int allowance) {
		return basic+allowance;
	}
	
	
    
   

}
