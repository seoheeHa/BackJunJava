package javajungsuk;

import java.util.Scanner;

public class Back8958 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt(); // �׽�Ʈ���̽� ������ �Է¹޴´�.
        
        String str; // ox ���ڿ��� ���� String ������ ���� 
        
        for(int i =0; i<n; i++){
         // �Է¹��� �׽�Ʈ���̽� ���� n����ŭ �ݺ��Ѵ�. 
            str = sc.next();
            // ox�� �Է¹޴´�.
            int sum = 0; 
            // ���հ� ����
            int cnt = 0; 
            // �Է¹��� ���ڿ� 'o' �� ���� ���� 
            
            for(int j=0; j<str.length(); j++){
                //ox �Էµ� ũ�⸸ŭ �ݺ� 
                if(str.charAt(j) == 'O'){
                    // ���� �Է� ���� ���ڰ� o��� 
                    cnt ++; 
                    // o�� ������ ���� 
                    sum += cnt;
                    // ���հ� ���� 
                }else{
                    cnt = 0;
                    // �Է� ���� ���ڰ� x ��� �ٽ� cnt�� 0���� ���� 
                }
                
            }
            System.out.println(sum);
            
        }
        
    }
}