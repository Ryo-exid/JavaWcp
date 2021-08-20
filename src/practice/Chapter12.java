package practice;

public class Chapter12 {
	public static void main(String[] args) {
		NoCapsuleMan man = new NoCapsuleMan("瀬戸口", 24);
		System.out.println("名前は" + man.name + "です。");
		System.out.println("年齢は" + man.age + "歳です。");
		man.age = 25;
		System.out.println("誕生日を迎えたので、年齢が" + man.age + "歳になりました。");
	}
}
