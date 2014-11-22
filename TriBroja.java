import java.util.Scanner;


public class TriBroja {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite tri broja u intervalu od 50 do 200: ");
		int prvi = unos.nextInt();
		int drugi = unos.nextInt();
		int treci = unos.nextInt();
		if (prvi<50 || prvi>200 || drugi<50 || drugi>200 || treci<50 || treci>200)
		{
			System.out.println("Nisu svi brojevi u zadanom intervalu!");
			return;
		}
		else
		{
			if (prvi>=drugi && prvi>=treci)
			{
				if (drugi > treci && drugi!=prvi && treci!=prvi)
				{
					System.out.printf("%d\n%d\n%d", prvi, drugi, treci);
				}
				else if(treci > drugi && treci!=prvi && drugi!=prvi)
				{
					System.out.printf("%d\n%d\n%d", prvi, treci, drugi);
				}
				else if (prvi == drugi && prvi !=treci)
				{
					System.out.printf("%d\n%d\n%d", prvi, drugi, treci);
					System.out.println("\nPrvi i drugi broj su jednaki!");
				}
				else if (prvi == treci && prvi!=drugi)
				{
					System.out.printf("%d\n%d\n%d", prvi, treci, drugi);
					System.out.println("\nPrvi i treći broj su jednaki!");
				}
				else if (drugi == treci && drugi!=prvi)
				{
					System.out.printf("%d\n%d\n%d", drugi, treci, prvi);
					System.out.println("\nDrugi i treći broj su jednaki!");
				}
			}
			else if (drugi>=prvi && drugi>=treci)
			{
				if (prvi > treci && prvi!=drugi && treci!=drugi)
				{
					System.out.printf("%d\n%d\n%d", drugi, prvi, treci);
				}
				else if(treci > prvi && treci!=drugi && prvi!=drugi)
				{
					System.out.printf("%d\n%d\n%d", drugi, treci, prvi);
				}
				else if (prvi == drugi && prvi != treci)
				{
					System.out.printf("%d\n%d\n%d", prvi, drugi, treci);
					System.out.println("\nPrvi i drugi broj su jednaki!");
				}
				else if (prvi == treci && prvi!=drugi)
				{
					System.out.printf("%d\n%d\n%d", drugi, prvi, treci);
					System.out.println("\nPrvi i treći broj su jednakI!");
				}
				else if (drugi == treci && drugi!=prvi)
				{
					System.out.printf("%d\n%d\n%d", drugi, treci, prvi);
					System.out.println("\nDrugi i treći broj su jednaki!");
				}
			}
			else if (treci>prvi && treci>drugi)
			{
				if (drugi > prvi && drugi!=treci && prvi!=treci)
				{
					System.out.printf("%d\n%d\n%d", treci, drugi, prvi);
				}
				else if(prvi > drugi && drugi!=treci && treci!=prvi)
				{
					System.out.printf("%d\n%d\n%d", treci, prvi, drugi);
				}
				else if (prvi == drugi && prvi !=treci)
				{
					System.out.printf("%d\n%d\n%d", treci, prvi, drugi);
					System.out.println("\nPrvi i drugi broj su jednaki!");
				}
				else if (prvi == treci && prvi!=drugi)
				{
					System.out.printf("%d\n%d\n%d", prvi, treci, drugi);
					System.out.println("\nPrvi i treći broj su jednaki!");
				}
				else if (drugi == treci && drugi!=prvi)
				{
					System.out.printf("%d\n%d\n%d", drugi, treci, prvi);
					System.out.println("\nDrugi i treći broj su jednaki!");
				}
			}
			else
			{
				System.out.printf("%d\n%d\n%d", prvi, drugi, treci);
				System.out.println("Svi brojevi su jednaki!");
			}
		}
	}

}
