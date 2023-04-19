// 10진수를 읽어서 8진수, 16진수로 표시(방법1)

package t2023419;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수: ");
		int x = stdIn.nextInt();
		
		System.out.printf("8진수는 %o입니다.\n", x);
		System.out.printf("16진수는 %x입니다.\n", x);
	}
}
