package javajungsuk;

import java.util.Scanner;

public class Back11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// scanner 클래스 선언, 입력받는다.
		int n = sc.nextInt();
		// 숫자의 개수를 int형으로 입력받는다.
		String st = sc.next();
		// 숫자의 개수만큼 숫자들을 입력받는데, 
		// 이때 숫자는 정수형이 아니라 String형으로 입력받는다.
		sc.close();
		// 입력받는 클래스를 닫는다. 
		int sum = 0;
		// int형 변수 sum을 선언하고 0으로 초기화 한다.
		
		for(int i=0; i<n; i++) {
			// 숫자의 합의 계산할 반복문을 숫자의 개수인 n번만큼 반복 실행 
			sum += st.charAt(i) - '0';
			// string형식으로 받은 숫자를 charAt을 이용하여 char형식으로 바꿔준다,
			// charAt()을 이용하면 String형식으로 받은 문자열을 문자단위로 끊어서 출력해준다.
			// 다만, char형식을 int형식으로 변환하기 위해서는 
			// 아스키코드값을 빼줘야 하기에 
			// 0이나 48을 빼준다.
		}
		
		System.out.println(sum);
	
	}
}
