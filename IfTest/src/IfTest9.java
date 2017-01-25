import java.util.Scanner;

/**
 * 
 * 1. 섭씨 -> 화씨
 * 2. 화씨 -> 섭씨 변경 프로그램
 * 
 * 섭씨 -> 화씨 변경 공식
 * 	(섭씨 * 1.8) + 32
 * 
 * 화씨 -> 섭씨 변경 공식
 * 	(화씨 - 32) / 1.8 
 * 
 * @author minchangjang
 *
 */
public class IfTest9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 사용자에게 메뉴를 보여준다.
		System.out.println("메뉴를 선택하세요!");
		System.out.println("1. 섭씨에서 화씨로 변경");
		System.out.println("2. 화씨에서 섭씨로 변경");
		
		// 메뉴를 입력받는다.
		int chooseMenu = input.nextInt();
		
		// 사용자가 1번을 입력했다면, 섭씨에서 화씨로 변경하는 코드를 실행시킨다.
		if ( chooseMenu == 1 ) {
			
			// (섭씨 * 1.8) + 32
			// 섭씨를 입력받는다.
			System.out.println("섭씨를 입력하세요!");
			double cel = input.nextDouble();
			
			// 섭씨를 화씨로 변경한다.
			double fah = (cel * 1.8) + 32;
			
			// 화씨를 출력한다.
			String message = String.format("섭씨 %.1f도는 화씨 %.1f도 입니다.", cel, fah);
			System.out.println(message);
			
		}
		// 사용자가 1번을 입력했다면, 화씨에서 섭씨로 변경하는 코드를 실행시킨다.
		else if ( chooseMenu == 2 ) {
			
			// (화씨 - 32) / 1.8
			// 화씨를 입력받는다.
			System.out.println("화씨를 입력하세요!");
			double fah = input.nextDouble();
			
			// 화씨를 섭씨로 변경한다.
			double cel = (fah - 32) / 1.8;
			
			// 섭씨를 출력한다.
			String message = String.format("화씨 %.1f도는 섭씨 %.1f도 입니다.", fah, cel);
			System.out.println(message);
		}
		
	}
	
}
