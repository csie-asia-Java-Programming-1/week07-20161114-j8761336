package ex;

import java.util.Scanner;

/* 請寫一個程式，用陣列儲存使用者輸入的 n 個整數，透過函式 var() 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
 * Date: 2016/11/14
 * Author: 105021026 詹佩郡
 */
public class ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b[] = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = scn.nextInt();
		}
		System.out.print(var(a, b));
	}
//	public static double var(int n, int[] x) {
//		if (n == 0) {
//			return x[0];
//		} else {
//			return x[n]+ var(n-1,x);
//		}}
	public static double var(int n,int[] x){
		int M=0;
		int sum=0;
		for(int i=0;i<n;i++){
			M +=x[i];
		}
		M=M/n;
		for(int i=0;i<n;i++){
			sum+=((x[i]-M)*(x[i]-M));
		}
		return sum;
	}

}
