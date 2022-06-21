package javajungsuk;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            // 입력받는 값이 있는 지 확인하는 방법은 
            // hasnext(), hasnextInt()
            int a=sc.nextInt();
            int b= sc.nextInt();
            System.out.println(a+b);
        }
    }
}