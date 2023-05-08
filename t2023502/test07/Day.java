package t2023502.test07;

// 날짜 클래스 Day (ver.2)
public class Day {

	private int year = 1; // 연
	private int month = 1; // 월
	private int date = 1; // 일

	// --- 각 월의 일수 ---//
	private static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };

	// --- y년은 윤년인가? ---//
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}

	// --- y년 m월의 일 수(28/29/30/31) ---//
	private static int dayOfMonth(int y, int m) {
		return mdays[isLeap(y) ? 1 : 0][m - 1];
	}

	// --- 조정된 m월 (1~12 범위 외의 값을 조정) ---//
	private static int adjustedMonth(int m) {
		return m < 1 ? 1 : m > 12 ? 12 : m;

	}

	// --- 조정된 y년 m월의 d일 (1~28/29/30/31 범위 외의 값을 조정) ---//
	private static int adjustedMonth(int y, int m, int d) {
		if (d < 1)
			return 1;
		int dMax = dayOfMonth(y, m);
		return d > dMax ? dMax : d;
	}
	// --- 생성자( 오늘 날짜 ) ---//

	public Day(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	// --- 생성자(year년 1월 1일) ---//
	public Day(int year) {
		this.year = year;

	}

	// --- 생성자 (year년 month월 1일)
	public Day(int year, int month) {
		this(year);
		this.month = adjustedMonth(month);
	}

	// --- 생성자 (year년 month월 date일)
	//public Day(int year, int month, int date) {
		//this(year, month);
		//this.date = adjustedMonth(year, this.month, date);
	//}

	// --- 생성자 (d와 같은 날짜) ---//
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

}
