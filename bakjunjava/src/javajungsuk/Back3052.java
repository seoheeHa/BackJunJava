package javajungsuk;

import java.util.Scanner;

public class Back3052 {

	 public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        // 숫자를 입력받아야 하기에 
	        // Scanner 클래스를 선언 
	        int[] arr= new int[10];
	        // 10개의 수를 입력받을 것이기 때문에 
	        // 10개의 배열을 선언 
	        
	        int count = 0; 
	        // 서로 다른 나머지 수 구할 변수 
	        
	        for(int i=0; i<10; i++){
	            arr[i] = sc.nextInt() % 42;
	            //10개의 수를 입력받고 42로 나눈 나머지 값을
	            // arr[]배열에 넣는다.
	        }
	        
	        for(int i =0; i<10; i++){
	            int cnt = 0 ;// 나머지 값이 동일할경우 누적 값 변수 
	            for(int j=i+1; j<10; j++){
	                if(arr[i] == arr[j] ){
	                    // 만약에 42로 나눈 나머지 값이 동일하다면
	                    // 즉, arr[0] == arr[1]이라면 
	                    cnt++; 
	                    //동일한 값을 누적해줄 값을 더해준다.
	                }
	            }
	                
	                if(cnt ==0){
	                    // 만약 동일한 나머지 값이 없다면 
	                    count++; 
	                    // 서로 다른 나머지 갯수를 더해준다 
	                }
	                
	            } 
	        System.out.println(count);
	            // 서로 다른 나머지 갯수를 출력한다.
	        } 
	        //메인 메소드 종료 
	    }
	    // 클래스 종료 
