package javajungsuk;

import java.util.Scanner;

public class Back8958_2 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	         
	        String arr[] = new String[sc.nextInt()];
	         // �׽�Ʈ ���̽� �迭�� ���� 
	        for(int i=0; i<arr.length; i++){
	            arr[i] = sc.next();
	            // �ݺ����� �̿��Ͽ� �Է¹��� �׽�Ʈ ���̽� ����ŭ �迭�� ����
	            // ��, ox�� �ִ´�.
	        }
	        
	        for(int i =0; i<arr.length; i++){
	            int sum =0; // �����հ� 
	            int cnt =0; // o�� Ƚ��
	            
	            for(int j=0; j<arr[i].length(); j++){
	                
	                if(arr[i].charAt(j) == 'O'){
	                     cnt++;
	                     sum += cnt;
	                }else{
	                    cnt =0;
	                }
	            }System.out.println(sum);
	        }
	 }
	}