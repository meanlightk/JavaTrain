// 배열의 나열 순서 섞기

package t2023421;

import java.util.Random;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
			Random rand = new Random();
			Scanner stdIn = new Scanner(System.in);

			
			System.out.println("요소 수: ");
			int n = stdIn.nextInt();
			int[] a = new int[n];
			
			for (int i = 0; i < n; i++) {
				System.out.println("a[" + i + "] = ");
				a[i] = stdIn.nextInt();
			}
			
			for(int i = 0; i < 2 * n; i++) {
				int idx1 = rand.nextInt(n);
				int idx2 = rand.nextInt(n);
				int t = a[idx1];
				a[idx1] = a[idx2];
				a[idx2] = t;
			}
			
			
		System.out.println("요소를 섞었습니다.");
		for(int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}
