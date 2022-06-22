package javajungsuk;

import java.util.Scanner;

public class Back2562 {

	public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int[] arr  = new int[9];// 9개의 배열 선언
        int max =0; // 최대값 변수 선언
        int count=0; // 최대값의 배열 순서 선언
        for(int i=0; i <9; i++){ // 반복문 시행
            arr[i] = sc.nextInt();
            if(arr[i] > max){ //만약 입력받는 값이 가장 크다면
                max = arr[i]; // 그 입력값을 최댓값에 넣는다
                count = i+1; // 배열은 0부터 시작하기에 1을 추가 
            }
        }
       
        System.out.println(max); // 최댓값 출력
        System.out.println(count); // 최댓값이 몇번째 배열인지 출력 
    }
}
