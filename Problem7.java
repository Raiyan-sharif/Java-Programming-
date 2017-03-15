import java.util.Scanner;

public class Problem7 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a[][];
        a = new int[3][4];
	    int c=0;
	System.out.println("Enter 3 rows and 4 columns: ");
        for(int i=0;i<3;i++){
		for(int j=0;j<4;j++){
            
			a[i][j]=sc.nextInt();
			c+=a[i][j];
		}
        }
			System.out.println("Sum of all elements is "+c);
        
        
        
    }
}