import java.util.Scanner;


public class Trougao {

	/**
	 * Funkcija vraća treću najmanju stranicu trougla
	 * @param br1
	 * @param br2
	 * @return stranica
	 */
	
	public static double TrecaStranica(double br1, double br2)
	{
		double stranica = 0;
		for (double i=0; i<br1 + br2; i++)
		{
			if (br1 + i > br2 && br2 + i > br1)
			{
				stranica = i;
				break;
			}
		}
		return stranica;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite dva broja: ");
		double prviBroj = unos.nextDouble();
		double drugiBroj = unos.nextDouble();
		double treciBroj = TrecaStranica(prviBroj, drugiBroj);
		System.out.println(treciBroj);
	}

}
