package javajungsuk;

public class Back4673 {

	public static void main(String[] args) {
		boolean[]  check = new boolean[10001];
		// 1~10000�迭�� ����� 
		
		for (int i =1; i<10001; i++) {
			int n = d(i);
			
			if (n <10001) {
				// 10000�� �Ѵ� ���� �ʿ� ����.
				check[n] = true;
				
			}
		}
	} 
	

	
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum += (number % 10); // ù° �ڸ��� 
			number = number/10;  // 10���� ����� ù° �ڸ����� ���ش�
		}
		return sum;
	}
}
