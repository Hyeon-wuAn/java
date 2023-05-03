package day07;

class Weapon {
	int fire() {
		return 1;
	}
	
//	int fire(int damage) {
//		return damage;
//	}
}
class Canon extends Weapon {
	
	@Override
	int fire() {
		return 10; // 1메소드 이름, 매개변수 타입, 갯수, 리턴타입이 모두 동일해야함.
	}
}
public class OverRidingTest {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		int weaponDamage = weapon.fire();
		System.out.println("Weapon의 데미지는 "+weaponDamage);
		
		// 동적 바인딩.
		weapon = new Canon();
		int canonDamage = weapon.fire();
		System.out.println("Canon의 데미지는 "+canonDamage);
	}
}
