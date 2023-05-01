package t2023501.test01;

//사람 클래스
public class Human {

	private String name;
	private int height;
	private int weight;

	// --- 생성자 ---//
	Human(String n, int h, int w) {
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

	void gainWeight(int w) {		// 살이 찐다
		weight += w;
	}

	void reduceWeight(int w) {		// 살이 빠진다
		weight -= w;
	}
}
