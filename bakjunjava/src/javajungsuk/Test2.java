package javajungsuk;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            // �Է¹޴� ���� �ִ� �� Ȯ���ϴ� ����� 
            // hasnext(), hasnextInt()
            int a=sc.nextInt();
            int b= sc.nextInt();
            System.out.println(a+b);
        }
    }
}