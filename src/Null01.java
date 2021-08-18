
public class Null01 {
    public static void main(String[] args) {
        String string1;
        // ”あいう”の文字数を出力
        string1 = "あいう"; // 文字列をプログラム上に記述する場合はダブルクォーテーションを用いる
        System.out.println(string1 + "の文字数：" + string1.length());
        // ””（空文字）の文字数を出力
        string1 = "";
        System.out.println(string1 + "の文字数：" + string1.length());
        
//        // 以下、nullの変数を参照するとNullPointerExceptionのエラーが出力される処理
//        string1 = null;
//        System.out.println(string1 + "の文字数：" + string1.length());
    }
}
