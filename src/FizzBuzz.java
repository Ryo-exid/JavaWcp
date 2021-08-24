
public class FizzBuzz {
	public static void main(String[] args) {
		// 変数宣言
		int i = 0;
		int loopCount = 100;
		int numFizz = 3;	
		int numBuzz = 5;
		
		String strFizz = "Fizz"; // Fizz文字列
		String strBuzz = "Buzz"; // Buzz文字列
		
		for (i = 1; i <= loopCount; i++) {
			if (i % (numFizz * numBuzz) == 0) {
				System.out.println(strFizz + strBuzz);
			} else if (i % numFizz == 0) {
				System.out.println(strFizz);
			} else if (i % numBuzz == 0) {
				System.out.println(strBuzz);
			} else {
				System.out.println(i);
			}
		}
	}
}
