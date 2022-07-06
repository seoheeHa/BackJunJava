package javajungsuk;

import java.util.Scanner;

public class Back10809 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int alb[] = new int[26];
    // 알파벳은 a~z까지 총 26개이기에 배열을 선언한다.

    for(int i =0; i <alb.length; i++){
        alb[i] = -1;
        // 입력되지 않은 알파벳은 모두 -1로 초기화 한다. 
    }

    String st = sc.next();
    // 알파벳을 입력받을 문자열 변수를 선언한다. 
    
    for(int k=0; k<st.length(); k++){
        // 반복문을 통해 문자열의 각 문자를 하나하나씩 검사한다. 
        char ch = st.charAt(k);
        // charAt 메소드를 이용하여 문자열을 문자로 추출하고 변수ch에 저장한다.
        
        if(alb[ch - 'a'] == -1) {
         // 위치는 0부터 시작하기에 , ch의 문자 위치는 i가 된다.     
        // ch의 문자 위치를 alb배열의 값으로 바꿔준다.
        // ch가 가지고 있는 문자 값(아스키코드값)을 인코딩하기 위해 -97이나 -a를 해야
        // 알파벳 소문자 a가 0으로, z가 25로 인덱스가 맞춰진다.
        // 만약 인덱스에 해당하는 배열의 위치가 -1이 라면,    
         alb[ch - 'a'] = k;
            // 처음 등장한 알파벳이기에 위치값을 저장한다. 
            // 위에서 전부 -1로 초기화 했기에, 한번도 등장하지 않은 알파벳은 -1이다.
                }
    }
    
    for(int j =0; j<alb.length; j++){
        System.out.print(alb[j] + " ");
    }
     
} 

}