package t2023501.test08;

// 사람 클래스 (ver.2)
public class Human {

	private String name; // 이름
	private int height;// 신장
	private int weight;// 체중

	// --- 생성자 ---//

	public Human(String n, int h, int w) {
		name = n;
		height = h;
		weight = w;
	}

	String getName() {
		return name;
	}

	int getHeight() {
		return height;
	}

	int getWeight() {
		return weight;
	}

	void gainWeight(int w) {
		weight += w;
	} // 살이 찐다

	void reduceWeight(int w) {
		weight -= w;
	} // 살이 빠진다
}
