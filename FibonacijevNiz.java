import java.util.Scanner;


public class FibonacijevNiz {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite broj n (od 1 do 50): ");
		int n = unos.nextInt();
		int fibonaci=0;
		int pomocna1=1;
		int pomocna2=0;
		if (n<1 || n>50)
		{
			System.out.println("Greška. Broj n nije u zadanom intervalu.");
		}
		else
		{
			for (int i=1; i<=n; i++)
			{
				fibonaci = pomocna1 + pomocna2;
				pomocna1 = pomocna2;
				pomocna2 = fibonaci;
			}
			System.out.println("n = " + n + ", R = " + fibonaci);
		}
	}

}
