package progate;

public class Dojo2 {
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle("ビアンキ", "赤");
		System.out.println("【自転車の情報】");
		bicycle.printData();		
		System.out.println("-----------------");
		bicycle.run(10);
	}
}
