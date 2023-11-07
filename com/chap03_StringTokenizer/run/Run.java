package com.chap03_StringTokenizer.run;

import java.util.StringTokenizer;

public class Run {
	/* [StringTokenizer]
	 * spilt()과 유사하나,
	 * 가장 큰 차이점은 spilt 메소드는 String 클래스의 메소드로, 추출한 문자를 배열로 저장한다. 객체 생성 X
	 * StringTokenizer는 자체로 하나의 클래스이고, 추출한 문자를 지정한 구분자별로 나누어 토큰으로 저장한다. 객체 생성 O
	 * split(나눌 구분자 기호)
	 * 
	 * StringTokenizer의 메소드
	 * nextToken() : 다음 토큰 읽기
	 * countToken() : 토큰의 개수
	 * hasMoreTokens() : 다음 토큰이 있는지 확인 후, true면 nextToken으로 다음 토큰을 읽어온다.
	 */

	public static void main(String[] args) {
		String str = "이창진,20,서울 광진구,남";
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("---------------------------------------------------------");
		
		String arr[] = str.split(",");//,를 구분자로해 나눈 결과 값을 arr 배열에 담는다.
		
		for(String res : arr) {//for(각 배열 값을 담을 변수 : 처음부터 끝까지 순환할 배열명) { 수행 내용 }
			System.out.println(res);
		}
		
	}

}
