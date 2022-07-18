package javajungsuk;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Back1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 문자열을 입력받을것이기 때문에 scanner 클래스를 선언한다. 
		
		String str = sc.nextLine();
		// 대소문자로 된 영단어인 문자열을 입력받아 변수 str에 저장한다. 
		
		sc.close();
		// 더이상 입력받은 것이 없기에 scanner 클래스는 닫는다. 
		
		StringTokenizer st = new StringTokenizer(str, " ");
		// 입력된 영단어를 공백단위로 구분한다. 
		// 공백단위로 구분한 토큰들을 변수 st에 저장한다. 
		
		System.out.println(st.countTokens());
		// 토큰의 개수를 구한다 
		
		
		
	}
}
