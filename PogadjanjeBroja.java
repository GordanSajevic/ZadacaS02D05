import java.util.Scanner;


public class PogadjanjeBroja {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Igra pogađanja! Unesite broj između 1 i 100: ");
		int broj = unos.nextInt();
		double zamisljeniBroj = 1 + (int)(Math.random()*100);
		while (broj<1 || broj>100)
		{
			System.out.println("Unijeli ste pogrešnu vrijednost! Ponovite unos");
			broj = unos.nextInt();
		}
		while (broj!=zamisljeniBroj)
		{
			if (broj<zamisljeniBroj)
			{
				System.out.println("Vaš broj je manji od zamišljenog broja!");
				broj = unos.nextInt();
			}
			else
			{
				System.out.println("Vaš broj je veći od zamišljenog broja!");
				broj = unos.nextInt();
			}
		}
		if (broj==zamisljeniBroj)
		{
			System.out.println("Čestitam, pogodili ste!");
		}
	}

}
