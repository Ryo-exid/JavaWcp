
public class Chapter06 {
	public static void main(String[] args) {
		int val;
		val = 2 + 5;
		System.out.println(val);
		
		val++;
		System.out.println(val);
		
		val *= 5;
		System.out.println(val);
		
		boolean bool = (val == 50);
		System.out.println(bool);
		
//		変数「bool」に「valは50より小さい AND valを10で割った余りが0」を演算した結果を代入して、値を出力
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}
}
