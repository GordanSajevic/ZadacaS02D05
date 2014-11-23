import java.util.Scanner;


public class SumaDjelilaca {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite prirodan broj n: ");
		int n = unos.nextInt();
		while (n<0 && n!=(int)n)
		{
			System.out.println("Niste unijeli prirodan broj. Ponovite unos: ");
			n = unos.nextInt();
		}
		int suma=0;
		for (int i=1; i<=n; i++)
		{
			if (n%i==0)
			{
				suma = suma + i;
			}
		}
		System.out.println("Suma svih djelilaca: " + suma);
	}

}
