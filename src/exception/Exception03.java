package exception;

public class Exception03 {
    public static void main(String[] args) {
        try {
            // divisionメソッド（割り算）を呼び出し
            Exception03.division(100, 0);
        // ArithmeticExceptionクラスの例外が発生した場合の例外処理
        } catch (ArithmeticException e) {
            // 例外クラスが一致しないので、例外処理が実行されない
            System.out.println("ArithmeticException例外が発生");
        // IllegalArgumentExceptionクラスの例外が発生した場合の例外処理
        } catch (IllegalArgumentException e) {
            // 例外処理が実行される
            System.out.println("IllegalArgumentException例外が発生");
            // キャッチした例外インスタンスをthrow（意図的に例外を発生）
            throw e;
        }
        // finallyブロックでないので処理が実行されない
        System.out.println("プログラム終了");
    }

    public static void division(int a, int b) {
        System.out.println(a + " ÷ " + b + " は？");
        if (b == 0) {
            // 割り算で例外が発生するので、意図的にIllegalArgumentException例外をthrow（意図的に例外を発生）
            throw new IllegalArgumentException("引数が不正です");
        }
        int result = a / b;
        System.out.println("計算結果" + result);
    }
}


// 例外インスタンスをスロー
// throw 例外インスタンス;

// 例外インスタンスを生成してスロー
// throw new 例外クラス;