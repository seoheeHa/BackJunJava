package javajungsuk;

import java.util.Scanner;

public class Back3052 {

	 public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        // ���ڸ� �Է¹޾ƾ� �ϱ⿡ 
	        // Scanner Ŭ������ ���� 
	        int[] arr= new int[10];
	        // 10���� ���� �Է¹��� ���̱� ������ 
	        // 10���� �迭�� ���� 
	        
	        int count = 0; 
	        // ���� �ٸ� ������ �� ���� ���� 
	        
	        for(int i=0; i<10; i++){
	            arr[i] = sc.nextInt() % 42;
	            //10���� ���� �Է¹ް� 42�� ���� ������ ����
	            // arr[]�迭�� �ִ´�.
	        }
	        
	        for(int i =0; i<10; i++){
	            int cnt = 0 ;// ������ ���� �����Ұ�� ���� �� ���� 
	            for(int j=i+1; j<10; j++){
	                if(arr[i] == arr[j] ){
	                    // ���࿡ 42�� ���� ������ ���� �����ϴٸ�
	                    // ��, arr[0] == arr[1]�̶�� 
	                    cnt++; 
	                    //������ ���� �������� ���� �����ش�.
	                }
	            }
	                
	                if(cnt ==0){
	                    // ���� ������ ������ ���� ���ٸ� 
	                    count++; 
	                    // ���� �ٸ� ������ ������ �����ش� 
	                }
	                
	            } 
	        System.out.println(count);
	            // ���� �ٸ� ������ ������ ����Ѵ�.
	        } 
	        //���� �޼ҵ� ���� 
	    }
	    // Ŭ���� ���� 
