package t2023509.test02;

public class SkinnableSoftware implements Skinnable {

	int skin;

	// 생성자
	public SkinnableSoftware() {
		this.skin = BLACK;
	}

	public SkinnableSoftware(int skin) {
		this.skin = skin;
	}

	@Override
	public void changeSkin(int skin) {
		this.skin = skin; // 스킨 변경

	}

	public int getSkin() {
		return skin; // 스킨 가져오기
	}

	public String getSkinstString() { // 스킨의 문자열 반환
		switch (skin) {
		case BLACK:
			return "BLACK";
		case RED:
			return "RED";
		case GREEN:
			return "GREEN";
		case BLUE:
			return "BLUE";
		case YELLOW:
			return "YELLOW";
		}
		return "";
	}

}
