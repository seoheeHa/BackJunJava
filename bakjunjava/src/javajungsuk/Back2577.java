package javajungsuk;

import java.util.Scanner;

public class Back2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// �Է¹��� ������ a,b,c ���� ���� 
		sc.close();
		int[] count = new int[10];
		// ��½� ���ٿ� �ϳ��� �� 10���� ��µǱ� ������(0~9) -> �迭�� 0���� �����Ѵ�.
		// �迭�� ũ�⸦ 10���� ��´�.
		int sum = a * b * c; 
		//�Է¹��� ������ ���� ���� ���� sum�� �����Ѵ�. 
		while(sum>0) {
			//while�� = �ݺ��� ���� sum�� 0���� ũ�� ��� �ݺ��Ѵ�.
			count[sum%10]++;
			//sum�� 10���� ������ ������ ������, ��, �����ڸ��� ���Ѵ�.
			//�ش� �����ڸ��� ������ count�迭 �ε����� 1�� �߰��Ѵ�.
			sum = sum/10; 
			// �׷�������, sum�� 10���� �ٽ� �����༭ ���� ���Ѵ�. 
			// ��, �����ڸ��� �ϳ��� �����ش�.(����)
			// sum�� ���ڸ����� �ɶ����� �ݺ��ϰ� 
			// sum�� 0�� �Ǹ� (��, ���̻� ���� ���� ���ٸ�)
			// �ݺ����� Ż���Ѵ�.
		}
		
		for(int i=0; i <10; i++) {
			System.out.println(count[i]);
			// count�迭 0~9���� 
			// ���Ե� �ε������� �������� ����Ѵ�.
		}
	}

}
