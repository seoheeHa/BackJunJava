package javajungsuk;

import java.util.Scanner;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n/10; // n1은 주어진 수의 십의 자리수 
        int n2 = n%10; // n2는 주어진 수의 일의 자리수 
        int n3 = 1; // 카운팅 해주는 변수 
        int temp = n1 + n2; // temp는 각 자리수의 합 
        int ans = n2 * 10 + temp; // ans는 계산시행시 나온 결과값 
          
            while(n != ans){ // 계산 후 결과값이 첫 입력값과 같을 때까지 반복한다.
                n1 = n2; // 결과값의 십의 자리가 계산 전 일의 자리수 
                n2 = ans % 10; // 결과값의 일의자리를 구하기 위해 10으로 나눈 나머지를 구한다.
                temp = n1 + n2;
                ans = n2 * 10 + temp %10; // 각각 자신의 오른쪽 수를 결합
                n3++; // 한 사이클동안 몇번 반복이 주어지는 지 체크한다.
            }
            System.out.println(n3);
    }
}

