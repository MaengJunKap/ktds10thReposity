
public class Main {

	public static void main(String[] args) {
		
		/*
		 * 1부터 10까지를 출력하는 프로그램을 만든다..
		 * 반복문을 사용하지 않을 경우...
		 */
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		/*
		 * 변수를 이용한 1부터 10까지 출력하는 프로그램을 만든다..
		 */
		int number = 1;
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		
		/*
		 * i = index
		 * i = increment
		 */
		int i = 0;
		
		// i 값이 11 보다 작다면, 반복을 수행해라..
		// i 값이 11 이 되었을 때, 반복이 종료된다.
		while ( i < 10 ) {
			// i = i + 1;  i += 1;
			i++;
			System.out.println(i);
		}
		
	}
	
}









