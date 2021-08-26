package practice;

import extend.phone.MobilePhone;
import extend.phone.Phone;

public class Chapter13 {
	public static void main(String[] args) {
		// MobilePhoneインスタンスを生成
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
		mobilePhone.takePicture();
		Chapter13.staticCall(mobilePhone, "99-8888-7777");
		mobilePhone.powerOff();
		
		// flyingPhoneインスタンスを生成
		FlyingPhone fryingPhone = new FlyingPhone(5);
		fryingPhone.fly();
		Chapter13.staticCall(fryingPhone, "000-1111-2222");
		fryingPhone.powerOff();
	}
	
	public static void staticCall(Phone phone, String number) {
		phone.call(number);
	}
}
