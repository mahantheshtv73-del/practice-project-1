package patternprogram12;

import java.util.Scanner;

public class m20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		char ch = 'A';
		for(int row =1;row<=num;row++)
		{
			for(int col = 1;col<=num;col++)
			{
				if(row==col )
				{
					System.out.print( row+" ");
				}
				else
				{
					System.out.print(ch++ +" ");
				}
				
			}
			
			System.out.println();
		}

	}

}
