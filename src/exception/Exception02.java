package exception;

public class Exception02 {
	public static void main(String[] args) {
        try {
        	// tryブロック（例外が発生する可能性がある処理）
            System.out.println("100 ÷ 0 は？");
            int result = 100 / 0;
            System.out.println("計算結果" + result);
        } catch (ArithmeticException e) {
        	// catchブロック（例外が発生した時に実行する処理）
            System.out.println("例外が発生");
        } finally {
        	// finallyブロック(例外発生の有無にかかわらず必ず実行する処理)
            System.out.println("プログラム終了");
        }
    }
}
