// 정숫값을 읽어서 절대값을 표시(방법2)

package t2023412;

import java.util.Scanner;

public class Test02_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값:");
		int n = stdIn.nextInt();
		
		//if (조건식) 실행문 else 실행문
		if (n>=0)
			// n>=0이 true(참)일 때 실행한다.
			System.out.println("절대값은 "+n+"입니다.");
			else
				// n>=0이 false(거짓)일 때 실행한다.
				System.out.println("절대값은 "+ -n +"입니다.");
		


	}

}
