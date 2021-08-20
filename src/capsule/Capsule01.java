package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {
    public static void main(String[] args) {
        HumanNoCapsule human1 = new HumanNoCapsule("田中", 28); // 名前や年齢が変更禁止のカプセル化されていないインスタンスを生成
        // 変更禁止だが、アクセス制限がないので変更できてしまう
        human1.name = "今田";
        human1.age = 70;
        
        // 変更されてしまうので想定外の名前と年齢になってしまう
        System.out.println("名前は" + human1.name + ", 年齢は" + human1.age + "です。");
        
        
        HumanCapsule human2 = new HumanCapsule("小林", 32); // 名前や年齢が変更禁止のカプセル化されたインスタンスを生成
        System.out.println("名前は" + human2.getName() + ", 年齢は" + human2.getAge() + "です。"); // // 取得は、getterメソッドを使用する
        
        human2.setName("佐々木"); // 変更は、setterメソッドを使用する
        System.out.println("変更した名前は" + human2.getName() + "です。");
    }
}