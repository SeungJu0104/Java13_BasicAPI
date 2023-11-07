package com.chap02_StringBufferStringBuilder.run;

public class Run {

	public static void main(String[] args) {
		//StringBuffer와 StringBuiler는 메소드가 동일
		StringBuilder sb = new StringBuilder("우리는 ");
		System.out.println(sb);
		System.out.println(sb.length());
		//length는 띄어쓰기(공백)도 카운트
		System.out.println("sb의 주소 값 : " + System.identityHashCode(sb));
		//StringBuffer와 동일하게 기존 위치에 값을 추가해 저장한다.
		
		sb.append("오늘도 ").append("열심히 ");
		//append 메소드 이용해 내용 추가 가능
		//append 메소드는 연속 사용도 가능하다.
		System.out.println(sb);
		System.out.println(sb.length());
		//length는 띄어쓰기(공백)도 카운트
		System.out.println("sb의 주소 값 : " + System.identityHashCode(sb));
		//StringBuffer와 동일하게 기존 위치에 값을 추가해 저장한다.
		
		sb.insert(0, "밥을 먹고 난 후 ");
		//insert(내용을 집어넣기 시작할 인덱스 위치, 집어넣을 내용);
		System.out.println(sb);
		sb.delete(0,2);
		//delete(삭제를 시작할 인덱스, 삭제를 종료할 인덱스);
		//종료할 인덱스 -1 의 위치까지 삭제한다.
		System.out.println(sb);
		sb.reverse();
		//역순으로 바꾼다.
		System.out.println(sb);
		
	}
	
}
