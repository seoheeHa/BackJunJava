package javajungsuk;

import java.util.Scanner;

public class Back11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// scanner Ŭ���� ����, �Է¹޴´�.
		int n = sc.nextInt();
		// ������ ������ int������ �Է¹޴´�.
		String st = sc.next();
		// ������ ������ŭ ���ڵ��� �Է¹޴µ�, 
		// �̶� ���ڴ� �������� �ƴ϶� String������ �Է¹޴´�.
		sc.close();
		// �Է¹޴� Ŭ������ �ݴ´�. 
		int sum = 0;
		// int�� ���� sum�� �����ϰ� 0���� �ʱ�ȭ �Ѵ�.
		
		for(int i=0; i<n; i++) {
			// ������ ���� ����� �ݺ����� ������ ������ n����ŭ �ݺ� ���� 
			sum += st.charAt(i) - '0';
			// string�������� ���� ���ڸ� charAt�� �̿��Ͽ� char�������� �ٲ��ش�,
			// charAt()�� �̿��ϸ� String�������� ���� ���ڿ��� ���ڴ����� ��� ������ش�.
			// �ٸ�, char������ int�������� ��ȯ�ϱ� ���ؼ��� 
			// �ƽ�Ű�ڵ尪�� ����� �ϱ⿡ 
			// 0�̳� 48�� ���ش�.
		}
		
		System.out.println(sum);
	
	}
}
