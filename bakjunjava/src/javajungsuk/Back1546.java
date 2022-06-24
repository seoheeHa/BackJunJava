package javajungsuk;

import java.util.Scanner;

public class Back1546 {


	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        // 과목의 개수를 입력받는다.
	        float[] subject = new float[n];
	        // 입력받은 개수만큼 과목의 점수를 배열로 설정한다.
	        float max = 0;
	        // 최대값 변수 선언
	        float avg = 0;
	        // 평균값 변수 선언 
	        
	        for(int i=0; i <subject.length; i++){
	            subject[i] = sc.nextInt();
	            // 입력받은 수를 과목 배열에 반복문을 통해 삽입한다.
	            if(subject[i] > max){
	                //만약 입력받은 과목의 점수가 최댓값보다 크다면
	                max = subject[i];
	                // 그 값을 최댓값에 넣는다.
	            }
	        }
	        
	        for(int j=0; j<subject.length; j++){
	            avg += (subject[j]/max *100)/n;
	            // 반복문을 통해 
	            // 입력받은 수들의 평균값을 구한다.
	            // 입력받은 수 / 최댓값 + 100
	            // 전부를 다시 입력받은 과목의 갯수로 나눠서 
	            // 평균값을 구한다
	        }
	        System.out.println(avg);
	    }

}
