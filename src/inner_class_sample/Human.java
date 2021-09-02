package inner_class_sample;

public class Human {
	public class HumanLeg {
		public void kick() {
			System.out.println("蹴る");
		}
	}
}

// 実行すると次のようになる

// new Human().new HumanLeg().kick();


// 上記は以下のコードがまとめられたもの

// Human human = new Human();
// Human.HumanLeg leg = human.new HumanLeg();
// leg.kick();
