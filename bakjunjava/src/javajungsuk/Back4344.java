package javajungsuk;

import java.util.Scanner;

public class Back4344 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		// �׽�Ʈ ���̽��� �Է¹޴´�.
		int[] arr; 
		// ������ ���� �迭�� ���� 
		
		for(int i=0; i < c; i++) {
			
			int n = sc.nextInt();
			// �л��� �� �Է¹ޱ� 
			arr = new int[n];
			// �л�����ŭ �迭�� ����
			double sum = 0; 
			// ������ �� �հ� ���� ���� 
			
			  for(int j = 0; j<n; j++) {
				  int score = sc.nextInt();
				  // ������ �Է¹ޱ� 
				  arr[j] = score;
				  // �迭�� �Է¹��� ���� ���� 
				  sum += score;
				  // ������ �� �հ� ���� 
			  }
			  
			  double avg = (sum/n);
			  // ������ ��� = ���հ� / �л��� �� 
			  double count = 0;
			  // ����� �Ѵ� �л��� �� ���� ���� 
			  
			  for(int k =0; k < n; k++) {
				  if(arr[k] > avg) {
					  // ���� ������ ��պ��� ���ٸ� 
					  count++;
					  // ��ճѴ� �л��� ���� ������Ų��.
				  }
				  
			  }
			  
			  System.out.printf("%.3f%%\n" + (count/n) *100);
			  // �� ���̽����� ����� �Ѵ� �л��� ������ �ݿø� �Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
			  // printf("����� ���� " , ����� ����);
			  // �Ҽ��� ��°�ڸ����� ����ϱ� ���ؼ��� printf()�� ����Ͽ� %.3f���� ��������� �Ѵ�.
			  // printf���� "%" ��� ���ڸ� ����ϱ� ���ؼ��� %%�� ������� ��µȴ�. 
			  // 
		}
		
	}

}
