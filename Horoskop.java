import java.util.Scanner;


public class Horoskop {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite dan rođenja: ");
		int dan = unos.nextInt();
		System.out.println("Unesite mjesec rođenja: ");
		int mjesec = unos.nextInt();
		while (dan<1 || dan >31 || mjesec<1 || mjesec>12)
		{
			System.out.println("Unijeli ste pogrešan datum! Ponovite unos");
			System.out.println("Unesite dan rođenja: ");
			dan = unos.nextInt();
			System.out.println("Unesite mjesec rođenja: ");
			mjesec = unos.nextInt();
		}
		if ((dan>20 && mjesec==3) || (dan<21 && mjesec==4))
		{
			System.out.println("Vaš horoskopski znak je ovan!"); 
		}
		else if ((dan>20 && mjesec==4) || (dan<21 && mjesec==5))
		{
			System.out.println("Vaš horoskopski znak je bik!"); 
		}
		else if ((dan>20 && mjesec==5) || (dan<21 && mjesec==6))
		{
			System.out.println("Vaš horoskopski znak je blizanci!"); 
		}
		else if ((dan>20 && mjesec==6) || (dan<21 && mjesec==7))
		{
			System.out.println("Vaš horoskopski znak je rak!"); 
		}
		else if ((dan>20 && mjesec==7) || (dan<22 && mjesec==8))
		{
			System.out.println("Vaš horoskopski znak je lav!"); 
		}
		else if ((dan>21 && mjesec==8) || (dan<23 && mjesec==9))
		{
			System.out.println("Vaš horoskopski znak je djevica!"); 
		}
		else if ((dan>22 && mjesec==9) || (dan<23 && mjesec==10))
		{
			System.out.println("Vaš horoskopski znak je vaga!"); 
		}
		else if ((dan>22 && mjesec==10) || (dan<23 && mjesec==11))
		{
			System.out.println("Vaš horoskopski znak je škorpion!"); 
		}
		else if ((dan>22 && mjesec==11) || (dan<22 && mjesec==12))
		{
			System.out.println("Vaš horoskopski znak je strijelac!"); 
		}
		else if ((dan>21 && mjesec==12) || (dan<21 && mjesec==1))
		{
			System.out.println("Vaš horoskopski znak je jarac!"); 
		}
		else if ((dan>22 && mjesec==1) || (dan<20 && mjesec==2))
		{
			System.out.println("Vaš horoskopski znak je vodenjak!"); 
		}
		else if ((dan>19 && mjesec==2) || (dan<21 && mjesec==3))
		{
			System.out.println("Vaš horoskopski znak je ribe!"); 
		}
	}

}
