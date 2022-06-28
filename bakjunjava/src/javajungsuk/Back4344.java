package javajungsuk;

import java.util.Scanner;

public class Back4344 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		// 테스트 케이스를 입력받는다.
		int[] arr; 
		// 점수를 넣을 배열을 선언 
		
		for(int i=0; i < c; i++) {
			
			int n = sc.nextInt();
			// 학생의 수 입력받기 
			arr = new int[n];
			// 학생수만큼 배열을 생성
			double sum = 0; 
			// 성적의 총 합계 변수 선언 
			
			  for(int j = 0; j<n; j++) {
				  int score = sc.nextInt();
				  // 성적을 입력받기 
				  arr[j] = score;
				  // 배열에 입력받은 성적 저장 
				  sum += arr[j];
				  // 성적의 총 합계 저장 
			  }
			  
			  double avg = (sum/n);
			  // 성적의 평균 = 총합계 / 학생의 수 
			  double count = 0;
			  // 평균을 넘는 학생의 수 변수 선언 
			  
			  for(int k =0; k < n; k++) {
				  if(arr[k] > avg) {
					  // 만약 성적이 평균보다 높다면 
					  count++;
					  // 평균넘는 학생의 수를 증가시킨다.
				  }
			  }
			  
			  System.out.printf("%.3f%%\n" + (count/n) *100);
			  // 각 케이스마다 평균을 넘는 학생의 비율을 반올림 하여 소수점 셋째 자리까지 출력한다.
			  // printf("출력할 서식 " , 출력할 내용);
			  // 소수점 셋째자리까지 출력하기 위해서는 printf()를 사용하여 %.3f으로 지정해줘야 한다.
			  // printf에서 "%" 라는 문자를 출력하기 위해서는 %%로 적어줘야 출력된다. 
			  // 
		}
		
	}

}		  
		
