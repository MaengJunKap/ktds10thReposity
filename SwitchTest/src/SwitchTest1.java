
public class SwitchTest1 {
	
	public static void main(String[] args) {
		
		/*
		switch ( 숫자 혹은 문자열 변수 ) {
		case 1: // 상태에 따른 진행 로직
		case 2: // 상태에 따른 진행 로직
		case 3: // 상태에 따른 진행 로직
		default:
			// 마무리 작업
		}
		*/
		
		// 라면 끓이기 프로세스
		
		// 냄비를 꺼낸다.
		final int READY = 1;
		// 냄비에 물을 넣는다.
		final int WATER = 2;
		// 가스불에 냄비를 올린다.
		final int FIRE = 3;
		// 물을 끓인다.
		final int BOIL = 4;
		// 소스와 물을 넣는다.
		final int INJECT = 5;
		// 익으면 불을 끈다.
		final int OFF = 6;
		// 맛있게 먹는다.
		final int EAT = 7;
		
		// 현재의 상태를 저장할 숫자 변수를 만들고 1을 할당한다.
		int nowState = READY;
		
		// 라면 끓이기 프로세스를 정의한다.
		switch ( nowState ) {
		case READY : 
			System.out.println("냄비를 꺼낸다.");
		case WATER :
			System.out.println("냄비를 물을 넣는다.");
		case FIRE :
			System.out.println("가스불에 냄비를 올린다.");
		case BOIL :
			System.out.println("물을 끓인다.");
			break; // switch를 종료한다.
		case INJECT :
			System.out.println("소스와 면을 넣는다.");
		case OFF :
			System.out.println("익으면 불을 끈다.");
		case EAT :
			System.out.println("맛있게 먹는다.");
		default:
			System.out.println("설거지를 한다.");
		}
		
		
	}
	
}

















