package javajungsuk;

public class Back15596 {
	
	long sum(int[] a) {
		// sum함수에  값을 받아 매개변수인 배열 a[] 에 값을 저장한다
		int ans = 0;
		// 변수 ans를 선언하고, 0으로 초기화 한다.
		for(int  i=0; i<a.length; i++) {
			// 반복문 실행 , 배열 a[]길이만큼 반복한다.
			ans += a[i];
			// 배열의 값을 받아 누적합을 ans에 저장한다.
		}
		return ans;
		//ans의 값을 리턴한다. 
	}
	
}
