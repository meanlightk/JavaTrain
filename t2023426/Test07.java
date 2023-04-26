package t2023426;

// 배열의 복사본 작석
import java.util.Scanner;

public class Test07 {

	// --- 배열 a의 복사본을 생성해서 반환 --- //
	static int[] arrayExample(int[] a) {
		int[] c = new int[a.length];
		for (int i = 0; i < c.length; i++)
			c[i] = a[i];
		return c;

	}

	public static void mian(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요소 수: ");
		int num = stdIn.nextInt();

		int[] x = new int[num];		 // num 크기의 배열 생성

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		int[] y = arrayExample(x);
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		for (int i = 0; i < num; i++)
			System.out.println("y[" + i + "] = " + y[i]);
	}

}
