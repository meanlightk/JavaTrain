package t2023427;

// 2차원 배열의 복사본 생성
import java.util.Scanner;

public class Test06 {

	// --- 2차원 배열 a의 복사본을 생성해서 반환 ---//
	static int[][] arrayReturn(int[][] a) {
		int[][] c = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			c[i] = new int[a[i].length];
			for (int j = 0; j < a.length; j++)
				c[i][j] = a[i][j];
		}
		return c;
	}

	// --- 행렬 m의 모든 요소를 표시 ---//
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.println(m[i][j] + "");
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("행렬의 행 수: ");
		int height = stdIn.nextInt();
		System.out.println("행렬의 열 수: ");
		int width = stdIn.nextInt();

		int[][] a = new int[height][width];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.printf("a[%d][%d]:", i, j);
				a[i][j] = stdIn.nextInt();
			}
		}
		int[][] ca = arrayReturn(a);
		System.out.println("행렬a");
		printMatrix(a);

		System.out.println("행렬a의 복사본");
		printMatrix(ca);

	}
}
