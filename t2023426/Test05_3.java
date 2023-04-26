package t2023426;

// 배열에 요소 삽입하기
import java.util.Scanner;

public class Test05_3 {

	// --- 배열 a에서 a[idx]부터 n개의 요소를 삭제 --- //
	static void aryIns(int[] a, int idx, int x) {
		if (idx >= 0 && idx < a.length) {
			for (int i = a.length - 1; i > idx; i--)
				a[i] = a[i - 1];
			a[idx] = x;
		}
	}

	public static void mian(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요소 수: ");
		int num = stdIn.nextInt();
		int[] a = new int[num]; 		// num 크기의 배열 생성

		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = stdIn.nextInt();

		}

		System.out.println("삽입할 요소의 인덱스: ");
		int idx = stdIn.nextInt();

		System.out.println("삽입할 값: ");
		int n = stdIn.nextInt();

		aryIns(a, idx, n); 				// 배열 a에서 a[idx]에 x를 삽입

		for (int i = 0; i < num; i++) 	// 배열 a표시
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
