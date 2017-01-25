
public class TypeCasting {

	public static void main(String[] args) {
		
		/*
		 * int		4 byte
		 * long		8 byte
		 * float	4 byte
		 * double	8 byte
		 * 
		 * 4 byte + 4 byte = 4 byte
		 * 8 byte + 4 byte = 8 byte
		 * 4 byte + 8 byte = 8 byte
		 * 8 byte + 8 byte = 8 byte
		 */
		
		// 4 byte + 4 byte
		int numberOne = 10; // 4 byte
		int numberTwo = 30; // 4 byte
		
		// 4 byte = 4 byte + 4 byte;
		// 4 byte = 2 byte + 4 byte;
		// 4 byte = 1 byte + 4 byte;
		int result = numberOne + numberTwo;
		
		float result2 = 50 + 50.0F;
	
		// 8 byte = 4 byte + 4 byte;
		long bigNumber = 10 + 50;
		
		// ------------------------------------
		
		// 명시적 캐스팅
		int number2 = (int) 10 + (int) 10.6;
		
		double floatingNumber = 50.12355;
		int number3 = 10000;
		
		int number4 = number3 + (int) floatingNumber;
		
	}
	
}









