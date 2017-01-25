
public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
		calculator.remain();
		
		int numberTwo = 10;
		
//		numberTwo++; // 10;
//		System.out.println(numberTwo); // 11
//		
//		++numberTwo; // 12
//		System.out.println(numberTwo); // 12
		
		System.out.println(numberTwo++);  // 10
		System.out.println(++numberTwo);  // 12
		
		
		/*
		int numberOne = 10;
		System.out.println(numberOne);
		
		numberOne = 20;
		System.out.println(numberOne);
		
		int numberTwo = numberOne + 1;
		System.out.println(numberTwo);
		
		numberTwo = numberTwo + 10;
		System.out.println(numberTwo);
		
		numberTwo *= 10;
		System.out.println(numberTwo);
		*/
	}
}
