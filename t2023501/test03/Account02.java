package t2023501.test03;

import t2023501.test02.Day;

public class Account02 {

	private String name;
	private String no;
	private long balance;
	private Day openDay;

	// --- 생성자 ---//
	public Account02(String n, String num, long z, Day d) {
		name = n;
		no = num;
		balance = z;
		openDay = new Day(d);
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}

	public Day getOpenday() {
		return new Day(openDay);
	}

	void deposite(long k) {
		balance += k;
	}

	void withdraw(long k) {
		balance -= k;
	}

	public String tostString() {
		return "{" + name + ", " + no + ", " + balance + "}";
	}

}
