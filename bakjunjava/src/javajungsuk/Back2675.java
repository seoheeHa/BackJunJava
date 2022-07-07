package javajungsuk;

import java.util.Scanner;

public class Back2675 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
	
		int testcase = sc.nextInt();
		// 입력받은 테스트 케이스만큼 반복한다. 
	
		for(int i=0; i<testcase; i++) {
			// 테스트 케이스 만큼 반복한다. 
			int n = sc.nextInt();
			// 반복할 횟수를 입력받는다. 
			String str = sc.next();
			// 문자열을 입력받는다. 
			
			for(int j =0; j<str.length(); j++) {
				// 문자열 길이만큼 반복한다. 
				for(int k=0; k<n; k++) {
					// 입력받은 반복할 횟수만큼 해당 문자의 글자를 반복한다. 
					System.out.print(str.charAt(j));
					// 문자열을 charAt으로 문자로서 쪼개고 
					// 해당 문자를 입력받은 반복횟수만큼 반복해서 출력한다.
					// 이때, 하나의 문자열을 받을 경우 출력시 한줄에 나오도록 해야하기에 
					// println이 아닌 print를 사용한다. 
				}
			}
 			
			System.out.println();
			// 한 문자열을 출력하는 것을 끝내면 줄바꿈을 시작한다 . 
			
		}
	}
}