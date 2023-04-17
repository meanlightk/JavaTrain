// 읽은 개수만큼 *을 표시 (5개 단위로 줄 바꿈)(방법1)

package t2023417;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			System.out.print("몇 개의 *를 표시할까요?: ");
			int n = stdIn.nextInt();
			if(n>0) {
				for (int i=0; i < n; i++) {
					System.out.println('*');
					if(i%5 == 4)
						System.out.println();
				}
				if(n%5 !=0)
					System.out.println();
			}
	}

}
