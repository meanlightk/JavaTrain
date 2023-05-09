package t2023509.test06;

// DVD 플레이어 클래스
public class DVDPlayer implements EXPlayer {

	public void play() { // 재생
		System.out.println("DVD 재생 시작!");
	}

	public void stop() { // 정지
		System.out.println("DVD 재생 종료!");
	}

	public void slow() { // 느린 재생
		System.out.println("DVD 느린 재생 시작!");
	}

}
