package javajungsuk;

import java.util.Scanner;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n/10; // n1�� �־��� ���� ���� �ڸ��� 
        int n2 = n%10; // n2�� �־��� ���� ���� �ڸ��� 
        int n3 = 1; // ī���� ���ִ� ���� 
        int temp = n1 + n2; // temp�� �� �ڸ����� �� 
        int ans = n2 * 10 + temp; // ans�� ������� ���� ����� 
          
            while(n != ans){ // ��� �� ������� ù �Է°��� ���� ������ �ݺ��Ѵ�.
                n1 = n2; // ������� ���� �ڸ��� ��� �� ���� �ڸ��� 
                n2 = ans % 10; // ������� �����ڸ��� ���ϱ� ���� 10���� ���� �������� ���Ѵ�.
                temp = n1 + n2;
                ans = n2 * 10 + temp %10; // ���� �ڽ��� ������ ���� ����
                n3++; // �� ����Ŭ���� ��� �ݺ��� �־����� �� üũ�Ѵ�.
            }
            System.out.println(n3);
    }
}

