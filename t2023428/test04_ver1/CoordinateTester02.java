package t2023428.test04_ver1;

// 2차원  좌표 클래스 Coordinate(ver.1) 사용 (방법2 : 동일성 판정) 
import java.util.Scanner;

public class CoordinateTester02 {
	static boolean compCoordinate(Coordinate c1, Coordinate c2) {
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		double x, y;
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표:");
		x = stdIn.nextDouble();
		System.out.print("Y좌표:");
		y = stdIn.nextDouble();
		Coordinate p = new Coordinate(x, y);

		System.out.println("좌표 q를 입력하세요.");
		System.out.println("X좌표");
		x = stdIn.nextDouble();
		System.out.println("Y좌표");
		y = stdIn.nextDouble();
		Coordinate q = new Coordinate(x, y);

		System.out.println((p == q) ? "p == q입니다" : "p != q 입니다.");

		System.out.println(p.getX() == q.getX() && p.getY() == q.getY() ? "p 와 q가 같습니다." : "p 와 q 가 다릅니다.");

		System.out.println(compCoordinate(p, q) ? "p 와 q가 같습니다." : "p 와 q 가 다릅니다.");

	}

}
