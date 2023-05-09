package t2023509.test04;

import t2023509.test02.Skinnable;

// 스킨 변경이 가능한 로봇 애완견 클래스
public class SkinnableRobotPet extends RobotPet implements Skinnable {
	private int skin; // 스킨

	// 생성자
	public SkinnableRobotPet(String name, String masterName, int skin) {
		super(name, masterName); // 슈퍼 클래스의 생성자
		this.skin = skin;
	}

	// 스킨 변경
	@Override
	public void changeSkin(int skin) {
		this.skin = skin;

	}

	// 현재의 스킨을 표시
	public void printSkin() {
		switch (skin) {
		case BLACK:
			System.out.println("검정");
			break;
		case RED:
			System.out.println("빨강");
			break;
		case GREEN:
			System.out.println("초록");
			break;
		case BLUE:
			System.out.println("파랑");
			break;
		case YELLOW:
			System.out.println("노랑");
			break;
		}

	}

}
