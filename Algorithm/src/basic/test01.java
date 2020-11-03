package basic;

import java.util.Scanner;

import java.lang.*;

public class test01 {
	public static void main(String[] args) {
		// 세 값의 최댓값을 구하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("a의 값 입력"); int a = sc.nextInt();
		System.out.println("b의 값 입력"); int b = sc.nextInt();
		System.out.println("c의 값 입력"); int c = sc.nextInt();
		
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		System.out.println("최댓값은 "+max+"임");
		
	}

}
