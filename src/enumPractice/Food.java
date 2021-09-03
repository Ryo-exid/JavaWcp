package enumPractice;

public enum Food {
	
	FRENCH_FRIES(100) {
		@Override
		void advertise() {
			// フライドポテト用のadvertiseの実装
			System.out.println("フライドポテトが" + getPrice() + "円！");

		}
	},
	
	BURGER(200) {
		@Override
		void advertise() {
			// ハンバーガー用のadvertiseの実装
			System.out.println("ハンバーガーが" + getPrice() + "円！");
		}
	},
	
	NUGGET(300) {
		@Override
		void advertise() {
			// ナゲット用のadvertiseの実装
			System.out.println("ナゲットが" + getPrice() + "円！");
		}
	},
	;
	
	private int price;
	
	private Food(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	// 宣伝文句を出力する抽象メソッド。各インスタンスで実装する
	abstract void advertise();
	
}
