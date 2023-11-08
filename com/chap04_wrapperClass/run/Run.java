package com.chap04_wrapperClass.run;

public class Run {
	/* [Wrapper Class]
	 * 프로그램에 따라 기본 자료형의 데이터를 객체로 취급해야하는 경우 사용한다.
	 * 8개의 기본 자료형에 해당하는 객체로 포장해주는 클래스가 Wrapper Class이다.
	 * (boolean, byte, char, short, int, long, float, double)
	 * (Boolean, Byte, Character, Short, Integer, Long, Float, Double)
	 * 
	 * [Boxing]
	 * 기본 자료형을 해당 자료형의 Wrapper 클래스의 객체로 변환해주는 행위
	 * 즉, 해당 자료형의 Wrapper 클래스로 포장해준다.
	 * Wrapper 클래스로 포장하는 것은 자동으로 처리해준다. (AutoBoxing)
	 * 
	 * [UnBoxing]
	 * Wrapper 클래스의 객체를 다시 기본 자료형으로 변환해주는 행위
	 * 즉, 원래 자료형으로 포장을 벗겨준다.
	 * 기본 자료형으로 포장을 벗겨주는 것은 자동으로 처리해준다. (AutoUnBoxing)
	 */

	public static void main(String[] args) {
		//안쓰는 Wrapper 클래스 Boxing
		Integer i = new Integer(10);
		Integer i2 = new Integer(15);
		Double d = new Double(10.1);
		//deprecated 발생
		//동작은 하나 현재는 더이상 잘 쓰이지 않는 사장된 방식이다.
		
		//정확한 Wrapper 클래스 Boxing
		//해당 Wrapper Class 형태 변수명 = 값;
		//자동형변환이 일어난다.
		Short i3 = 10;
		Integer i4 = 5;
		Double d2 = 5.0;
		
		//객체 간 비교
		System.out.println(i == i2);
		//false 출력
		//객체 간의 비교는 equals 메소드를 사용해야한다.
		
		System.out.println(i.equals(i2));
		//true 출력
		System.out.println(i.compareTo(i2));
		//두 값을 비교한다.(숫자와 문자(char) 가능)
		//비교 원본 값(i)이 비교할 대상(i2)보다 작으면 음수 출력
		//비교 원본 값(i)이 비교할 대상(i2)보다 크면 양수 출력
		//비교 원본 값(i)이 비교할 대상(i2)과 같으면 0 출력
		
		//Wrapper 클래스 UnBoxing
		//해당 자료형 변수명 = Wrapper 클래스 변수명.해당 기본 자료형Value();
		////해당 자료형 변수명 = Wrapper 클래스 변수명 -> 자동형변환
		int a = i4.intValue();
		double b = d2.doubleValue();
		
		int a2 = i4;//자동형변환
		double b2 = d2;//자동형변환
		
		System.out.println(a2 + b2);
		
		abox(a2);
		//a2의 변환 과정
		//int -> 자동형변환 -> Integer(Wrapper 클래스 Integer) -> 다형성에의한 자동형변환(업캐스팅) -> Object(모든 클래스의 부모 클래스)

	}
	
	public static void abox(Object obj) {
		System.out.println(obj);
	}

}
