// 입력한 정수의 부호를 판정

package t2023424;

public class Test09_2 {
	
	static int signOf(int n) {
		if(n > 0)
			return 1;
		else if(n < 0)
			return -1;
		return 0;
	}
}
