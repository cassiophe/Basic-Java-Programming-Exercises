import java.util.Scanner;

public class AirlineSeat
{
	public static void main(String[] args)
	{
		String choice;
		char[][] arr = {{'1','A','B','C','D'},{'2','A','B','C','D'},{'3','A','B','C','D'},{'4','A','B','C','D'},{'5','A','B','C','D'},{'6','A','B','C','D'},{'7','A','B','C','D'}};

		for(int i = 0; i < 7; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println();

		String str;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("Please choose an unoccupied seat location (from 1A to 7D): ");
			str = sc.next();
			System.out.println();

			char row = str.charAt(0);
			char col = str.charAt(1);
			int r = Character.getNumericValue(row); 
			int c = 0; 
			

			switch(col)
			{
				case 'A': {c = 1;break;}
				case 'B': {c = 2;break;}
				case 'C': {c = 3;break;}
				case 'D': {c = 4;break;}
				default: break;		
			}

			arr[r-1][c] = 'X';

			for(int i = 0; i < 7; i++)
			{
				for(int j = 0; j < 5; j++)
				{

					System.out.print(arr[i][j]+" ");
				}
				System.out.print("\n");
			}

			System.out.print("Get another seat? [y/n] ");
			choice = sc.next();
			System.out.println();
		}	

		while(choice.equals("y"));
	}
}