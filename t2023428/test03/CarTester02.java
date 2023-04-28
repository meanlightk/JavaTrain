package t2023428.test03;

// 자듕차 클래스(ver.1) 이용 예(2: 대화형으로 자동차를 이동)
import java.util.Scanner;

public class CarTester02 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("차량 데이터를 입력하세요.");
		System.out.println("이  름: ");
		String name = stdIn.next();
		System.out.println("번  호: ");
		String number = stdIn.next();
		System.out.println("전  폭: ");
		int width = stdIn.nextInt();
		System.out.println("전  고: ");
		int height = stdIn.nextInt();
		System.out.println("전  징: ");
		int length = stdIn.nextInt();
		System.out.println("탱크용량: ");
		double tank = stdIn.nextDouble();
		System.out.println("연료량 : ");
		double fuel = stdIn.nextDouble();
		System.out.println("연  비: ");
		double sfc = stdIn.nextDouble();

		Car myCar = new Car(name, number, width, height, length, tank, fuel, sfc);

		while (true) {
			System.out.printf("현재 위치: (%2.f,%2.f\n", myCar.getX(), myCar.getY());
			System.out.printf("남은 연료: %2.f\n", myCar.getFuel());
			System.out.printf("이동하겠습니까? [0...No/1...Yes]:");
			if (stdIn.nextInt() == 0)
				break;

			System.out.println("X방향으로의 이동 거리:");
			double dx = stdIn.nextDouble();

			System.out.println("Y방향으로의 이동 거리:");
			double dy = stdIn.nextDouble();

			if (!myCar.move(dx, dy))
				System.out.println("연료 부족!!");

		}

	}

}
