package t2023501.test05;

import t2023501.test02.Day;

//사람 클래스(ver.3)
public class Human {

	private String name; // 이름
	private int height; // 신장
	private int weight; // 체중
	private Day birthday; // 생일

	// --- 생성자 ---//
	public Human(String name, int height, int weight, Day birthday) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthday = new Day(birthday);

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

	public Day getBirthday() {
		return new Day(birthday);
	}

	public void gainWeight1(int w) {
		weight += w;
	}

	public void reduceWeight1(int w) {
		weight -= w;
	}

	// ---
	String getName1() {
		return name;
	}

	int getHeight1() {
		return height;
	}

	int getWeight1() {
		return weight;
	}

	void gainWeight(int w) { // 살이 찐다
		weight += w;
	}

	void reduceWeight(int w) { // 살이 빠진다
		weight -= w;
	}

	// --- 데이터 표시 ---//
	public void putData() {
		System.out.println("이름:" + name);
		System.out.println("신장:" + height + "cm");
		System.out.println("체중:" + weight + "kg");
	}

	// --- 문자열화 ---//
	public String tostString() {
		return "{" + name + ": " + height + "cm" + weight + "kg " + birthday + "출생}";

	}
}
