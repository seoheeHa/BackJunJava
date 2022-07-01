package javajungsuk;

import java.util.Scanner;

public class Back1065 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(arithmetic_sequence(sc.nextInt()));
			sc.close();
	}

	private static int arithmetic_sequence(int num) { 
		// int num을 인자로 받는 arithmetic_sequence 라는 함수 선언
		int cnt =0; 
		// 한수의 개수 변수선언
		if( num < 100) {
			// 입력받는 num이 100보다 작을 경우 
			return num;
			// num을 return해준다.
		}
		
		else {
			cnt =99;
			// 만약에 입력받는 수가 100보다 크다면 
			// 한수의 개수를 99로 초기화 해주고 
			// (즉, 한수의 개수는 99부터 시작하는 거임)
			
			for(int i=100; i<=num; i++) {
				// 100부터 시작해 입력받는 수까지 반복하여 한수의 개수를 세어준다.
				
				// 이때, 자릿수를 변수로 둔다
				int hun = i /100; // 백의 자릿수(몫) 
				int ten = (i/10) % 10; // 십의 자릿수
				int one   = i %10; // 일의 자릿수 (나머지)
				
				if((hun - ten ) == (ten - one)) {
					// 각 자릿수가 수열을 이룬다면
					// 등차수열이기에 순서대로 감해준다.
					cnt++;
					//한수의 개수를 늘린다. 
				}
			}
		}
		
		
		
		return cnt;
		// 한수의 개수를 리턴한다.
	}
}
