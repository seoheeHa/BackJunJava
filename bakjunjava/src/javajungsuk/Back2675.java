package javajungsuk;

import java.util.Scanner;

public class Back2675 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
	
		int testcase = sc.nextInt();
		// �Է¹��� �׽�Ʈ ���̽���ŭ �ݺ��Ѵ�. 
	
		for(int i=0; i<testcase; i++) {
			// �׽�Ʈ ���̽� ��ŭ �ݺ��Ѵ�. 
			int n = sc.nextInt();
			// �ݺ��� Ƚ���� �Է¹޴´�. 
			String str = sc.next();
			// ���ڿ��� �Է¹޴´�. 
			
			for(int j =0; j<str.length(); j++) {
				// ���ڿ� ���̸�ŭ �ݺ��Ѵ�. 
				for(int k=0; k<n; k++) {
					// �Է¹��� �ݺ��� Ƚ����ŭ �ش� ������ ���ڸ� �ݺ��Ѵ�. 
					System.out.print(str.charAt(j));
					// ���ڿ��� charAt���� ���ڷμ� �ɰ��� 
					// �ش� ���ڸ� �Է¹��� �ݺ�Ƚ����ŭ �ݺ��ؼ� ����Ѵ�.
					// �̶�, �ϳ��� ���ڿ��� ���� ��� ��½� ���ٿ� �������� �ؾ��ϱ⿡ 
					// println�� �ƴ� print�� ����Ѵ�. 
				}
			}
 			
			System.out.println();
			// �� ���ڿ��� ����ϴ� ���� ������ �ٹٲ��� �����Ѵ� . 
			
		}
	}
}