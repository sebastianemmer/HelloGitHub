
public class OperatorsArithmetic {

	public static void main(String[] args) {

		int a = 9;
		int b = 5;

		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
		
		double tempF = celsius2Fahrenheit(26.0);
		
		System.out.println("");
		System.out.println("");
		System.out.println("Fahrenheit: " + tempF);
	}
	
	public static double celsius2Fahrenheit(double celsius) {
		double fahrenheit = 9.0/5 * celsius + 32;
		return fahrenheit;
		
	}
	
// HÜ: Umgekehrte Umrechnung durchführen (Fahrenheit > Celsius)

}