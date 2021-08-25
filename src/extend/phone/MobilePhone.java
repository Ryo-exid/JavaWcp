package extend.phone;

public class MobilePhone implements Phone, Camera {
	private String number;
	
	public MobilePhone(String number) {
		this.number = number;
	}
	
	public void takePicture () {
		System.out.println("写真を撮ります。");
	}
	
	public void call(String number) {
		System.out.println(this.number + " から " + number + " に電話をかけます。");
	}
}

// クラスによるインターフェース実装の基本構文

// 修飾子 class クラス名 implements インターフェース名, インターフェース名 {
//     // インターフェースを実装したメソッドなど
// }
