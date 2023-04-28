package t2023428.test02;

public class HumanTester {

	public static void main(String[] args) {

		Human gilgong = new Human("길동", 170, 60);
		Human chulsu = new Human("철수", 166, 72);

		gilgong.gainWeight(3); // 길동이 3kg가 쪘다
		chulsu.reduceWeight(5); // 철수가 5kg 빠졌다

		System.out.println("이름: " + gilgong.getName());
		System.out.println("신장: " + gilgong.getHeight() + "cm");
		System.out.println("체중: " + gilgong.getWeight() + "kg");
		System.out.println();

		System.out.println("이름: " + chulsu.getName());
		System.out.println("신장: " + chulsu.getHeight() + "cm");
		System.out.println("체중: " + chulsu.getWeight() + "kg");

	}

}
