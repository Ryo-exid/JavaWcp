
public class For02 {
	public static void main(String[] args) {
        // 配列の要素を順番にnumberに代入し、要素分繰り返す
        int[] array = { 1, 2, 3, 4, 5 };
        for (int number : array) {
        	// ブロック：numberを出力
            System.out.println("For02 = " + number);
        }
    }
}

//拡張for文とは、配列やコレクションの全要素に対して、繰り返し処理を行なう制御文

// for (型 変数名：配列やコレクションの変数) {
//     ブロック(繰り返し処理)
// }