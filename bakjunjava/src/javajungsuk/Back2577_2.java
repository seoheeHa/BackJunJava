package javajungsuk;

import java.util.Scanner;

public class Back2577_2 {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        String str = Integer.toString(sum);
          // int형을 string타입으로 변환시킨 다음 str에 담는다.
          // 즉, 입력받은 수를 곱해준 값을 문자열로 형변환한다.  
        sc.close();
        
        for(int i=0; i<10; i++){ 
            // 첫번째 for문 시작 
            // 0~9까지 각각의 수를 검사한다.
            // 0~9까지 10번 반복하는 반복문을 만든다.
            int count = 0;
            for(int j =0; j<str.length(); j++){
                // 두번째 for문 시작
                // str의 길이만큼 반복문을 돌린다.
                if((str.charAt(j) - '0') == i){
                    //charAt(int idex)로 추출한 숫자형 문자는 Char형이므로 
                    // int변환시 아스키코드로 변환되기에 
                    // '0'을 빼주어서 원하는 리턴값을 얻는다.
                    // 한 글자씩 나누어진 문자열과 i(0~9)를 비교하여 
                    count++;
                    // i와 같다면 count를 증가시킨다.
                }
            }
            System.out.println(count);
            // 축적된 값을 출력하고 난뒤 
            // 처음의 for문으로 돌아가 다시 count를 초기화하고 반복
        }
    }
}