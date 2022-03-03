package kr.hs.study.main;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		// HelloWorld 객체 hello1 만들고 메서드 호출해서 hello 출력
		
		// HelloWorldEn hello1 = new HelloWorldEn();
		// HelloWorldKr hello1 = new HelloWorldKr();
		HelloWorld hello1 = new HelloWorldKr(); // 부모의 참조 변수로 자식 객체를 가리킴
		callMethod(hello1);
	}

	public static void callMethod (HelloWorld hello) { // static은 객체를 붙이지 않아도 실행 가능
		hello.sayHello();
	}
	
}
