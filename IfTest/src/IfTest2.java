
public class IfTest2 {

	public static void main(String[] args) {
		
		// 술집에 입장한 사람의 나이가 10대 일 경우 
		// "입장할 수 없습니다!" 를 출력하는 프로그램
		
		// 나이를 설정한다.
		int age = 19;
		
		// 나이가 10대인지 확인한다.
		boolean isTeenager = age < 20;
		
		// 만약, 나이가 10대라면 "입장할 수 없습니다"를 출력한다.
		if ( isTeenager ) {
			System.out.println("입장할 수 없습니다!");
		}
		
		
	}
	
}
