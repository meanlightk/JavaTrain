package t2023428.test03;

public class CarTester01 {

	public static void main(String[] args) {

		Car k3 = new Car("k3", "서울999-99", 1600, 1500, 3640, 40.0, 35.0, 12.0);
		Car k5 = new Car("k5", "서울999-98", 1600, 1525, 3695, 41.0, 35.0, 12.0);

		k3.putSpec(); // k3의 사양 표시
		System.out.println();
		k5.putSpec(); // k5의 사양 표시
	}

}