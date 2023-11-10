package com.chap05_Date.run;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Run {
	//ctrl  + space 자동완성
	//ctrl + d 블럭친 부분의 줄 전체 삭제
	//alt  + 방향기 위/아래 블럭친 부분 줄 이동
	//ctrl + alt + 방향키 위/아래  블럭친 부분 줄 전체 복사

	public static void main(String[] args) {
		//1. Date(java.util)
		//현재 날짜, 시간을 가져올 때만 사용
		//밀리 세컨드 단위 (1초 = 1000ms)
		//deprecated된 클래스
		Date today = new Date();
		System.out.println(today);
		
		Date oriDay = new Date(1000L);
		System.out.println(oriDay);
		
		oriDay = new Date(100+19, 9-1, 9);
		//deprecated
		System.out.println(oriDay);
		
		//원하는 패턴으로 날짜 출력
		//SimpleDateFormat
		//java.text 패키지에 있다.
		//SimpleDateFormat의 객체를 생성하며 ()안에 원하는 형식을 적는다.
		//format 메소드를 이용한다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(today));
		
		//2. Calendar(java.util)
		//객체 생성이 불가하므로 getInstance() 이용해 객체를 생성한다.
		//(Calendar 클래스의 생성자가 protected기 때문이다.)
		System.out.println("--------------------------------------------------------------");
		
		Calendar calendar = Calendar.getInstance();
		//클래스명.메소드명() -> static
		System.out.println(calendar);
		calendar.set(2023, 10-1, 3);
		//month는 부를 때 1 적게 쓰고, 다른데 쓸 때는 1을 추가해서 넣는다.
		System.out.println(calendar);
		
		int year = calendar.get(1);
		int month = calendar.get(2)+1;
		//month = calendar.get(Calendar.MONTH)+1;
		//month는 부를 때 1 적게 쓰고, 다른데 쓸 때는 1을 추가해서 넣는다.
		int day = calendar.get(Calendar.DATE);
		System.out.println(year + "년");
		System.out.println(month  + "월");
		System.out.println(day  + "일");
		
		Calendar cal = (Calendar)calendar.clone();
		//clone 메소드의 결과물은 Object 타입으로 저장되므로, 다운캐스팅한다.
		cal.add(Calendar.YEAR, -9);//현재 연도로부터 9년 전
		cal.add(Calendar.MONTH, -4);//현재 월로부터 4달 전
		cal.add(Calendar.DATE, 10);//현재 일로부터 10일 후
		
		System.out.println(cal.getTime());
		System.out.println(sdf.format(cal.getTime()));//앞서 설정한 날짜 형식에 맞춰 시간을 갖고와 출력한다.
		
		//3. GregorianCalendar(java.util)
		//Calendar 클래스의 자식 클래스
		//그래서 Calendar와 매우 유사하다.
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println("year : " + gc.get(GregorianCalendar.YEAR));
		System.out.println("day : " + gc.get(Calendar.DATE));
		
		gc.set(2024, 4-1, 22);
		System.out.println(gc.getTime());
		
		System.out.println(new GregorianCalendar().isLeapYear(2024));
		//isLeapYear메소드는 윤년 확인하는 메소드
		//메소드 중 is가 앞에 붙는 메소드는 ()값을 주어진대로 계산해 true인지 false인지 확인하는 메소드
		
		
	}

}
