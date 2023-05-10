package t2023510.test09;

// 부동소수점값을 임의의 자릿수로 표시
import java.util.Scanner;

public class PrintDouble {
	// 부동소수점값 x를 소수점 이하 9자리, 전체를 적어도 w자리로 표시
	static void PrintDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("실숫값:");
		double x = stdIn.nextDouble();

		System.out.println("전체 자릿수:");
		int w = stdIn.nextInt();

		System.out.println("소숫점 이하 자릿수:");
		int p = stdIn.nextInt();

		PrintDouble(x, p, w);
		System.out.println();

	}
}
