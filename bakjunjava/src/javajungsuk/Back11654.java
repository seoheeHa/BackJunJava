package javajungsuk;

import java.util.Scanner;

public class Back11654 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String asci = sc.next();
		// 문자나 숫자를 입력받아야 하기에 string 형으로 입력받는다.
		int result = asci.charAt(0);
		// string형을 charAt을 이용해 문자열을 문자로 만들고 
		//  그 값을 int형 변수에 저장한다.
		// 문자의 값을 int로 변환할 시 아스키 코드로 출력된다.
		System.out.println(result);
		// result값을 출력한다. 
		
		
		}
	}
