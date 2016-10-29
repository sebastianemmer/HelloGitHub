
public class uebung_Metropolis {

	public static void main(String[] args) {
		Boolean ergebnis = isMetropolis(true, 250000, 5439820);
		
		System.out.println("Ergebnis: "+ergebnis);
		
	}
	
	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
		if ((isCapital && inhabitants >= 100000) || (inhabitants >= 200000 && (taxPerPersonAndMonth * 12) >= 720000000))
		{
			return true;
		}
		else
		{
		return false;	
		}
	}

}
