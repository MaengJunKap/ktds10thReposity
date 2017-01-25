import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {
		/*
		 * 프로그래밍, 경영, 수학, 알고리즘의 점수를 입력받아
		 * 총점과 평균을 구한다.
		 * 평균이 90점 이상이라면 "참 잘했어요!" 를 출력하고
		 * 그 이하라면 "노력하세요!"를 출력하는 프로그램
		 */
		// 점수를 입력받기 위한 Scanner 를 생성한다./
		Scanner input = new Scanner(System.in);
		
		// 과목별 점수를 변수에 할당한다.
		System.out.print("프로그래밍 점수 : ");
		int programming = input.nextInt();
		
		System.out.print("경영 점수 : ");
		int management = input.nextInt();
		
		System.out.print("수학 점수 : ");
		int mathmatic = input.nextInt();
		
		System.out.print("알고리즘 점수 : ");
		int algorithm = input.nextInt();
		
		// 총점을 구한다.
		int sum = programming + management + mathmatic + algorithm;
		
		// 평균을 구한다.
		double average = sum / 4.0;
		
		String message = String.format("총점은 %d, 평균은 %.2f점 입니다.", sum, average);
		System.out.println(message);
		
		// 평균이 90점을 넘는다면 "참 잘했어요!"를 출력한다.
		if ( average >= 90 ) {
			System.out.println("참 잘했어요!");
		}
		// 평균이 90점을 넘기지 못한다면 "노력하세요!"를 출력한다.
		// 위 조건(average >= 90)의 결과가 false 라면 "노력하세요!"를 출력한다.
		else {
			System.out.println("노력하세요!");
		}
	}
	
}






