package t2023425;

// 정수를 좌우로 회전한 비트를 표시
import java.util.Scanner;

public class Test10 {
	static Scanner stdIn = new Scanner(System.in);

	// --- int형 비트 구성 --- //
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.println(((x >>> i & 1) == 1) ? '1' : '0');
	}

	// --- x를 오른쪽으로 n비트 회전한 값 반환 --- //
	static int rRotate(int x, int n) {
		if (n < 0)
			return lRotate(x, -n);
		n %= 32;
		return (n == 0 ? x : (x >>> n) | (x << (32 - n)));
	}

	// --- x를 왼쪽으로 n비트 회전한 값 반환 ---//
	static int lRotate(int x, int n) {
		if (n < 0)
			return rRotate(x, -n);
		n %= 32;
		return (n == 0 ? x : (x << n) | (x >>> (32 - n)));
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수x를 n비트 회전합니다.");
		System.out.println("x: ");int x = stdIn.nextInt();
		System.out.println("n: ");int n = stdIn.nextInt();
		System.out.println("회전 전 = ");	printBits(x);

		System.out.println("\n오른쪽 회전 = ");
		printBits(rRotate(x, n));
		System.out.println("\n왼쪽 회전 = ");
		printBits(lRotate(x, n));
		System.out.println();
	}
}