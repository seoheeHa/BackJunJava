package javajungsuk;

import java.util.Scanner;

public class Back2562 {

	public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int[] arr  = new int[9];// 9���� �迭 ����
        int max =0; // �ִ밪 ���� ����
        int count=0; // �ִ밪�� �迭 ���� ����
        for(int i=0; i <9; i++){ // �ݺ��� ����
            arr[i] = sc.nextInt();
            if(arr[i] > max){ //���� �Է¹޴� ���� ���� ũ�ٸ�
                max = arr[i]; // �� �Է°��� �ִ񰪿� �ִ´�
                count = i+1; // �迭�� 0���� �����ϱ⿡ 1�� �߰� 
            }
        }
       
        System.out.println(max); // �ִ� ���
        System.out.println(count); // �ִ��� ���° �迭���� ��� 
    }
}
