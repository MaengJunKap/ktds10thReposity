import java.util.Scanner;

/**
 * 
 * 숫자 세 개를 입력받아 그 중 가장 큰 수를 출력하세요.
 * 
 * @author minchangjang
 *
 */
public class IfTest10 {

	public static void main(String[] args) {
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// 숫자 3개를 입력받는다.
		System.out.println("숫자 3개를 입력하세요!");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// number1과 number2 중 큰 수를 새로운 변수에 할당한다.
//		int bigNumber = 0;
//		if ( number1 > number2 ) {
//			bigNumber = number1;
//		}
//		else {
//			bigNumber = number2;
//		}
		
		// 삼항 연산 처리
		// if~else 를 한 라인으로 처리할 수 있다.
		int bigNumber = (number1 > number2) ? number1 : number2;
		
		// bigNumber와 number3 중 큰 수를 bigNumber변수에 할당한다.
//		if ( number3 > bigNumber ) {
//			bigNumber = number3;
//		}
		
		// 삼항 연산 처리
		// if~else 를 한 라인으로 처리할 수 있다.
		bigNumber = (number3 > bigNumber) ? number3 : bigNumber;
		
		System.out.printf("%d, %d, %d 중 가장 큰 수는 %d 입니다.", number1, number2, number3, bigNumber);
		
	}
	
}
