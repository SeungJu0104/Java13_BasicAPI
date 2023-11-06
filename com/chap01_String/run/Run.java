package com.chap01_String.run;

public class Run {
	/* API : 응용 프로그래밍 인터페이스 (Application Programming Interface)
	 * 		운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스
	 * 		자바를 쓰며 쉽게 코딩할 수 있도록 기능들을 만든 것
	 * 
	 * String 클래스 : 문자열 값은 수정 불가능하다.
	 * 				 수정 시 문자열이 새로 할당되어 새 주소를 넘긴다.
	 * 				 (레퍼런스 변수에 이전 주소를 지워 연결을 끊고, 새 주소를 담는다.)
	 */
	
	public static void main(String[] args) {
		//static 메소드 실행
		//클래스명.메소드명(매개변수 있으면 매개변수);
		//또는 메소드명(매개변수 있으면 매개변수);
		
		//method1();
		method2();
		
	}
	
	public static void method1() {
		//String 클래스
		
		//1.문자열을 리터럴로 생성
		String str1 = "abc";
		String str2 = "abc";
		String str5 = "ab";
		//문자열을 리터럴로 생성하면 메모리의 String pool을 만들고 거기에 문자열 값과 주소를 저장한다.
		//동일 문자열을 리터럴로 생성하면 먼저 String pool에 같은 값이 있는지 찾고
		//있으면 같은 주소를 레퍼런스 변수에 저장한다.
		//Sting pool에 있는 값과 주소를 공유 (싱글톤 패턴)
		//그래서 같은 고유 해시코드 값을 갖는다.
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str5);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str5.hashCode());
		//String 클래스의 오버라이딩된 hashCode 메소드는 값이 같으면 같은 해시코드를 출력하도록 되어있다.
		
		//String 클래스에서 오버라이딩된 hashCode()가 아닌 객체별 고유 hashCode를 출력.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str5));
		//str1, str2의 고유해시코드가 동일하게 나온다.
		
		System.out.println("-------------------------------------------------------------------------");
		
		//2. 생성자 통한 문자열 생성
		String str3 = new String("abc");
		String str4 = new String("abc");
		//String pool을 거치지 않고 새로운 객체를 생성해 그 주소 값을 레퍼런스 값에 담으므로
		//리터럴과는 다른 고유 해시코드 값을 갖는다.
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		//str1, str2의 해시코드와 일치
		//String 클래스의 오버라이딩된 hashCode 메소드는 값이 같으면 같은 해시코드를 출력하도록 되어있다.
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		//str1, str2의 고유 해시코드는 동일하게 나왔지만 str3, str4의 고유 해시코드는 각각 다르게 나온다.
		
		//고유 해시코드가 같으면 같은 값으로 본다.
		
	}
	
	public static void method2() {
		
		System.out.println("-------------------------------------------------------------");
		
		String str = "오후수업 시작";
		System.out.println("str : " + str + ", 주소 : " + System.identityHashCode(str));
		
		str += " 화이팅!";
		System.out.println("str 추가 후 : " + str + ", 주소 : " + System.identityHashCode(str));
		//추가전 str의 고유 해시코드가 추가 후와 다르다.
		//기존 주소에 변경 값이 저장되는 것이 아닌 변경 값은 새로운 공간을 생성해 새로운 주소 값을 저장한다.
		//즉, String의 문자열 값은 수정 불가능하다는 의미이다.
		//(수정을 하면 기존 공간과 연결을 끊고 새로운 공간을 만들어 해당 문자열을 담고 새 주소를 레퍼런스 변수에 담는다.)
		
		System.out.println("-------------------------------------------------------------");
		
		//StringBuffer, StringBuilder
		StringBuffer sbf = new StringBuffer("현재는 4교시");
		System.out.println("sbf : " + sbf + ", 주소 : " + System.identityHashCode(sbf));
		
		sbf.append("잠이 오면...");
		System.out.println("sbf 추가 후 : " + sbf  + ", 주소 : " + System.identityHashCode(sbf));
		//sbf의 추가 전과 추가 후의 고유 해시코드가 동일하다.
		//StringBuffer, StringBuilder는 값을 수정 가능하다.
		//기존에 생성된 StringBuffer 객체 공간에 그대로 값이 추가되어 수정되었기때문에 레퍼런스 sbf가 갖고 있는주소값도 변경되지 않았고, 고유 해시코드도 똑같이 출력된다.
	}
	
	

}
