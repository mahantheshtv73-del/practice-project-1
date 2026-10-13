package patternprogram12;

import java.util.Scanner;

public class m19 {
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
				System.out.print(ch);
				ch++;
			}
			
			System.out.println();
		}

	}

}
