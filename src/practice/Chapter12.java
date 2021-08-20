package practice;

public class Chapter12 {
	public static void main(String[] args) {
		CapsuleMan man = new CapsuleMan("瀬戸口", 24);
		System.out.println("名前は" + man.getName() + "です。");
		System.out.println("年齢は" + man.getAge() + "歳です。");
		man.setAge(25);
		System.out.println("誕生日を迎えたので、年齢が" + man.getAge() + "歳になりました。");
	}
}
