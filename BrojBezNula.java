import java.util.Scanner;


public class BrojBezNula {
	public static int BezNulaObrnuto(int br)
	{
		int brojObrnuto = 0;
		while (br >= 1)
		{
			if (br % 10 != 0)
			{
				brojObrnuto = brojObrnuto*10 + br % 10;
			}
			br = br / 10;
		}
		return brojObrnuto;
	}
	
	public static int BezNula(int br)
	{
		int rezultat = 0;
		while (br >= 1)
		{
			rezultat = rezultat*10 + br % 10;
			br = br / 10;
		}
		return rezultat;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite jedan broj: ");
		int broj = unos.nextInt();
		int brojObrnuto = BezNulaObrnuto(broj);
		int rezultat = BezNula(brojObrnuto);
		System.out.println(rezultat);
	}

}
