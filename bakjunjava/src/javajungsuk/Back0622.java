package javajungsuk;

import java.util.Arrays;
import java.util.Scanner;

public class Back0622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력받을 수 선언 
		int[] arr = new int[n]; // int형 배열 선언 입력받을 수 만큼 배열 생성 
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt(); // 배열 입력받음
			
		}
		Arrays.sort(arr); // 배열을 오름차순으로 정렬 
		// arr[0] 에 최소값이 정렬되고
		// arr[n] 에 최대값이 정렬이 된다.
		System.out.println(arr[0] + " " + arr[n-1]);
	}
}
