package collection;

import java.util.ArrayList;
import java.util.List;

public class Chapter14 {
	public static void main(String[] args) {
		List<Character> party = new ArrayList<Character>(); // List型の「party」変数を生成
		
		// add」メソッドで「Soldier」と「Playboy」のインスタンスを追加
		party.add(new Soldier());
		party.add(new PlayBoy());
		
		Chapter14.partyAttack(party);
	}
	
	public static void partyAttack(List<Character> party) {
		for (Character character : party) {
			int hp = character.attack();
			System.out.println("ヒットポイント：" + hp);
		}
	}
}
