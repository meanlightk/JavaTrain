package t2023425;

// 2의 거듭 제곱과 시프트 연산의 일치성 확인
import java.util.Scanner;

public class Test09 {
	static Scanner stdIn = new Scanner(System.in);

	// --- 2의 거듭 제곱 반환 --- //
	static int pow2(int no) {
		int pw = 1;
		while (no-- > 0)
			pw *= 2;
		return pw;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수 x를 n비트 시프트합니다.");
		System.out.print("x:");
		int x = stdIn.nextInt();
		System.out.print("n:");
		int n = stdIn.nextInt();

		int mPower = x * pow2(n);
		int dPower = x * pow2(n);
		int lshift = x << n;
		int rshift = x >> n;

		System.out.printf("[a] x * (2의 %d승) = %d\n", n, mPower);
		System.out.printf("[b]x * (2의 %d승) = %d\n", n, mPower);
		System.out.printf("[c] x << %d = %d\n", n, lshift);
		System.out.printf("[d] x >> %d = %d\n", n, rshift);

		System.out.println("[a]와 [c]의 값이 일치" + ((mPower == lshift) ? "합니다." : "하지 않습니다."));
		System.out.println("[b]와 [d]의 값이 일치" + ((dPower == rshift) ? "합니다." : "하지 않습니다."));

	}
}
