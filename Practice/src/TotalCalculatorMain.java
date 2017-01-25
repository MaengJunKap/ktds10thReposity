
public class TotalCalculatorMain {

	public static void main(String[] args) {
		
		TotalCalculator totalCalculator = new TotalCalculator();
		
		int[] points = new int[3]; 
		points[0] = 100;
		points[1] = 50;
		points[2] = 70;
		
		totalCalculator.printTotalPoint(points);
		
	}
	
}
