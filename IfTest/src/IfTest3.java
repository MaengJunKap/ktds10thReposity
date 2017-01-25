
public class IfTest3 {

	public static void main(String[] args) {
		
		/*
		 * 술집에 입장한 사람의 나이가 30대 일경우
		 * "입장이 가능합니다!" 를 출력하는 프로그
		 */
		
		// 나이를 설정한다.
		int age = 39;
		
		// 나이가 30대 이상인지 확인한다.
		boolean isAdult = age >= 30;
		
		// 나이가 30대 이상이라면, "입장이 가능합니다!"를 출력한다.
		if ( isAdult ) {
			System.out.println("입장이 가능합니다!");
		}
		
		
	}
	
}
