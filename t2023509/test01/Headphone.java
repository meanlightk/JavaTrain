package t2023509.test01;

// 헤드폰 클래스
public class Headphone implements Wearable {
	int volum = 0; // 볼륨

	public void putOn() {
		System.out.println("헤드폰을 착용했습니다.");

	}

	public void putOff() {
		System.out.println("헤드폰을 벗었습니다.");

	}

	public void setVolum(int volum) {
		this.volum = volum;
		System.out.println("볼륨을 " + volum + "로 변경했습니다.");
	}

}
