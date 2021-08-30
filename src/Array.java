import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] num = {3, 5, 1, 2, 4, 7, 6};
		Arrays.sort(num); // 配列を昇順に並び替え
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
