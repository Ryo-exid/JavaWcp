package inner_class_sample;

public class Constants {
	
	//内部クラスCatの中に、猫関係の定数を定義
	public static class Cat {
		public static final String NAME = "猫";
		public static final int LEG_COUNT = 4;
	}
	
	//内部クラスOctopusの中に、タコ関係の定数を定義
	public static class Octopus {
		public static final String NAME = "タコ";
		public static final int LEG_COUNT = 8;
	}
}

// この定数を扱うコードは以下のようになる
// System.out.println(Constants.Cat.NAME);
// System.out.println(Constants.Cat.LEG_COUNT);
// System.out.println(Constants.Octopus.NAME);
// System.out.println(Constants.Octopus.LEG_COUNT);
