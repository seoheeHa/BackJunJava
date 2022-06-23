package javajungsuk;

import java.util.Scanner;

public class Back2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 입력받을 각각의 a,b,c 변수 선언 
		sc.close();
		int[] count = new int[10];
		// 출력시 한줄에 하나씩 총 10줄이 출력되기 때문에(0~9) -> 배열은 0부터 시작한다.
		// 배열의 크기를 10으로 잡는다.
		int sum = a * b * c; 
		//입력받은 수들을 곱한 값을 변수 sum에 대입한다. 
		while(sum>0) {
			//while문 = 반복문 실행 sum이 0보다 크면 계속 반복한다.
			count[sum%10]++;
			//sum을 10으로 나눠서 나오는 나머지, 즉, 일의자리를 구한다.
			//해당 일의자리가 나오면 count배열 인덱스에 1을 추가한다.
			sum = sum/10; 
			// 그런다음에, sum을 10으로 다시 나눠줘서 몫을 구한다. 
			// 즉, 일의자리를 하나씩 없애준다.(제거)
			// sum이 한자리수가 될때까지 반복하고 
			// sum이 0이 되면 (즉, 더이상 나눌 값이 없다면)
			// 반복문을 탈출한다.
		}
		
		for(int i=0; i <10; i++) {
			System.out.println(count[i]);
			// count배열 0~9까지 
			// 삽입된 인덱스값을 개행으로 출력한다.
		}
	}

}
