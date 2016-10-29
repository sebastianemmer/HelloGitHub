
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
		double tempC = fahrenheit2celsius(78.8);
		
		System.out.println("");
		System.out.println("");
		System.out.println("Fahrenheit: " + tempF);
		System.out.println("Celsius: " + tempC);
	}
	
	public static double celsius2Fahrenheit(double celsius) {
		double fahrenheit = 9.0/5 * celsius + 32;
		return fahrenheit;
		
	}
	
	public static double fahrenheit2celsius(double fahrenheit) {
		double celsius = ((fahrenheit - 32) / (9.0/5));
		return celsius;
	}
	
}