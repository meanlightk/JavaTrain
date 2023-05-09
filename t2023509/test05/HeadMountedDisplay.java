package t2023509.test05;

// 헤드마운트 디스플레이
import t2023509.test01.Wearable;
import t2023509.test02.Skinnable;

public class HeadMountedDisplay implements Wearable, Skinnable {
	private int skin; // 스킨

	// 착용
	public void putOn() {
		System.out.println("디스플레이를 착용했습니다.");

	}

	// 해제
	public void putOff() {
		System.out.println("디스플레이를 벗었습니다.");
	}

	// 스킨 변경
	public void changeSkin() {
		switch (skin) {
		case BLACK:
			System.out.println("BLACK DISPLAY");
			break;
		case RED:
			System.out.println("RED DIAPLAY");
			break;
		case GREEN:
			System.out.println("GREEN DISPLAY");
			break;
		case BLUE:
			System.out.println("BLUE DISPLAY");
			break;
		case YELLOW:
			System.out.println("YELLOW DISPLAY");
			break;
		}

	}

	@Override
	public void changeSkin(int skin) {

	}

	public void putSkin() {

	}
}
