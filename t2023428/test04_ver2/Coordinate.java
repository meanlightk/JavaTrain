package t2023428.test04_ver2;

// 2차원 좌표 클래스 Coordinate(ver.2)
public class Coordinate {

	private double x = 0.0;// x좌표
	private double y = 0.0; // y좌표

	// --- 생성자 ---//
	public Coordinate() {
	}

	public Coordinate(double x, double y) {
		set(x, y);
	}

	public Coordinate(Coordinate c) {
		this(c.x, c.y);
	}

	// x좌표 가져오기
	public double getX() {
		return x;
	}

	// y좌표 가져오기
	public double getY() {
		return y;
	}

	// x좌표 설정
	public void setX(double x) {
		this.x = x;
	}

	// y좌표 설정
	public void setY(double y) {
		this.y = y;
	}

	// 좌표 설정
	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public boolean equalsTo(Coordinate c) {
		return x == c.x && y == c.y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
