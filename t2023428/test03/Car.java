package t2023428.test03;

public class Car {

	private String name;
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;

	// --- 생성자 ---//
	Car(String name, String number, int widthm, int height, int length, double tankage, double fuel, double sfc) {
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.tankage = tankage;

		// 남은 연료의 최대값은 탱크 용량과 동일
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc = sfc;
		x = y = 0.0;

	}

	double getX() {
		return x;
	} // 현재 위치의 x좌표 불러오기

	double getY() {
		return y;
	} // 현재 위치의 y좌표 불러오기

	double getFuel() {
		return fuel;
	} // 남은 연료 불러오기

	// --- 사양 표시 ---//
	void putSpec() {
		System.out.println("이름" + name);
		System.out.println("번호" + number);
		System.out.println("전폭" + width + "mm");
		System.out.println("전고" + height + "mm");
		System.out.println("전장" + length + "mm");
		System.out.println("탱크" + tankage + "리터");
		System.out.println("연비" + sfc + "km/리터");
	}

	// --- x방향으로 dx, y방향으로 dy이동 ---//
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy); // 이동거리
		double f = dist / sfc;		// 이동에 필요한 연료

		if (f > fuel)
			return false;		// 이동할 수 없다 => 연료부족
		else {
			fuel -= f;			// 이동 거리분만큼 연료가 준다
			x += dx;
			y += dy;
			return true;		// 이동 완료
		}

	}

	// --- df 리터 급유 ---//
	void refuel(double df) {
		if (df > 0) {
			fuel += df;
			if (fuel > tankage)
				fuel = tankage;
		}
	}
}
