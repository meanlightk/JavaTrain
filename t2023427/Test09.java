package t2023427;

// 정수형의 내부 비트를 표시하는 메소드(다중 정의)
import java.util.Scanner;

public class Test09 {

	// byte형의 비트 구성 표시//
	static void printsBits(byte x) {
		for (int i = 7; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	// short형의 비트 구성 표시//
	static void printsBits(short x) {
		for (int i = 15; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	// int형의 비트 구성 표시//
	static void printsBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	// long형의 비트 구성 표시//
	static void printsBits(long x) {
		for (int i = 63; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("byte형 정수 a의 값");
		byte a = stdIn.nextByte();
		System.out.print("short형 정수 b의 값");
		byte b = stdIn.nextByte();
		System.out.print("int형 정수 c의 값");
		byte c = stdIn.nextByte();
		System.out.print("long형 정수 d의 값");
		byte d = stdIn.nextByte();

		System.out.println("a의 비트:");
		printsBits(a);
		System.out.println("\nb의 비트:");
		printsBits(b);
		System.out.println("\nc의 비트:");
		printsBits(c);
		System.out.println("\nd의 비트:");
		printsBits(d);
		System.out.println();
	}

}
