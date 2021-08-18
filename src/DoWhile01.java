
public class DoWhile01 {
    public static void main(String[] args) {
        int number = 100;
        // 条件がfalseでも先にブロックを実行
        do {
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        } while (number < 50);
    }
}
// 仮にはじめから条件式の結果が「false」となっていても、while文とは異なり、最低1度はブロックの処理が実行される。
// 「While01.java」と「DoWhile01.java」で、変数の初期化を「int number = 100;」に変更して実行すると違いがわかる。 => DoWhile01 = 200