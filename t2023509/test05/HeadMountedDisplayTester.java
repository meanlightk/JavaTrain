package t2023509.test05;

import t2023509.test01.Wearable;
import t2023509.test02.Skinnable;

// 헤드마운트 디스플레이 사용 

public class HeadMountedDisplayTester {
	public static void main(String[] args) {

		HeadMountedDisplay hmd = new HeadMountedDisplay();
		hmd.putOn(); // 착용
		hmd.putOff(); // 해제
		hmd.changeSkin(Skinnable.YELLOW);
		hmd.putSkin();

		Wearable w = hmd;
		w.putOn(); // 착용
		w.putOff(); // 해제

		Skinnable s = hmd;
		s.changeSkin(Skinnable.BLACK); // 스킨 변경

		hmd.putSkin(); // 스킨 표시

	}
}