package javajungsuk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1546 {

	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); 
		//  과목의 갯수를 입력받기 
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 과목의 점수들을 공백 기준으로 나눠서 받아야 하기에 StringTokenizer 클래스 생성 
		int max = 0;
		// 최댓값 변수 선언 
		double sum =0;
		// 과목의 합계 변수 선언 
		for(int i =0; i<n; i++) {
			int subject = Integer.parseInt(st.nextToken());
			// 반복문으로 과목의 갯수만큼 과목의 점수를 입력받기 
			
			if(subject > max) {
				max = subject;
				// 입력받는 과목의 점수에서 최댓값이 나오면 max에 대입하기 
			
			}
			
			sum += subject;
			
		}
		
		System.out.println((sum/max) * 100 /n);
 	}
}