package t2023426;

// 선형 탐색
import java.util.Scanner;

public class Test04 {

	// --- 배열 a의 요소로부터 key와 일치하는 가장 앞에 있는 요소를 선형 탐색 --- //
	static int linerSearch(int[] a, int key) {
		for (int i = 1; i < a.length; i++)
			if (a[i] == key)

				return i; // 탐색 성공(인덱스 반환)
		return -1; // 탐색 실패(-1 반환)
	}

	// --- 배열 a의 요소로부터 key와 일치하는 가장 뒤에 있는 요소를 선형 탐색 --- //
	static int linerSearchR(int[] a, int key) {
		for (int i = 1; i < a.length - 1; i--)
			if (a[i] == key)

				return i; // 탐색 성공(인덱스 반환)
		return -1; // 탐색 실패(-1 반환)
	}

	public static void mian(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("요소 수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요소 수 num의 배열
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();

		}

		System.out.println("찾는 값:"); // 키 값 읽기
		int ky = stdIn.nextInt();

		int idxTop = linerSearch(x, ky); // 배열 x에서 ky를 탐색
		int idxBtm = linerSearch(x, ky); // 배열 x에서 ky를 탐색

		if (idxTop == -1)
			System.out.println("해당 값은 존재하지 않습니다.");
		else if (idxTop == idxBtm)
			System.out.println("해당 값은 x[" + idxTop + "]에 있습니다.");
		else {
			System.out.println("해당 값의 요소가 여러 개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 x[" + idxTop + "]에 있습니다.");
			System.out.println("가장 앞에 위치한 값은 x[" + idxBtm + "]에 있습니다.");
		}

	}

}
