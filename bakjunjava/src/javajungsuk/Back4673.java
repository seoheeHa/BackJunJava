package javajungsuk;

public class Back4673 {

	public static void main(String[] args) {
		boolean[]  check = new boolean[10001];
		// 1~10000배열을 만든다 
		
		for (int i =1; i<10001; i++) {
			int n = d(i);
			
			if (n <10001) {
				// 10000이 넘는 수는 필요 없다.
				check[n] = true;
				
			}
		}
	} 
	

	
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum += (number % 10); // 첫째 자리수 
			number = number/10;  // 10으로 나누어서 첫째 자리수를 없앤다
		}
		return sum;
	}
}
