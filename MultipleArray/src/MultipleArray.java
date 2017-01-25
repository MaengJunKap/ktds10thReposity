
public class MultipleArray {

	void printClassTotalScore ( int[][] scoresInClasses ) {
		
		int totalScore1 = scoresInClasses[0][0] + scoresInClasses[0][1] + scoresInClasses[0][2];
		int totalScore2 = scoresInClasses[1][0] + scoresInClasses[1][1] + scoresInClasses[1][2];
		int totalScore3 = scoresInClasses[2][0] + scoresInClasses[2][1] + scoresInClasses[2][2];
		
		int totalScore = totalScore1 + totalScore2 + totalScore3;
		
		// 총합
		System.out.println(totalScore);
		
		// 반별 평균
		double average1 = totalScore1 / (scoresInClasses[0].length * 1.0);
		double average2 = totalScore2 / (scoresInClasses[1].length * 1.0);
		double average3 = totalScore3 / (scoresInClasses[3].length * 1.0);
		
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(average3);
				
	}
	
}
