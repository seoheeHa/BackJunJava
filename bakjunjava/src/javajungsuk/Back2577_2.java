package javajungsuk;

import java.util.Scanner;

public class Back2577_2 {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        String str = Integer.toString(sum);
          // int���� stringŸ������ ��ȯ��Ų ���� str�� ��´�.
          // ��, �Է¹��� ���� ������ ���� ���ڿ��� ����ȯ�Ѵ�.  
        sc.close();
        
        for(int i=0; i<10; i++){ 
            // ù��° for�� ���� 
            // 0~9���� ������ ���� �˻��Ѵ�.
            // 0~9���� 10�� �ݺ��ϴ� �ݺ����� �����.
            int count = 0;
            for(int j =0; j<str.length(); j++){
                // �ι�° for�� ����
                // str�� ���̸�ŭ �ݺ����� ������.
                if((str.charAt(j) - '0') == i){
                    //charAt(int idex)�� ������ ������ ���ڴ� Char���̹Ƿ� 
                    // int��ȯ�� �ƽ�Ű�ڵ�� ��ȯ�Ǳ⿡ 
                    // '0'�� ���־ ���ϴ� ���ϰ��� ��´�.
                    // �� ���ھ� �������� ���ڿ��� i(0~9)�� ���Ͽ� 
                    count++;
                    // i�� ���ٸ� count�� ������Ų��.
                }
            }
            System.out.println(count);
            // ������ ���� ����ϰ� ���� 
            // ó���� for������ ���ư� �ٽ� count�� �ʱ�ȭ�ϰ� �ݺ�
        }
    }
}