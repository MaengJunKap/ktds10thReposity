
public class Calculator {

	// 멤버변수 두개를 선언하고 초기화 합니다.
	int numberOne = 100;
	int numberTwo = 300;
	
	void addition() {
		
//		int numberOne = 100;
//		int numberTwo = 300;
		
		int additionResult = numberOne + numberTwo;
		
		System.out.println(additionResult);
		System.out.println(numberOne + " + " 
					+ numberTwo + " = " 
					+ additionResult);
		
	}
	
	void subtraction() {
		
		int subtractionResult = numberOne - numberTwo;
		
		System.out.println(subtractionResult);
		System.out.println(numberOne + " - " 
					+ numberTwo + " = " 
					+ subtractionResult);
		
	}
	
	void multiplication() {
		
		int multiplicationResult = numberOne * numberTwo;
		
		System.out.println(multiplicationResult);
		System.out.println(numberOne + " * " 
					+ numberTwo + " = " 
					+ multiplicationResult);
		
	}
	
	void division() {
		
		int numberOne = 100;
		int numberTwo = 300;
		
		int divisionResult = numberOne / numberTwo;
		
		System.out.println(divisionResult);
		System.out.println(numberOne + " / " 
					+ numberTwo + " = " 
					+ divisionResult);
		
	}
	
	void remain() {
		
		int remainResult = numberOne % numberTwo;
		
		System.out.println(remainResult);
		System.out.println(numberOne + " % " 
					+ numberTwo + " = " 
					+ remainResult);
		
	}
	
	
}
