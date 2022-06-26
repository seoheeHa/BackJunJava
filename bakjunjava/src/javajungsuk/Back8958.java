package javajungsuk;

import java.util.Scanner;

public class Back8958 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt(); // 테스트케이스 개수를 입력받는다.
        
        String str; // ox 문자열을 담을 String 변수를 선언 
        
        for(int i =0; i<n; i++){
         // 입력받은 테스트케이스 수인 n번만큼 반복한다. 
            str = sc.next();
            // ox를 입력받는다.
            int sum = 0; 
            // 총합계 선언
            int cnt = 0; 
            // 입력받을 문자열 'o' 의 개수 선언 
            
            for(int j=0; j<str.length(); j++){
                //ox 입력된 크기만큼 반복 
                if(str.charAt(j) == 'O'){
                    // 만약 입력 받은 문자가 o라면 
                    cnt ++; 
                    // o의 개수를 증가 
                    sum += cnt;
                    // 총합계 증가 
                }else{
                    cnt = 0;
                    // 입력 받은 문자가 x 라면 다시 cnt를 0으로 변경 
                }
                
            }
            System.out.println(sum);
            
        }
        
    }
}