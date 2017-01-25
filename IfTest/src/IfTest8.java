import java.util.Scanner;

/**
 * 일기예보 프로그램
 * 1. 비가옵니다. 2. 맑습니다.
 * 
 * 메뉴 중 1번을 선택하면 "우산을 챙겨가세요"
 * 2번을 선택하면 "우산은 필요없어요" 를 출력하는 프로그램
 * 
 * @author minchangjang
 *
 */
public class IfTest8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for ( int i = 0; i < 3; i++ ) {
			// 사용자에게 메뉴를 보여준다.
			System.out.println("지금 날씨는 어떤가요?");
			System.out.println("1. 비가 옵니다. 2. 맑습니다.");
			
			// 1, 2 번 중 하나를 입력 받는다.
			int chooseMenu = input.nextInt();
			
			// 사용자가 1번을 선택했다면, "우산을 챙겨가세요!"를 출력한다.
			if ( chooseMenu == 1 ) {
				System.out.println("우산을 챙겨가세요!");
			}
			// 사용자가 2번을 선택했다면, "우산은 필요없어요!"를 출력한다.
			else if ( chooseMenu == 2 ) {
				System.out.println("우산은 필요없어요!");
			}
		}
		
	}
	
}
