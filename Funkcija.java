import java.util.Scanner;


public class Funkcija {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite koeficijente a, b i c (od -10 do 10): ");
		double a = unos.nextDouble();
		double b = unos.nextDouble();
		double c = unos.nextDouble();
		double x;
		double f;
		if (a<-10 || a>10 || b<-10 || b>10 || c<-10 || c>10)
		{
			System.out.println("Koeficijenti a, b, c nisu u zadanom intervalu!");
		}
		else
		{
			System.out.println("Unesite tačku x: ");
			x = unos.nextDouble();
			f = a*x*x + b*x + c;
			System.out.println("f(" + x + ") = " + f);
		}
	}

}
