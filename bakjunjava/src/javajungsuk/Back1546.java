package javajungsuk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1546 {

	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); 
		//  ������ ������ �Է¹ޱ� 
		StringTokenizer st = new StringTokenizer(br.readLine());
		// ������ �������� ���� �������� ������ �޾ƾ� �ϱ⿡ StringTokenizer Ŭ���� ���� 
		int max = 0;
		// �ִ� ���� ���� 
		double sum =0;
		// ������ �հ� ���� ���� 
		for(int i =0; i<n; i++) {
			int subject = Integer.parseInt(st.nextToken());
			// �ݺ������� ������ ������ŭ ������ ������ �Է¹ޱ� 
			
			if(subject > max) {
				max = subject;
				// �Է¹޴� ������ �������� �ִ��� ������ max�� �����ϱ� 
			
			}
			
			sum += subject;
			
		}
		
		System.out.println((sum/max) * 100 /n);
 	}
}