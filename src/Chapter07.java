
public class Chapter07 {
	public static void main(String[] args) {
		int distance = 10; // 距離を表すint型の変数を定義し、任意の値で初期化
		if (distance <= 5) {
			System.out.println("とても近いです"); // 距離が5km以下の場合は "とても近いです" を出力
		} else if (distance <= 10) {
			System.out.println("近いです");
		} else if (distance <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String color = "yellow"; // 信号の色を表すString型の変数を定義し、 red/yellow/blueのいずれかで初期化
		switch(color) {
		case "red":
			System.out.println("赤信号です"); // 色がredの場合は "赤信号です" を出力
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}
