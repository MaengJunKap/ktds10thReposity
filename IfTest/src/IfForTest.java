
public class IfForTest {

	public static void main(String[] args) {
		
		/*
		 * 1 부터 100 사이에 존재하는 모든 짝수를 출력하기
		 */
		
		// 1. 1 부터 100까지 반복 한다.
		for ( int i = 1; i < 101; i++  ) {
			
			// 2. i 값이 짝수인지 확인한다.
			if ( i % 2 == 0 ) {
				// 3. i 값이 짝수라면 출력한다.
				System.out.println(i);
			}
			
		}
		
		
		
	}
	
}
