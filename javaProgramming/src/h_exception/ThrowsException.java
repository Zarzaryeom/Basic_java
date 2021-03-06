package h_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {

		/*
		 * 메서드에 예외 선언하기
		 * - 메서드 호출시 발생할 수 있는 예외를 선언해줄 수 있다.
		 * - void method() throws IOException{}
		 * - 예외를 선언하면 예외처리를 하지 않고 자신을 홏ㄹ한 메서드로 예처리를 넘겨준다.
		*/
		
		
		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//								-> 메서드에 예외를 선언
	private static void method() throws IOException {
		throw new IOException();
	}

}
