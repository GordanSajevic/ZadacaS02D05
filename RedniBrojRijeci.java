import java.util.Scanner;


public class RedniBrojRijeci {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite rečenicu: ");

		String str = unos.nextLine();

		System.out.println("Unesite redni broj riječi:  ");

		int brojRijeci = unos.nextInt();

		System.out.println("To je riječ: "  + izvadiRijec(str, brojRijeci));

	}



	private static String izvadiRijec(String recenica, int brojRijeci) {

		String trazenaRijec = "";

		int trenutnaRijec = 0;

		int trenutniIndex = 0;

		while (trenutnaRijec < brojRijeci)

		{

			if (recenica.charAt(trenutniIndex) != ' ')

			{

				if (trenutniIndex==0)

				{

					trenutnaRijec++;

				}

				else

				{

					if (recenica.charAt(trenutniIndex - 1) == ' ')

					{

						trenutnaRijec++;

					}

				}

			}

			trenutniIndex++;

		}

		trenutniIndex--;

		while(recenica.charAt(trenutniIndex) != ' ')

		{

			trazenaRijec += recenica.charAt(trenutniIndex);

			trenutniIndex++;

		}

		return trazenaRijec;

	}

}
