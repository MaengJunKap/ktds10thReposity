import java.util.Scanner;

/**
 * 산술 연산자를 이용한 계산기 만들기
 * @author minchangjang
 *
 */
public class Calculator {

	Scanner input = new Scanner( System.in );
	
//	void addition() {
	void addition(int numberOne, int numberTwo) {
		
//		System.out.println("더하기 입니다.");
//		System.out.println("첫 번째 숫자를 입력하세요.");
//		int numberOne = input.nextInt();
//		System.out.println("두 번째 숫자를 입력하세요.");
//		int numberTwo = input.nextInt();
		
		int result = numberOne + numberTwo;
		
		System.out.println(numberOne + " + "
						+ numberTwo + " = "
						+ result);
		
	}
	
	void subtraction() {
		
		System.out.println("빼기 입니다.");
		System.out.println("첫 번째 숫자를 입력하세요.");
		int numberOne = input.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int numberTwo = input.nextInt();
		
		int result = numberOne - numberTwo;
		
		System.out.println(numberOne + " - "
						+ numberTwo + " = "
						+ result);
		
	}
	
}
