import java.util.Scanner;


public class SumaCifara {
	/** 
	 * Funkcija sabira sve cifre jednog integera i vraća sumu
	 * @param br
	 * @return suma
	 */
	public static int Suma(int br)
	{
		int suma=0;
		int cifra=0;
		while (br>=1)
		{
			cifra = br % 10;
			suma +=cifra;
			br = br / 10;
		}
		return suma;
	}
	
	public static void main(String[] args)
	{
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite jedan broj: ");
		int broj = unos.nextInt();
		System.out.println(Suma(broj));
	}
}
