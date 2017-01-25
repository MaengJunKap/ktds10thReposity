import java.util.Scanner;

/**
 * 산술 연산자를 이용해 합계/평균 구하기
 * @author minchangjang
 *
 */
public class TotalAndAverageCalculator {

	Scanner input = new Scanner(System.in);
//	final int SCORE_COUNT = 4;
	
	void printTotalAndAverage ( int[] points ) {
		
		int totalPoint = points[0] + points[1] + points[2] + points[3];
		System.out.println(points[0] + " + "
						+ points[1] + " + "
						+ points[2] + " + "
						+ points[3] + " = "
						+ totalPoint);
		
//		double averagePoint = totalPoint / (double) points.length;
		double averagePoint = totalPoint / (points.length * 1.0);
		System.out.println("평균은 " + averagePoint + " 입니다.");
		
	}
	
}
