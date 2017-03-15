class Problem6
{
    public static void main(String[] args)
    {
        // Declaring 2-D array with 2 rows
        int arr[][] = new int[4][];
 
        // Making the above array Jagged
 
        // First row has 3 columns
        arr[0] = new int[4];
 
        // Second row has 2 columns
        arr[1] = new int[3];
	arr[2] = new int[2];
	arr[3] = new int[1];
 
	arr[0][0]=9;
	arr[0][1]=10;
	arr[0][2]=11;
	arr[0][3]=12;
	arr[1][0]=66;
	arr[1][1]=67;
	arr[1][2]=68;
	arr[2][0]=71;
	arr[2][1]=72;
        arr[3][0]=90;
        
        System.out.println("This is the first array");
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
		System.out.println();
        }
	arr[0][0]=20;
	arr[0][1]=21;
	arr[0][2]=22;
	arr[0][3]=23;
	arr[1][0]=40;
	arr[1][1]=41;
	arr[1][2]=42;
	arr[2][0]=50;
	arr[2][1]=51;
        arr[3][0]=11;
	System.out.println("This is the second array");
	for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
		System.out.println();
        }
	
    }
}