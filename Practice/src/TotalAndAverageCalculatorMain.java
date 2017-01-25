
public class TotalAndAverageCalculatorMain {

	public static void main(String[] args) {
		
		TotalAndAverageCalculator totalAndAverageCalculator
				 = new TotalAndAverageCalculator();
		
		/*
		int[] points = new int[4];
		points[0] = 100;
		points[1] = 90;
		points[2] = 100;
		points[3] = 70;
		*/
		
		int[] points = new int[]{ 10, 9, 10, 7 };
		int[] points2 = {100, 90, 100, 70};
		
		totalAndAverageCalculator.printTotalAndAverage(points2);
		
		
//		String str = new String("");
		String message = "안녕하세요. 제 이름은 장민창 입니다. 반갑습니다.";
		
		String[] splitedMessage = message.split(" ");
		System.out.println(splitedMessage[0]);
		System.out.println(splitedMessage[1]);
		System.out.println(splitedMessage[2]);
		System.out.println(splitedMessage[3]);
		System.out.println(splitedMessage[4]);
		System.out.println(splitedMessage[5]);
		
		String message11 = "조성만::27";
		String[] info = message11.split("::"); 
		System.out.println(info[0]);
		System.out.println(info[1]);
		
		
	}
	
}
