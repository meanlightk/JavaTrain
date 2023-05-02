package t2023501.test05;

//사람 클래스(ver.3)
public class Human {

	private String name;	// 이름
	private int height;		// 신장
	private int weight;		// 체중
	private Day birthday;	// 생일

	// --- 생성자 ---//
	Human(String name, int height, int weight, Day birthday) {
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
