
public class IfTest4 {

	public static void main(String[] args) {
		
		/*
		 * 현금이 없고 신용카드가 있을 경우
		 * "신용카드로 결제합니다."를 출력하는 프로그램
		 */
		
		// 있다 = true
		// 없다 = false 로 표현함
		
		// 현금이 없다.
		boolean hasCash = false;
		
		// 신용카드가 있다.
		boolean hasCreditCard = true;
		
		// 현금이 없고 신용카드가 있는지 확인한다.
//		boolean isCard = hasCash == false && hasCreditCard == true; // true
		boolean isCard = !hasCash && hasCreditCard; // true
		
		// 현금이 없고 신용카드가 있다면 "신용카드로 결제합니다" 를 출력한다.
		if ( isCard ) {
			System.out.println("신용카드로 결제합니다.");
		}
		
		
	}
	
}
