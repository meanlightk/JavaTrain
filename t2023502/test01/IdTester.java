package t2023502.test01;

// 일련 번호 클래스 (ver.1)
public class IdTester {

	public static void main(String[] args) {

		Id a = new Id(); // 식별 번호 1번
		Id b = new Id(); // 식별 번호 2번

		System.out.println("a의 식별번호:" + a.getId());
		System.out.println("b의 식별번호:" + b.getId());

		System.out.println("Id.counter =" + Id.counter);
		System.out.println("a.counter =" + a.counter);
		System.out.println("b.counter =" + b.counter);

	}

}
