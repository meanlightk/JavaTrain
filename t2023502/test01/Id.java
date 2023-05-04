package t2023502.test01;

// 일련 번호 클래스 (ver.1)
public class Id {

	static int counter = 0; // 몇 번까지 식별 번호를 부여했는가
	private int id; // 식별 번호

	public Id() {
		id = ++counter; // 식별 번호
	}

	// --- 식별 번호 가져오기 ---//
	public int getId() {
		return id;
	}
}
