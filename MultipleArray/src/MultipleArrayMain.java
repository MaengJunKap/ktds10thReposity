
public class MultipleArrayMain {

	public static void main(String[] args) {
		
//		int[][] scoresInClasses = new int[3][3];
//		scoresInClasses[0][0] = 100;
//		scoresInClasses[0][1] = 100;
//		scoresInClasses[0][2] = 90;
//		
//		scoresInClasses[1][0] = 90;
//		scoresInClasses[1][1] = 10;
//		scoresInClasses[1][2] = 70;
//		
//		scoresInClasses[2][0] = 70;
//		scoresInClasses[2][1] = 100;
//		scoresInClasses[2][2] = 95;
		
//		int[][] scoresInClasses = new int[3][];
//		scoresInClasses[0] = new int[]{100, 100, 90};
//		scoresInClasses[1] = new int[]{90, 10, 70};
//		scoresInClasses[2] = new int[]{70, 100, 95};
		
//		int[][] scoresInClasses = new int[][]{
//			{100, 100, 90},
//			{90, 10, 70},
//			{70, 100, 95}
//		};
		
		int[][] scoresInClasses = {
			{100, 100, 90},
			{90, 10, 70},
			{70, 100, 95}
		};
		
		MultipleArray multipleArray = new MultipleArray();
		multipleArray.printClassTotalScore(scoresInClasses);
		
		
	}
	
}
