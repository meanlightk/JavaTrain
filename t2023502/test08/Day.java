package t2023502.test08;

import java.util.Objects;

// 날짜 클래스 Day(ver.1)
public class Day {
	private int year = 1; // 년
	private int month = 1; // 월
	private int date = 1; // 일

	// --- 생성자 ---//
	public Day(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

//--- 년, 월, 일 불러오기 ---//
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

//--- 년,월,일 설정 ---//
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDate(int date) {
		this.date = date;
	}

	// --- 요일 찾기 ---//

	@Override
	public int hashCode() {
		return Objects.hash(date, month, year);
	}

	// --- 날짜 d와 같은가? ---//
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Day other = (Day) obj;
		return date == other.date && month == other.month && year == other.year;
	}

	// --- 문자열 표현 반환 ---//
	@Override
	public String toString() {
		return "Day [year=" + year + ", month=" + month + ", date=" + date + "]";
	}

}
