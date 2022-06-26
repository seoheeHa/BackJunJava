package javajungsuk;

import java.util.Scanner;

public class Back8958_2 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	         
	        String arr[] = new String[sc.nextInt()];
	         // 테스트 케이스 배열을 선언 
	        for(int i=0; i<arr.length; i++){
	            arr[i] = sc.next();
	            // 반복문을 이용하여 입력받은 테스트 케이스 수만큼 배열에 삽입
	            // 즉, ox를 넣는다.
	        }
	        
	        for(int i =0; i<arr.length; i++){
	            int sum =0; // 누적합계 
	            int cnt =0; // o의 횟수
	            
	            for(int j=0; j<arr[i].length(); j++){
	                
	                if(arr[i].charAt(j) == 'O'){
	                     cnt++;
	                     sum += cnt;
	                }else{
	                    cnt =0;
	                }
	            }System.out.println(sum);
	        }
	 }
	}