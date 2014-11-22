import java.util.Scanner;


public class Pravougaonik {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite stranicu a: ");
		int a = unos.nextInt();
		System.out.println("Unesite stranicu b: ");
		int b = unos.nextInt();
		
		/* stranica a */
		
		System.out.print("+");
		for (int i=0; i<a-2; i++)
		{
			System.out.print("-");
		}
		System.out.print("+\n");
		
		/* stranice b */

		for (int i=0; i<b-2; i++)
		{
			System.out.print("|");
			for (int j=0; j<a-2; j++)
			{
				System.out.print(" ");
			}
			System.out.print("|\n");
		}
		
		/* opet stranica a */
		
		System.out.print("+");
		for (int i=0; i<a-2; i++)
		{
			System.out.print("-");
		}
		System.out.print("+");
	}

}
