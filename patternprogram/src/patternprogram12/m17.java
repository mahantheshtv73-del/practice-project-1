package patternprogram12;
import java.util.Scanner;

public class m17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number :");
int num = sc.nextInt();
for ( int i = 1;i<= num ;i++)
{
	for (int col =1;col <=num ; col++)
	{
		System.out.print(col);
	}
	System.out.println();
}
	}

}
