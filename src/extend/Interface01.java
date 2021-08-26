package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	public static void main(String[] args) {
		// MobilePhoneインスタンスを生成
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
		
		System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。"); // Phoneインターフェースのフィールド（定数）を参照
	    mobilePhone.call("99-8888-7777"); // Phoneインターフェースの抽象メソッドを実装したメソッドを呼び出し
	    Interface01.classTakePicture(mobilePhone); // classTakePictureメソッドの呼び出し
	}
	
	// Cameraインターフェース実装したクラスは呼び出しできる
	public static void classTakePicture(Camera camera) {
		
		// アップキャストされた変数のメソッドを呼び出し
		camera.takePicture();
	}
}
