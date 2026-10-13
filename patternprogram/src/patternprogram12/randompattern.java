package patternprogram12;

import java.util.Scanner;

public class randompattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();
		        for(int row =1;row <=n;row++)
				{
					for(int col =1;col<=n;col++)
					{
						if( row ==1|| row == n || row==n/2+1)
						{
							System.out.print("*  ");
						}
						else
						{
							System.out.print( "-  "); 
						}
						
					}
					System.out.println();
				}
			}


}
