package javajungsuk;

import java.util.Scanner;

public class Back1065 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(arithmetic_sequence(sc.nextInt()));
			sc.close();
	}

	private static int arithmetic_sequence(int num) { 
		// int num�� ���ڷ� �޴� arithmetic_sequence ��� �Լ� ����
		int cnt =0; 
		// �Ѽ��� ���� ��������
		if( num < 100) {
			// �Է¹޴� num�� 100���� ���� ��� 
			return num;
			// num�� return���ش�.
		}
		
		else {
			cnt =99;
			// ���࿡ �Է¹޴� ���� 100���� ũ�ٸ� 
			// �Ѽ��� ������ 99�� �ʱ�ȭ ���ְ� 
			// (��, �Ѽ��� ������ 99���� �����ϴ� ����)
			
			for(int i=100; i<=num; i++) {
				// 100���� ������ �Է¹޴� ������ �ݺ��Ͽ� �Ѽ��� ������ �����ش�.
				
				// �̶�, �ڸ����� ������ �д�
				int hun = i /100; // ���� �ڸ���(��) 
				int ten = (i/10) % 10; // ���� �ڸ���
				int one   = i %10; // ���� �ڸ��� (������)
				
				if((hun - ten ) == (ten - one)) {
					// �� �ڸ����� ������ �̷�ٸ�
					// ���������̱⿡ ������� �����ش�.
					cnt++;
					//�Ѽ��� ������ �ø���. 
				}
			}
		}
		
		
		
		return cnt;
		// �Ѽ��� ������ �����Ѵ�.
	}
}
