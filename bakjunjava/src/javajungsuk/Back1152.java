package javajungsuk;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Back1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// ���ڿ��� �Է¹������̱� ������ scanner Ŭ������ �����Ѵ�. 
		
		String str = sc.nextLine();
		// ��ҹ��ڷ� �� ���ܾ��� ���ڿ��� �Է¹޾� ���� str�� �����Ѵ�. 
		
		sc.close();
		// ���̻� �Է¹��� ���� ���⿡ scanner Ŭ������ �ݴ´�. 
		
		StringTokenizer st = new StringTokenizer(str, " ");
		// �Էµ� ���ܾ ��������� �����Ѵ�. 
		// ��������� ������ ��ū���� ���� st�� �����Ѵ�. 
		
		System.out.println(st.countTokens());
		// ��ū�� ������ ���Ѵ� 
		
		
		
	}
}
