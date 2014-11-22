import java.util.Scanner;


public class Skupovi {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite interval prvog skupa: ");
		double a = unos.nextDouble();
		double b = unos.nextDouble();
		System.out.println("Unesite interval drugog skupa: ");
		double c = unos.nextDouble();
		double d = unos.nextDouble();
		if (a>=c && b<=d)
		{
			System.out.println("Prvi skup je sadržan u drugom.");
		}
		else if ((a<c && b<c) || (a>c && a>d))
		{
			System.out.println("Skupovi se ne sijeku.");
		}
		else if (a>=c && b>=d)
		{
			System.out.println("Presjek je [" + a + ", " + d + "]");
		}
		else if (a<=c && b>=d)
		{
			System.out.println("Drugi skup je sadržan u prvom.");
		}
		else if (a<=c && b<=d)
		{
			System.out.println("Presjek je [" + c + ", " + b + "]");
		}
		
	}

}
