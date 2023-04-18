// 읽은 정숫값들을 합산 (0이 입력되면 종료)

package t2023418;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.println("몇 개를 더할까요?: ");
		int n = stdIn.nextInt();  // 정수의 개수
		int sum = 0;             //합계
		int i;
		for(i=0; i < n; i++) {
			System.out.println("정수( 0으로 종료): ");
			int t = stdIn.nextInt();
			if (t == 0) break;  //for문을 빠져나감
			sum += t;
		}
		System.out.println("합계는 " + sum + "입니다.");
		if(i != 0)
			System.out.println("평균은 " + sum / i + "입니다.");
		}
	}
