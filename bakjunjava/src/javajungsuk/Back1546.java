package javajungsuk;

import java.util.Scanner;

public class Back1546 {


	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        // ������ ������ �Է¹޴´�.
	        float[] subject = new float[n];
	        // �Է¹��� ������ŭ ������ ������ �迭�� �����Ѵ�.
	        float max = 0;
	        // �ִ밪 ���� ����
	        float avg = 0;
	        // ��հ� ���� ���� 
	        
	        for(int i=0; i <subject.length; i++){
	            subject[i] = sc.nextInt();
	            // �Է¹��� ���� ���� �迭�� �ݺ����� ���� �����Ѵ�.
	            if(subject[i] > max){
	                //���� �Է¹��� ������ ������ �ִ񰪺��� ũ�ٸ�
	                max = subject[i];
	                // �� ���� �ִ񰪿� �ִ´�.
	            }
	        }
	        
	        for(int j=0; j<subject.length; j++){
	            avg += (subject[j]/max *100)/n;
	            // �ݺ����� ���� 
	            // �Է¹��� ������ ��հ��� ���Ѵ�.
	            // �Է¹��� �� / �ִ� + 100
	            // ���θ� �ٽ� �Է¹��� ������ ������ ������ 
	            // ��հ��� ���Ѵ�
	        }
	        System.out.println(avg);
	    }

}
