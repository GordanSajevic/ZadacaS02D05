import java.util.Scanner;


public class Slovo {
	
	/**
	 * Funkcija prima rečenicu i slovo, i vraća rečenicu bez tog slova
	 * @param str
	 * @param slv
	 * @return strBezSlova
	 */
	
	public static String RecenicaBezSlova (String str, String slv)
	{
		String strBezSlova = "";
		if (slv.toUpperCase()==slv)
		{
			String slvLowerCase = slv.toLowerCase();
			strBezSlova = str.replaceAll(slv, "");
			strBezSlova = str.replaceAll(slvLowerCase, "");
			
		}
		if (slv.toLowerCase()==slv)
		{
			String slvUpperCase = slv.toUpperCase();
			strBezSlova = str.replaceAll(slv, "");
			strBezSlova = str.replaceAll(slvUpperCase, "");
		} 
		return strBezSlova;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite rečenicu: ");
		String recenica = unos.nextLine();
		System.out.println("Unesite slovo: ");
		String slovo = unos.nextLine();
		System.out.println(RecenicaBezSlova(recenica, slovo));
	}

}
