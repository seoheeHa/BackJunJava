package javajungsuk;

//2022-06-22 ���� �˰��� 
import java.util.Arrays;
import java.util.Scanner;

public class Back0622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // �Է¹��� �� ���� 
		int[] arr = new int[n]; // int�� �迭 ���� �Է¹��� �� ��ŭ �迭 ���� 
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt(); // �迭 �Է¹���
			
		}
		Arrays.sort(arr); // �迭�� ������������ ���� 
		// arr[0] �� �ּҰ��� ���ĵǰ�
		// arr[n] �� �ִ밪�� ������ �ȴ�.
		System.out.println(arr[0] + " " + arr[n-1]);
	}
}
