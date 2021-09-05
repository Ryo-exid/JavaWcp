package collection;

public class PlayBoy implements Character{
	// インターフェースのメソッドを「Playboy」用オーバーライド
	public int attack() {
		System.out.println("遊び人は、ただ遊んでいるだけだった！");
		return 0;
	}
}
