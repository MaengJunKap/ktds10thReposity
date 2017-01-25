import java.util.Scanner;

/**
 * 산술 연산자를 이용해 합계 구하기
 * @author minchangjang
 *
 */
public class TotalCalculator {

	Scanner input = new Scanner(System.in);
	
	void printTotalPoint(int[] scores) {
		
		System.out.println("합계 구하기 프로그램");
		
//		int[] scores = new int[3];
//		
//		System.out.println("첫 번째 숫자를 입력하세요.");
////		int numberOne = input.nextInt();
//		scores[0] = input.nextInt();
//		
//		System.out.println("두 번째 숫자를 입력하세요.");
////		int numberTwo = input.nextInt();
//		scores[1] = input.nextInt();
//		
//		System.out.println("세 번째 숫자를 입력하세요.");
////		int numberThree = input.nextInt();
//		scores[2] = input.nextInt();
		
		int totalPoint = scores[0] + scores[1] + scores[2];
		
		System.out.println(scores[0] + " + "
						+ scores[1] + " + "
						+ scores[2] + " = "
						+ totalPoint);
		
		
	}
	
}
