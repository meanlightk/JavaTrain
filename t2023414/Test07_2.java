// 지정한 개수만큼 *표시(방법2)

package t2023414;

import java.util.Scanner;

public class Test07_2 {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?:");
		int n = stdIn.nextInt();
		if(n>0) {
			int i = 0;
			while(i<n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		}
	}
}

