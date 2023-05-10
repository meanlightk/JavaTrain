package t2023508.test01;

import java.awt.geom.RectangularShape;

import t2023508.test02.Shape;

/**
 * AbstTriangle 클래스는 직각 이등변 삼각형을 나타내는 추상 클래스이다. 이 클래스는 도형을 나타내는 추상 클래스 Shape로 부터
 * 파생된 클래스이다. 추상 클래스이므로 인스턴스를 생성할 수 없다. 구 체적인 직각 이등변 삼각형 클래스는 이 클래스로부터 파생시킨다.
 * 
 * @author
 * @see Shape
 * @see TriangleLB TriangleLU TriangleRB TriangleRU
 */

public abstract class AbstTriangle extends Shape {
	/**
	 * 한 편의 길이를 나타내는 int형 필드
	 */
	private int length;

	/**
	 * 직각 이등변 삼각형을 생성하는 생성자이다. 한 변의 길이를 인수로 받는다.
	 * 
	 * @param length 생성할 이등변 삼각형의 한 변의 길이
	 */
	public AbstTriangle(int length) {
		setLength(length);
	}

	/**
	 * 한 변의 길이를 반환한다
	 * 
	 * @return 한 변의 길이
	 */
	public int getLength() {
		return length;
	}

	/**
	 * 한 변의 길이를 설정한다.
	 * 
	 * @param length 설정한 한 변의 길이
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * toString 메소드는 이등변 삼각형과 관련된 정보를 문자열로 반환한다.
	 * 
	 * @return 문자열 "AbstTriangle(length:3)"를 반환한다. 3 부분은 한 변의 길이에 해당하는 값이다.
	 */
	public String toString() {
		return "AbstTriangle(length:" + length + ")";
	}

	/**
	 * 
	 */
	public AbstTriangle() {
		super();
		// TODO Auto-generated constructor stub
	}

}

/**
 * TriangleLB 클래스는 좌하가 직각인 이등변 삼각형 클래스이다. 이 클래스는 직각 이등변 삼각형을 나타내는 추상 클래스
 * AbstTriangle로부터 파생된 클래스이다.
 * 
 * @author
 * @see Shape
 * @see AbstTriangle
 */
public class TriangleLB extends AbstTriangle {

	/**
	 * 좌하가 직각인 이등변 삼각형을 생성한다. 한 변의 길이를 인수로 받는다.
	 * 
	 * @param length 생성할 이등변 삼각형의 한 변의 길이
	 */
	public TriangleLB(int length) {
		super(length);
	}

	/**
	 * toString은 좌하가 직각인 삼각형의 정보를 문자열로 반환한다.
	 * 
	 * @return 문자열 "TriangleLB(length:3)"을 반환한다. 3부분은 길이에 해당하는 값이다.
	 */
	public String toString() {
		return "TriangleLB(length:" + getLength() + ")";
	}

	/**
	 * draw는 좌하가 직각인 삼각형을 그린다. 별표 '*'를 나열해서 그린다.
	 */

	public void draw() {
		for (int i = 1; i <= getLength(); i++) {
			for (int j = 1; j <= i; j++)
				System.out.println('*');
			System.out.println();

		}
	}

}

/**
 * TriangleLU 클래스는 좌상이 직각인 이등변 삼각형 클래스이다. 이 클래스는 직각 이등변 삼각형을 나타내는 추상 클래스
 * AbstTriangle로부터 파생된 클래스이다.
 * 
 * @author
 * @see Shape
 * @see AbstTriangle
 */
public class TriangleLU extends AbstTriangle {
	/**
	 * 좌상이 직각인 이등변 삼각형을 생성한다. 한 변의 길이를 인수로 받는다.
	 * 
	 * @param length 생성할 이등변 삼각형의 한 변의 길이
	 */
	public TriangleLU(int length) {
		super(length);
	}

	/**
	 * toString은 좌상이 직각인 삼격형의 정보를 문자열로 반환한다.
	 * 
	 * @return 문자열 "TriangleLU(length:3)"을 반환한다. 3부분은 길이에 해당하는 값이다.
	 */

	public String toString() {
		return "TriangleLU(length:" + getLength() + ")";
	}

	/**
	 * draw는 좌상이 직각인 삼각형을 그린다. 별표 '*'를 나열해서 그린다.
	 */
	public void draw() {
		for (int i = getLength(); i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.println('*');
			System.out.println();
			{

			}

		}
	}

	/**
	 * TriangleRB 클래스는 우하가 직각인 이등변 삼각형 클래스이다. 이 클래스는 직각 이등변 삼각형을 나타내는 추상 클래스
	 * AbsrTriangle로부터 파생된 클래스이다.
	 * 
	 * @author
	 * @see Shape
	 * @see AbstTriangle
	 */
	public class TriangleRB extends AbstTriangle {

		/**
		 * 우하가 직각인 이등변 삼각형을 생성한다. 한 변의 길이를 인수로 받는다.
		 * 
		 * @param length 생성할 이등변 삼각형의 한 변의 길이
		 */
		public TriangleRB(int length) {
			super(length);
		}

		/**
		 * toString은 우하가 직각인 삼각형의 정보를 문자열로 반환한다.
		 * 
		 * @return 문자열 "TriangleRB(length:3)"을 반환한다. 3부분은 길이에 해당하는 값이다.
		 */
		public String toString() {
			return "TriangleRB(length:" + getLength() + ")";
		}

		/**
		 * draw는 우하가 직각인 삼각형을 그린다. 별표 '*'를 나열해서 그린다.
		 */
		public void draw() {
			for (int i = 1; i <= getLength(); i++) {
				for (int j = 1; j <= getLength() - 1; j++)
					System.out.println(' ');
				for (int j = 1; j <= i; j++)
					System.out.println('*');
				System.out.println();

			}
		}
	}

	/**
	 * TriangleRU 클래스는 우상이 직각인 이등변 삼각형 클래스이다. 이 클래스는 직각 이등변 삼각형을 나타내는 추상 클래스
	 * AbstTriangle로부터 파생된 클래스이다.
	 * 
	 * @author
	 * @see Shape
	 * @see AbstTriangle
	 */

	public class TriangleRU extends AbstTriangle {

		/**
		 * 우상이 직각인 삼각형을 생성한다. 한 변의 길이를 인수로 받는다.
		 * 
		 * @param length 생성할 이등변 삼각형의 한 변의 길이
		 */

		public TriangleRU(int length) {
			super(length);

		}

		/**
		 * toString은 우상이 직각인 삼각형의 정보를 문자열로 반환한다.
		 * 
		 * @return 문자열 "TriangleRU(length:3)"을 반환한다. 3부분은 길이에 해당하는 값이다.
		 */

		public String toString() {
			return "TriangleRU(length:" + getLength() + ")";
		}

		/**
		 * draw는 우상이 직각인 삼각형을 그린다. 별표 '*'를 나열해서 그린다
		 */
		public void draw() {
			for (int i = getLength(); i >= 1; i--) {
				for (int j = 1; j <= getLength() - i; j++)
					System.out.println(' ');
				for (int j = 1; j <= 1; j++)
					System.out.println('*');
				System.out.println();

			}
		}

	}
}
