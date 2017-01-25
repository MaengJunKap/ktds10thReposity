import java.util.Scanner;

public class Final {

	void printSumAndAverage() {

		final int CLASS_COUNT = 3;
		
		Scanner input = new Scanner( System.in );
		
		// 1. 숫자 3개를 입력받는다.
		// 나중에 삭제한 후 실행 해보기
		System.out.println("숫자 3개를 입력하세요.");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// 2. 숫자 3개의 합계를 구한다.
		int sum = number1 + number2 + number3;
		
		// 3. 합계를 출력한다.
		System.out.println(sum);
		
		// 4. 평균을 구한다.
//		double average = sum / 3;
		double average = sum / CLASS_COUNT;
		
		// 5. 평균을 출력한다.
		System.out.println(average);
	}
	
}
