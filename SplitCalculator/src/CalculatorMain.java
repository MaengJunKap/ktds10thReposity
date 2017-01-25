
public class CalculatorMain {

	public static void main(String[] args) {
		
		int[] points = {100, 100, 100};
		
		ArrayCalculator arrayCalculator = new ArrayCalculator();
		arrayCalculator.calculator(points);
		
		
		String strPoint = "50 50 50";
		String[] strPoints = strPoint.split(" ");
		
		int numberOne = Integer.parseInt( strPoints[0] );
		int numberTwo = Integer.parseInt( strPoints[1] );
		int numberThree = Integer.parseInt( strPoints[2] );
		
		int[] points2 = {numberOne, numberTwo, numberThree};
		
		arrayCalculator.calculator(points2);
		
	}
	
}
