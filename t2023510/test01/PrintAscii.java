package t2023510.test01;

// 영문, 숫자와 기호를 문자와 코드로 표시
public class PrintAscii {
	public static void main(String[] args) {
		for (char i = 0x21; i <= 0x75; i++)
			System.out.printf("%c %04x\n", i, (int) i);

	}

}
