package t2023510.test05;

// 문자열을 한 글자씩 확인해서 문자 코드로 표시
import java.util.Scanner;

public class StringCode {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("문자열s:");
		String s = stdIn.next();

		for (int i = 0; i < s.length(); i++) {
			System.out.printf("s[%d] = %c %4x \n", i, s.charAt(i), (int) s.charAt(i));

		}

	}

}
