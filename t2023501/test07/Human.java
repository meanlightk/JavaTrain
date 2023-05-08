package t2023501.test07;

// 사람 클래스 (ver.4)
public class Human {

	private static int counter = 0; // 몇 번까지 식별 번호를 부여했는가
	private String name; // 이름
	private int height; // 신장
	private int weight; // 체중
	private int id; // 식별 번호

	// --- 생성자 ---//
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;

	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public int getId() {
		return id;
	}

	// --- 데이터 표시 ---//
	public void putData() {
		System.out.println("이름:" + name);
		System.out.println("신장:" + height + "cm");
		System.out.println("체중:" + weight + "kg");

	}
}
