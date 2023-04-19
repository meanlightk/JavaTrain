// 10진수를 읽어서 8진수, 16진수로 표시(방법2)

package t2023419;

import java.util.Scanner;

public class Test04_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수: ");
		int x = stdIn.nextInt();
		
		System.out.printf("8진수는 %o이고 16진수는 %x입니다.\n", x, x);
	}
}
