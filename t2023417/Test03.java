// 양의 정숫값을 0까지 카운트다운 (for문)

package t2023417;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			System.out.println("카운트다운 합니다.");
			int x;
			do {
				System.out.println("양의 정숫값: ");
				x = stdIn.nextInt();	
				} while (x <= 0);
			
			for (; x >= 0 ; x --)
				System.out.println(x);     //x값을 표시
	}

}
