package t2023428.test04_ver1;

// 2차원  좌표 클래스 Coordinate(ver.1) 사용 (방법3 : 배열 / 오류) 
import java.util.Scanner;

public class CoordinateTester03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("좌표는 몇 개: ");
		int n = stdIn.nextInt();

		Coordinate[] a = new Coordinate[n]; // 요소 수 n인 Coordinate형 배열

		for (int i = 0; i < a.length; i++)
			a[i].set(5.5, 7.7);		// 모든 요소를 (5.5 , 7.7)로 설정

		for (int i = 0; i < a.length; i++)
			System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());

	}

}
