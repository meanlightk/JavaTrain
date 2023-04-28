package t2023428.test04_ver1;

// 2차원 좌표 클래스 (ver.1)
public class Coordinate {

	private double x;
	private double y;

	// --- 생성자 ---//
	Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// x좌표 가져오기
	double getX() {
		return x;
	}		

	// y좌표 가져오기
	double getY() {
		return y;
	}	

	// x좌표 설정
	void setX(double x) {
		this.x = x;
	}	

	// y좌표 설정
	void setY(double y) {
		this.y = y;
	}	

	//좌표 설정
	void set(double x, double y) {
		this.x = x;
		this.y = y;		
	}
}