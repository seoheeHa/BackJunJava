package javajungsuk;

import java.util.Scanner;

public class Back10809 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int alb[] = new int[26];
    // ���ĺ��� a~z���� �� 26���̱⿡ �迭�� �����Ѵ�.

    for(int i =0; i <alb.length; i++){
        alb[i] = -1;
        // �Էµ��� ���� ���ĺ��� ��� -1�� �ʱ�ȭ �Ѵ�. 
    }

    String st = sc.next();
    // ���ĺ��� �Է¹��� ���ڿ� ������ �����Ѵ�. 
    
    for(int k=0; k<st.length(); k++){
        // �ݺ����� ���� ���ڿ��� �� ���ڸ� �ϳ��ϳ��� �˻��Ѵ�. 
        char ch = st.charAt(k);
        // charAt �޼ҵ带 �̿��Ͽ� ���ڿ��� ���ڷ� �����ϰ� ����ch�� �����Ѵ�.
        
        if(alb[ch - 'a'] == -1) {
         // ��ġ�� 0���� �����ϱ⿡ , ch�� ���� ��ġ�� i�� �ȴ�.     
        // ch�� ���� ��ġ�� alb�迭�� ������ �ٲ��ش�.
        // ch�� ������ �ִ� ���� ��(�ƽ�Ű�ڵ尪)�� ���ڵ��ϱ� ���� -97�̳� -a�� �ؾ�
        // ���ĺ� �ҹ��� a�� 0����, z�� 25�� �ε����� ��������.
        // ���� �ε����� �ش��ϴ� �迭�� ��ġ�� -1�� ���,    
         alb[ch - 'a'] = k;
            // ó�� ������ ���ĺ��̱⿡ ��ġ���� �����Ѵ�. 
            // ������ ���� -1�� �ʱ�ȭ �߱⿡, �ѹ��� �������� ���� ���ĺ��� -1�̴�.
                }
    }
    
    for(int j =0; j<alb.length; j++){
        System.out.print(alb[j] + " ");
    }
     
} 

}